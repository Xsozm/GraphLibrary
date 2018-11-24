
public class PathSegment {
	protected Vertex _vertex;
	// the vertex in this path segment
	
	protected Edge
	_edge;
	// the edge associated with this vertex
	
	public PathSegment(Vertex _vertex,Edge _edge) {
		// TODO Auto-generated constructor stub
		this._vertex=_vertex;
		this._edge=_edge;
	}
	
	public Vertex getVertex( ){
		return _vertex;
	}
	
	public Edge getEdge( ){
		return _edge;
	}

	public void set_vertex(Vertex _vertex) {
		this._vertex = _vertex;
	}

	public void set_edge(Edge _edge) {
		this._edge = _edge;
	}

}
