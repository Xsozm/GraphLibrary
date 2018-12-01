
public class Grading {
	public static void main(String[] args) throws GraphException {
		Graph g = new Graph();
		GradingVisitor gVisitor = new GradingVisitor();
		testcase1(g,gVisitor);
		
		
		
	}

	private static void testcase1(Graph g, GradingVisitor gVisitor) throws GraphException {
		Vertex v = new Vertex(new StringBuffer("1"), new StringBuffer("data"),1,4);
		Vertex vv = new Vertex(new StringBuffer("2"), new StringBuffer("data"),4,6);
		Vertex vvv = new Vertex(new StringBuffer("3"), new StringBuffer("data"),1,8);

		g.insertVertex(new StringBuffer("1"), new StringBuffer("data"),1,4);
		g.insertVertex(new StringBuffer("2"), new StringBuffer("data"),4,6);
		g.insertVertex(new StringBuffer("3"), new StringBuffer("data"),1,8);

		g.insertEdge(new StringBuffer("1"), new StringBuffer("2"), new StringBuffer("1"), new StringBuffer("data"), 12);
		//g.removeVertex(new StringBuffer("1"));
		g.bfs(new StringBuffer("1"), gVisitor);
		System.out.println(gVisitor._strResult);
		
	}

}
