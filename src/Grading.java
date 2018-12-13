
public class Grading {
	public static void main(String[] args) throws GraphException {
		Graph g = new Graph();
		GradingVisitor gVisitor = new GradingVisitor();
		testcase1(g,gVisitor);
		
		
		
	}

	private static void testcase1(Graph g, GradingVisitor gVisitor) throws GraphException {
		

		g.insertVertex(new StringBuffer("1"), new StringBuffer("data"),1,4);
		g.insertVertex(new StringBuffer("2"), new StringBuffer("data"),4,6);
		g.insertVertex(new StringBuffer("3"), new StringBuffer("data"),1,8);
		g.insertVertex(new StringBuffer("4"), new StringBuffer("data"),1,8);
		g.insertVertex(new StringBuffer("5"), new StringBuffer("data"),1,8);
		g.insertVertex(new StringBuffer("6"), new StringBuffer("data"),1,8);

		g.insertEdge(new StringBuffer("1"), new StringBuffer("3"), new StringBuffer("5"), new StringBuffer("data"), 17);
		g.insertEdge(new StringBuffer("3"), new StringBuffer("4"), new StringBuffer("6"), new StringBuffer("data"), 200);
		g.insertEdge(new StringBuffer("4"), new StringBuffer("1"), new StringBuffer("3"), new StringBuffer("data"), 12);
		g.insertEdge(new StringBuffer("1"), new StringBuffer("2"), new StringBuffer("2"), new StringBuffer("data"), 152);
		g.insertEdge(new StringBuffer("3"), new StringBuffer("2"), new StringBuffer("10"), new StringBuffer("data"), 1000);
//		g.insertEdge(new StringBuffer("5"), new StringBuffer("2"), new StringBuffer("10"), new StringBuffer("data"), 62);

//		//g.removeVertex(new StringBuffer("1"));
		//g.bfs(new StringBuffer("1"), gVisitor);
		//System.out.println(gVisitor._strResult);
		//System.out.println(g.findShortestPathBF(new StringBuffer("2")));
		//System.out.println(g.findAllShortestPathsFW());
//		System.out.println(g.findShortestPathBF(new StringBuffer("3")));
		System.out.println(g.minSpanningTree());

		
	}

}
