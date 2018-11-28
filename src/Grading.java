
public class Grading {
	public static void main(String[] args) throws GraphException {
		Graph g = new Graph();
		GradingVisitor gVisitor = new GradingVisitor();
		Vertex v = new Vertex(new StringBuffer("1"), new StringBuffer("data"));
		Vertex vv = new Vertex(new StringBuffer("2"), new StringBuffer("data"));
		
		g.addvertex(v);
		g.addvertex(vv);
		g.insertEdge(new StringBuffer("1"), new StringBuffer("2"), new StringBuffer("1"), new StringBuffer("data"), 12);
		//g.removeVertex(new StringBuffer("1"));
		System.out.println(g.opposite(new StringBuffer("1"), new StringBuffer("4"))._strUniqueID);
		g.dfs(new StringBuffer("1"), gVisitor);
		System.out.println(gVisitor._strResult);
		
		
	}

}
