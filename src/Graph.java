import java.awt.Adjustable;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Graph {
	protected String name ; 
	protected String version ;	
	private HashMap<Vertex, LinkedList<Edge>> Adj ;//vertices connected 
	private LinkedList<Vertex>Vertices;
	
	
	public String getLibraryName( ){
		return name;
	}
	
	public String getLibraryVersion( ){
		return version ;
	}
	
	public void addvertex(Vertex v) throws GraphException {
		boolean found =false;
		for(Vertex vv:Adj.keySet()) {
			if(vv._strUniqueID.toString().equals(v._strUniqueID.toString()))
				found=true;
		}
		if(found) {
			throw new GraphException("This Vertex already exists ");
		}
		Adj.put(v, new LinkedList<Edge>());//insert new node with no children 
		

	}
	
	public void insertVertex(StringBuffer strUniqueID,StringBuffer strData , int x ,int y)	throws GraphException{
		Vertex v = new Vertex(strUniqueID,strData,x,y);
		boolean found =false;
		for(Vertex vv:Adj.keySet()) {
			if(vv._strUniqueID.toString().equals(v._strUniqueID.toString()))
				found=true;
		}
		if(found) {
			throw new GraphException("This Vertex already exists ");
		}


		Adj.put(v, new LinkedList<Edge>());//insert new node with no children 


		
	}
	
	public void insertEdge(StringBuffer strVertex1UniqueID,StringBuffer strVertex2UniqueID,StringBuffer strEdgeUniqueID,StringBuffer strEdgeData,int nEdgeCost ) throws GraphException{
		Vertex First=null ;
		Vertex Second=null ;
		for(Vertex v:Adj.keySet()) {

			if(v._strUniqueID.toString().equals(strVertex1UniqueID.toString())) {
				First=v;
			}
			if(v._strUniqueID.toString().equals(strVertex2UniqueID.toString())) {
				Second=v;
			}
			
		}
		if(First ==null || Second==null) {
			throw new GraphException("The Vertex Doesn't Exist");
		}

		Edge E = new Edge(strEdgeUniqueID, strEdgeData, nEdgeCost, First, Second);
		
		Adj.get(First).add(E);
		Adj.get(Second).add(E);
		
		
	}
	
	public void removeVertex(StringBuffer strVertexUniqueID) throws	GraphException{
		Vertex vertex =null;
		for(Vertex v:Adj.keySet()) {
			if(v._strUniqueID.toString().equals(strVertexUniqueID.toString())) {
				vertex = v; 
				Adj.put(v, null);
			}else {
				LinkedList<Edge>L = Adj.get(v);
				for(Edge e :L) {
					if(e.First._strUniqueID.toString().equals(strVertexUniqueID.toString()) || e.Second._strUniqueID.toString().equals(strVertexUniqueID.toString())) {
						L.remove(e);
					}
				}
			}
			if(vertex==null) {
				throw new GraphException("This is Vertex doesn't exist in the graph");
			}
			
		}
		Adj.remove(vertex);

	}
	
	
	
	public void removeEdge(StringBuffer strEdgeUniqueID) throws	GraphException{
		boolean found =false;
		for(Vertex v:Adj.keySet()) {
			LinkedList<Edge>L = Adj.get(v);
			for(Edge e :L) {
				if(e._strUniqueID.toString().equals(strEdgeUniqueID.toString())) {
					found=true;
					L.remove(e);
				}
			}

		}
		if(!found) {
			throw new GraphException("This Edge Doesn't Exist");
		}
		
	}
	
	///////////
	
	public Vector<Edge> incidentEdges(StringBuffer	strVertexUniqueID)	throws GraphException{
		Vector<Edge> Vec = new Vector<Edge>();
		LinkedList<Edge> L =null;
		for(Vertex v:Adj.keySet()) {
			if(v._strUniqueID.toString().equals(strVertexUniqueID.toString())) 
				L= Adj.get(v);
			
		}
		if(L==null) {
			throw new GraphException("This Vertex doesn't exist");
		}
		if(L!=null) {
			for(Edge e :L) {
				Vec.add(e);

			}
		}

		return Vec;
	}
	
	/////////////////////////////
	
	
	
	
	
	public Vector<Vertex> vertices()throws GraphException{
		Vector Vec = new Vector<Vertex>();
		for(Vertex v:Adj.keySet()) {
			Vec.add(v);
		}
		//no need to throw excption it will be an empty vector 
		return Vec;
	}
	//////////////////////
	
	public Vector<Edge> edges() throws GraphException{
		Vector Vec = new Vector<Edge>();
		HashSet<Edge>Set= new HashSet<Edge>();
		for(Vertex v:Adj.keySet()) {
			for(Edge e:Adj.get(v))
				Set.add(e);
		}
		
		for(Edge e:Set)
			Vec.add(e);
		//no exception needed 
		return Vec;
		
	}
	/////////////////////////////
	
	public Vertex[] endVertices(StringBuffer strEdgeUniqueID)
			throws GraphException{
		Vertex Array[]= new Vertex[2];
		for(Vertex v:Adj.keySet()) {
			for(Edge e:Adj.get(v))
				if(e._strUniqueID.toString().equals(strEdgeUniqueID.toString())) {
					Array[0]=e.First;
					Array[1]=e.Second;
					return Array;

				}
		}
		
			throw new GraphException("Edge Doesn't Exist");
	
		
	}
	//////////////////////////
	public Vertex opposite(StringBuffer strVertexUniqueID,StringBuffer strEdgeUniqueID) throws GraphException{
		Vertex vertex = null; 
		for(Vertex v:Adj.keySet()) {
			if(v._strUniqueID.toString().equals(strVertexUniqueID.toString())) {
				vertex= v ;
			for(Edge e:Adj.get(v)) {
				if(e._strUniqueID.toString().equals(strEdgeUniqueID.toString())) {
					if(e.First._strUniqueID.toString().equals(strVertexUniqueID.toString()))
						return e.Second;
					else
						return e.First;
				}
			}
		}
		}
		if(vertex==null) {
			throw new GraphException("This is Vertex doesn't exist in the graph");

		}
		throw new GraphException("This is Edge isn't connected to this vertex");

	}
	
	/////////////////////////
	private void mydfs(HashMap<Vertex, Boolean>Visited , Vertex vertex ,Visitor visitor) {
		Visited.put(vertex, true);
		visitor.visit(vertex);
		
		for(Edge e:Adj.get(vertex)) {
			Vertex v1 = e.First;
			Vertex v2 = e.Second;
			if(!v2._strUniqueID.toString().equals(vertex._strUniqueID.toString()) && !Visited.get(v2)) {
				visitor.visit(e);
				mydfs(Visited,v2,visitor);
			}
			if(!v1._strUniqueID.toString().equals(vertex._strUniqueID.toString()) && !Visited.get(v1)) {
				visitor.visit(e);
				mydfs(Visited,v1,visitor);
			}
		}
		
		
	}
	
	//visitor 
	public void dfs(StringBuffer strStartVertexUniqueID,Visitor visitor) throws GraphException{
		HashMap<Vertex, Boolean>Visited = new HashMap<Vertex,Boolean>();
		Vertex vstart = null ;
		for(Vertex v:Adj.keySet()) {
			if(v._strUniqueID.toString().equals(strStartVertexUniqueID.toString()))
			{
				vstart=v; 
			}
			Visited.put(v, false);
			
		}
		if(vstart==null) {
			throw new GraphException("The Vertex Doesn't Exist");
		}

			
		mydfs(Visited,vstart,visitor);
		
		
	}
	
	//visitor 
	public void bfs(StringBuffer strStartVertexUniqueID,Visitor visitor) throws GraphException{
		HashMap<Vertex, Boolean>Visited = new HashMap<Vertex,Boolean>();
		Vertex vstart = null ;

		for(Vertex v:Adj.keySet()) {
			if(v._strUniqueID.toString().equals(strStartVertexUniqueID.toString()))
			{
				vstart=v; 
			}
			Visited.put(v, false);
			
		}
		if(vstart==null) {
			throw new GraphException("The Vertex Doesn't Exist");
		}
		
		
		 LinkedList<Vertex> queue = new LinkedList<Vertex>(); 
		  
	        // Mark the current node as visited and enqueue it 
	        Visited.put(vstart,true); 
	        queue.add(vstart); 
            visitor.visit(vstart);

	        while (queue.size() != 0) 
	        { 
	            // Dequeue a vertex from queue and print it 
	            Vertex s = queue.poll(); 
	  
	            
	            for (Edge e :Adj.get(s)) 
	            {
	            	Vertex v1 = e.First;
	            	Vertex v2 = e.Second;
	            	if(!v2._strUniqueID.toString().equals(vstart._strUniqueID.toString()) && !Visited.get(v2)) {
	            		visitor.visit(e);
	            		visitor.visit(v2);
	            		Visited.put(v2,true);
	    				queue.add(v2);
	    				//System.out.println(v2._strUniqueID);
	            	}
	    			if(!v1._strUniqueID.toString().equals(vstart._strUniqueID.toString()) && !Visited.get(v1)) {
	    				visitor.visit(e);
	            		visitor.visit(v1);
	    				Visited.put(v1,true);
	    				queue.add(v1);
	    			}
	            } 
	        } 			
	}
	
	   private static void sortByX(ArrayList<Vertex> points) {
	        Collections.sort(points, new Comparator <Vertex> () {
	            public int compare(Vertex point1, Vertex point2) {
	                if (point1._nX < point2._nX)
	                    return -1;
	                if (point1._nX > point2._nX)
	                    return 1;
	                return 0;
	            }
	        });
	    }

	    private static void sortByY(ArrayList<Vertex> points) {
	        Collections.sort(points, new Comparator <Vertex> () {
	            public int compare(Vertex point1, Vertex point2) {
	                if (point1._nY < point2._nY)
	                    return -1;
	                if (point1._nY > point2._nY)
	                    return 1;
	                return 0;
	            }
	        });
	    }
	    
	    private  static double calDistance(Vertex v1, Vertex v2) {
	        double xdist = v2._nX - v1._nX;
	        double ydist = v2._nY - v1._nY;
	        return Math.hypot(xdist, ydist);
	    }
	    
	    private static pair divideAndConquer(ArrayList<Vertex> listofSortedX, ArrayList<Vertex> listofSortedY) {
	        int size = listofSortedX.size();
	        if (size <= 3)
	            return bruteForce(listofSortedX);

	        int index = size >>> 1;
	        ArrayList<Vertex>leftOfCenter = new ArrayList<Vertex>();
	        leftOfCenter.addAll(listofSortedX.subList(0, index));
	        //listofSortedX.subList(0, index));
	        ArrayList<Vertex>rightOfCenter = new ArrayList<Vertex> ();
	        //(listofSortedX.subList(index, size));
	        rightOfCenter.addAll(listofSortedX.subList(index, size));

	        ArrayList<Vertex>tempList= new ArrayList<Vertex>();
	        tempList.addAll(leftOfCenter);
	        
	        sortByY(tempList);

	        pair closestPair = divideAndConquer(leftOfCenter, tempList);

	        tempList.clear();

	        tempList.addAll(rightOfCenter);
	        sortByY(tempList);

	        pair closestPairRight = divideAndConquer(rightOfCenter, tempList);

	        if (closestPairRight.calDistance() < closestPair.calDistance())
	            closestPair = closestPairRight;

	        tempList.clear();

	        double shortestDistance = closestPair.calDistance();
	        double centerX = rightOfCenter.get(0)._nX;
	        for (Vertex v: listofSortedY)
	            if (Math.abs(centerX - v._nX) < shortestDistance)
	                tempList.add(v);

	        for (int i=0; i<tempList.size()-1;i++) {
	            Vertex point1 = tempList.get(i);
	            for (int j=i+1;j<tempList.size();j++) {
	                Vertex point2 = tempList.get(j);
	                if ((point2._nY - point1._nY) >= shortestDistance)
	                    break;
	                double distance = calDistance(point1, point2);
	                if (distance < closestPair.calDistance()) {
	                    closestPair = new pair(point1, point2);
	                    shortestDistance = distance;
	                }
	            }
	        }
	        return closestPair;
	    }
	    
	private static pair bruteForce(ArrayList<Vertex> listofSortedX) {
			if(listofSortedX.size()<2)
				return null;
			if(listofSortedX.size()==2)
				return new pair(listofSortedX.get(0),listofSortedX.get(1));
			pair pair1 = new pair(listofSortedX.get(0),listofSortedX.get(1));
			pair pair2 =new pair(listofSortedX.get(1),listofSortedX.get(2));
			pair pair3 = new pair(listofSortedX.get(0),listofSortedX.get(2));
			
			double d1 = pair1.calDistance();
			double d2 = pair2.calDistance();
			double d3 = pair3.calDistance();
			pair closestpair = pair1;
			double min = pair1.calDistance();
			if(d2<min) {
				closestpair=pair2;
				min=d2;
			}
			if(d3<min) {
				closestpair=pair3;
				min=d3;
			}
			return closestpair;

		
		}

	public Vertex[] closestPair() throws GraphException{
		ArrayList<Vertex> listofSortedX = new ArrayList<Vertex>();
		ArrayList<Vertex> listofSortedY = new ArrayList<Vertex>();
		for(Vertex v :Adj.keySet()) {
			listofSortedX.add(v);
			listofSortedY.add(v);
		}
		sortByX(listofSortedX);
		sortByY(listofSortedY);
        pair ans = divideAndConquer(listofSortedX, listofSortedY);
		Vertex a[]=new Vertex[2];
		a[0]=ans.v1;
		a[1]=ans.v2;
		return a;
	}
	
	public Vector<PathSegment> pathDFS(	StringBuffer strStartVertexUniqueID,StringBuffer strEndVertexUniqueID)throws GraphException{
		Vertex v1 = null; 
		Vertex v2 = null ;
		for(Vertex v:Adj.keySet()) {
			if(v._strUniqueID.toString().equals(strStartVertexUniqueID.toString()))
				v1=v;
			if(v._strUniqueID.toString().equals(strEndVertexUniqueID.toString()))
				v2=v;
		}
		Vector<PathSegment> temp = new Vector<PathSegment>();
		LinkedList<Vector<PathSegment>> ans = new LinkedList<Vector<PathSegment>> ();
		HashMap<Vertex, Boolean>Visited = new HashMap<Vertex,Boolean>();
		for(Vertex v:Adj.keySet()) {
			Visited.put(v, false);
		}
		 modifieddfs(ans,temp,Visited,v1,v2);
		 if(ans.size()==0) {
			 throw new GraphException("There is no path between the two nodes");
		 }
		 return ans.get(0);
		
	}
	
	


	private void modifieddfs(LinkedList<Vector<PathSegment>> ans, Vector<PathSegment> temp,
			HashMap<Vertex, Boolean> visited, Vertex v1, Vertex destination) {
			visited.put(v1, true);
			if(v1._strUniqueID==destination._strUniqueID) {
				PathSegment ps = new PathSegment(destination, null);
				Vector<PathSegment> newvec = new Vector<PathSegment>();
				temp.add(ps);
				newvec.addAll(temp);
				ans.add(newvec);
				return ;
			}
			for(Edge e :Adj.get(v1)) {
				PathSegment ps = new PathSegment(v1,e);
				Vertex v2 =null ;
				if(v1._strUniqueID!=e.First._strUniqueID)
					v2=e.First;
				else
					v2=e.Second;
				if(!visited.get(v2)) {
				temp.add(ps);
				modifieddfs(ans, temp, visited, v2, destination);
				temp.remove(ps);
				visited.put(v1, false);
				}
				
			}
			
		
	}
	
	public Vector<PathSegment> minSpanningTree() throws GraphException{

       int size = this.vertices().size();
       StringBuffer[]arr = new StringBuffer[size];
       int i=0;
       for(Vertex v:this.vertices()) {
    	   arr[i++]=v._strUniqueID;
       }
       
       Vector<Edge> Edges = this.edges();
  
      
        Collections.sort(Edges); 
//        System.out.println(Edges.get(0)._nEdgeCost);
//        System.out.println(Edges.get(1)._nEdgeCost);
//
//  

       Vector<PathSegment> ans = new Vector<PathSegment>();
       DisjointUnionSets DJ =new DisjointUnionSets(arr);
        for(Edge edge:Edges) 
        { 
           Vertex v1 =edge.First;
           Vertex v2 =edge.Second;

           
           StringBuffer x = DJ.find(v1._strUniqueID); 
           StringBuffer y = DJ.find(v2._strUniqueID); 
  
            //no cycle
            if (!x.toString().equals(y)) 
            { 
                ans.add(new PathSegment(null, edge)) ;
                DJ.union(x, y);
            } 
            // Else discard the next_edge 
        } 
        for(PathSegment ps :ans)
        	System.out.println(ps._edge._strUniqueID);
        return ans;

	}


	public Vector<Vector<PathSegment>> findShortestPathBF(StringBuffer strStartVertexUniqueID) throws GraphException{
		 int V = this.vertices().size();
		 int  E = this.edges().size(); 
	     HashMap<StringBuffer,Integer> dist = new HashMap<>();
	     HashMap<Vertex,Vertex>Parent = new HashMap<>();
	     
	     Vertex ans = null;
	     for(Vertex v :this.vertices())
	    	  if(v._strUniqueID.toString().equals(strStartVertexUniqueID.toString())) {
	    		  ans=v;
	    	  }
	     if(ans==null)
	    	 throw new GraphException("Vertex is not found");
	     for(Edge e :this.edges()) {
	    	 if(e._nEdgeCost<0) {
	               	throw new GraphException("Can't solve this with Negative Cycles");
	                
	    	 }
	     }
	     
	        for (Vertex v :this.vertices()) 
	            dist.put(v._strUniqueID,Integer.MAX_VALUE); 
	       dist.put(ans._strUniqueID, 0);
	       Parent.put(ans, ans);
	      
	      //relaxing  
	        for (int i=1; i<V; ++i) 
	        { 
	            for (Edge e :this.edges()) 
	            { 
	                StringBuffer u = e.First._strUniqueID;
	                StringBuffer v = e.Second._strUniqueID;
	                int weight = e._nEdgeCost;
	                
	                if (dist.get(u)!=Integer.MAX_VALUE && dist.get(u)+weight<dist.get(v)) {
	                    dist.put(v, dist.get(u)+weight);
	                    Parent.put(e.Second,e.First);
	                }
	                 v = e.First._strUniqueID;
	                 u = e.Second._strUniqueID;
	                 if (dist.get(u)!=Integer.MAX_VALUE && dist.get(u)+weight<dist.get(v)) { 
		                    dist.put(v, dist.get(u)+weight); 
		                    Parent.put(e.First,e.Second);

	                 }

	              
	            } 
	          
	             
	        } 
	        
	        Vector<Vector<PathSegment>> ANS = new Vector<Vector<PathSegment>>();
	        Vector<Vertex> vv= this.vertices();
	        for(Vertex v :vv) {
	        	Stack<Vertex> st = new Stack();
	        	while(v!=null && !v._strUniqueID.toString().equals(strStartVertexUniqueID.toString())) {
	        		//System.out.print(v._strUniqueID+" ");
	        		st.push(v);
	        		v=Parent.get(v);
	        	}
	        	
	        	if(v==null)
	        		continue;
	        	st.push(v);
	        	Vector<PathSegment>temp = new Vector<>();
	        	while(st.size()>=2) {
	        		Vertex pop=st.pop();
	        		Vertex peek=st.peek();
	        		Edge e = get_Edge(pop,peek);
//	        		System.out.println(pop._strUniqueID+" "+peek._strUniqueID+" "+e);
	        		temp.add(new PathSegment(pop, e));
	        		//System.out.println(pop._strUniqueID+" "+peek._strUniqueID);


	        	}
	        	if(st.size()>0)
	        	temp.add(new PathSegment(st.pop(), null));
		        ANS.add(temp);
	        }
	        
	        for(Vector<PathSegment> ps:ANS) {
	        	for(PathSegment s:ps) {
	        		//System.out.println(s._edge);
	        		if(s._edge!=null)
	        		System.out.print(s._vertex._strUniqueID+" -> ");
	        		else 
		        	System.out.print(s._vertex._strUniqueID);

	        	}
	        	System.out.println();
	        }
	        
	        

	       return ANS;
	}
	
	
	public Vector<Vector<PathSegment>> findAllShortestPathsFW( ) throws GraphException {
		int INF =1000000;
		HashMap<pair, Integer> dist =new HashMap<pair, Integer>();
		HashMap<pair, pair> next =new HashMap<pair, pair>();
		Vector<Vertex> verties = this.vertices();
		
	        for (Vertex v1:verties)
		        for (Vertex v2:verties) {
		        	pair p =new pair(v1,v2);
		        	dist.put(p, INF);
		        	if(v1._strUniqueID.toString().equals(v2._strUniqueID.toString()))
	        		{	
	        			dist.put(p, 0);
	        		}
		        	//next.put(p, null);

		        }
	        
	        	
	        for (Vertex v1:verties) {
	        	for(Edge e:Adj.get(v1)) {
	        		Vertex v2 =e.Second; 
	        		if(v1._strUniqueID.toString().equals(e.Second._strUniqueID.toString()))
	        			v2=e.First;
	        		
	        		
	        		for(pair p:dist.keySet()) {
	        			if(p.v1._strUniqueID.toString().equals(v1._strUniqueID.toString()) && p.v2._strUniqueID.toString().equals(v2._strUniqueID.toString())) {
	        				dist.put(p, e._nEdgeCost);
	        				next.put( p ,new pair(v2,v2));
	        			}
	        			if(p.v2._strUniqueID.toString().equals(v1._strUniqueID.toString()) && p.v1._strUniqueID.toString().equals(v2._strUniqueID.toString())) {
	        				dist.put(p, e._nEdgeCost);
	        				next.put( p ,new pair(v1,v1));

	        			}
	        		}
	        		
	        		
	        	}
	        }
	
	 
	        for (Vertex k :verties)
	            for (Vertex i :verties)
	                for (Vertex j :verties) {
	                	int cost1=0;
                		int cost2=0;
                		int cost3=0;
                		pair save1=null;
                		pair save2=null;
	                	for(pair p:dist.keySet()) {
	                		
	                		//i to k
		        			if(p.v1._strUniqueID.toString().equals(i._strUniqueID.toString()) && p.v2._strUniqueID.toString().equals(k._strUniqueID.toString())) {
		        				cost1=dist.get(p);
		        				save2=p;
		        			}
		        			//k to j
		        			if(p.v1._strUniqueID.toString().equals(k._strUniqueID.toString()) && p.v2._strUniqueID.toString().equals(j._strUniqueID.toString())) {
		        				cost2=dist.get(p);
		        			}
		        			//i to j
		        			if(p.v1._strUniqueID.toString().equals(i._strUniqueID.toString()) && p.v2._strUniqueID.toString().equals(j._strUniqueID.toString())) {
		        				cost3=dist.get(p);
		        				save1=p;
		        			}
		        		}
	                	
	                	if(cost1+cost2 <cost3) {
//	                		System.out.print("cost "+ cost1+" "+cost2+" ");
//		                	System.out.println(save1.v1._strUniqueID+" "+save1.v2._strUniqueID +" "+save2.v1._strUniqueID+" "+save2.v2._strUniqueID+" ");

	                		dist.put(save1, cost1+cost2);
	                		next.put(save1, save2);
	                	}
	                	
	                	
	                }
	        
	        Vector<Vector<PathSegment>> ANS = new Vector<Vector<PathSegment>>();

	        for (pair p :next.keySet()) {
	            	if(p.v1._strUniqueID.toString().equals(p.v2._strUniqueID.toString()))
	            		continue;
	            	
	            	if(next.get(p)==null)
	            		continue;

	            

	            	pair current=p;
	            	Vertex source =current.v1;
	            	Vertex destination =current.v2;

	            	Stack <Vertex> st = new Stack();
	            	ArrayList<Vertex>ans = new ArrayList<>();
	            	Vector<PathSegment>temp = new Vector<>();

	            	String result =(buildpath(ans,next,p,dist));
	            	String[] IDS = result.split("\\s+");
	            	ans.add(source);
	            	for(int i=0;i<IDS.length;i+=2)
	            		{
	            			for(Vertex c :this.vertices()) {
	            				if(c._strUniqueID.toString().equals(IDS[i])) {
	            					ans.add(c);
	            				}
	            			}
	            		}

	            	
	            	for(int i=0;i<ans.size()-1;i++) {
	            		Vertex c1= ans.get(i);
	            		Vertex c2 = ans.get(i+1);
	            		Edge e = get_Edge(c1, c2);
	            		PathSegment ps = new PathSegment(c1, e);
	            		temp.add(ps);
	            	}
	            	temp.add(new PathSegment(ans.get(ans.size()-1), null));
//	            	System.out.println(" "+ next.get(p).v1._strUniqueID+"   "+next.get(p).v2._strUniqueID );
//	            	System.out.println();
////
//	            	st.push(source);//3
//	            	while(current!=null && !current.v1._strUniqueID.toString().equals(current.v2._strUniqueID.toString())) {
//	            		current=next.get(current);
//	            		Vertex r =current.v2;
//	            		current =getpair(r, destination, dist);
//	            		//System.out.println(current.v1._strUniqueID+" "+" "+current.v2._strUniqueID);
//	            		st.push(current.v1);
//
//	            		
//	            	}
//	            	
//	            	if(current==null) {
//	            		st.clear();
//	            		continue;
//	            	}else {
//	            		//st.push(source);
//
//	            	}
//	            	while(st.size()>0) {
//	            		System.out.print(st.pop()._strUniqueID+" ");
//	            	}
//	            	System.out.println();
    	
//	            	Vector<PathSegment>temp = new Vector<>();
//		        	while(st.size()>=2) {
//		        		Vertex pop=st.pop();
//		        		Vertex peek=st.peek();
//		        		Edge e = get_Edge(pop,peek);
//		        		temp.add(new PathSegment(pop, e));
//		        	}
//		        	if(st.size()>0)
//		        		temp.add(new PathSegment(st.pop(), null));
	            	//System.out.println(temp.size());
//			        
			        ANS.add(temp);
		        

	            }
	        
	        for(Vector<PathSegment> ps:ANS) {
	        	for(PathSegment s:ps) {
	        		if(s._edge!=null)
	        		System.out.print(s._vertex._strUniqueID+" -> ");
	        		else 
		        	System.out.print(s._vertex._strUniqueID+" ");

	        	}
	        	System.out.println();
	        }
	        
	        
	        

	        

	        return ANS;
	}
	
	

	private String buildpath(ArrayList<Vertex> ans, HashMap<pair, pair> next, pair p, HashMap<pair, Integer> dist) {
		if(p.v1._strUniqueID.toString().equals(p.v2._strUniqueID.toString())) {
			return p.v1._strUniqueID+" ";
		}
		Vertex source =p.v1;
		Vertex destination =p.v2;
		pair p2=next.get(p);
		Vertex r =p2.v2;
		pair p3 =getpair(r, destination, dist);
		
//		System.out.println(p.v1._strUniqueID+" "+p.v2._strUniqueID+"( "+p2.v1._strUniqueID+" "+p2.v2._strUniqueID+" )"+" ("+p3.v1._strUniqueID+" "+p3.v2._strUniqueID+"");
//		Vertex r =current.v2;
//		current =getpair(r, destination, dist);
//		//System.out.println(current.v1._strUniqueID+" "+" "+current.v2._strUniqueID);

		String ans1=buildpath(ans, next, p2, dist);
		String ans2=buildpath(ans, next, p3, dist);
		//System.out.println(ans1+" "+ans2+" "+p.v1._strUniqueID+" "+p.v2._strUniqueID);

		return ans1+" "+ans2;
		
		
	}

	private void printResult(HashMap<pair, pair> next, HashMap<pair, Integer> dist) throws GraphException {
		Vector<Vertex> vv= this.vertices();
		for (Vertex v1:vv) {
			for (Vertex v2:vv) {
				if (!v1._strUniqueID.toString().equals(v2._strUniqueID.toString())) {
					Vertex u = v1;
					Vertex v = v2;
					pair p =getpair(u,v,dist);// my pair
					if(p==null)continue;
					String path = ""+u._strUniqueID+" ";
					do {
					
						p = next.get(p);
						if(p==null)break;
						//System.out.println(p);
						path += " -> " + p.v2._strUniqueID;
					} while (p!=null && !p.v1._strUniqueID.toString().equals(p.v2._strUniqueID.toString()) && ! p.v2._strUniqueID.toString().equals(v._strUniqueID.toString()));
					System.out.println(path);
					path="";
				}
			}
		}
	}
	

	private pair getpair(Vertex u, Vertex v, HashMap<pair, Integer> dist) {
		for(pair p :dist.keySet())
			if(p.v1._strUniqueID.toString().equals(u._strUniqueID.toString())&& p.v2._strUniqueID.toString().equals(v._strUniqueID.toString()))
				return p ;
		return null;
	}

	private Edge get_Edge(Vertex pop, Vertex peek) throws GraphException {
		Edge ans = null; 
		int cost=100000;
	
		for(Edge e:this.edges()) {
//			System.out.println(e.First._strUniqueID+" "+e.Second._strUniqueID);
			//System.out.println(pop._strUniqueID+" "+peek._strUniqueID);

			if(e.First._strUniqueID.toString().equals(peek._strUniqueID.toString()) && e.Second._strUniqueID.toString().equals(pop._strUniqueID.toString())) {
				if(e._nEdgeCost<cost) {
					ans=e;
					cost=e._nEdgeCost;
				}
			}
			if(e.Second._strUniqueID.toString().equals(peek._strUniqueID.toString()) && e.First._strUniqueID.toString().equals(pop._strUniqueID.toString())) {
				if(e._nEdgeCost<cost) {
					ans=e;
					cost=e._nEdgeCost;
				}
			}
	}
		return ans;
	}

	public Graph() {
		Adj=new HashMap<Vertex, LinkedList<Edge>>();
	}
	public void show() {
		for(Vertex v:Adj.keySet()) {
			System.out.println(v._strUniqueID);
		}

	}
	public static void main(String[] args)throws GraphException {


		
	}

}
  class pair{
	 public  Vertex v1 ; 
	 public Vertex v2 ; 
	 
	 
	 public pair(Vertex v1, Vertex v2) {
		 this.v1=v1;
		 this.v2=v2;
	 }
	 
	 protected  double calDistance() {
	        double xdist = v2._nX - v1._nX;
	        double ydist = v2._nY - v1._nY;
	        return Math.hypot(xdist, ydist);
	    }
	 
	
}

