
public class Vertex  implements Comparable<Vertex>{
	
	protected StringBuffer _strUniqueID,_strData ;
	//a unique id identifying vertex
	//data associated with vertex
	
	
	protected int _nX ,_nY;
	//Coordinates of vertex on some
	//map. Assume 0,0 is
	//bottom left.
	
	
	public void set_nX(int _nX) {
		this._nX = _nX;
	}

	public void set_nY(int _nY) {
		this._nY = _nY;
	}

	public StringBuffer getUniqueID( ){
			return _strUniqueID;
	}
	
	public StringBuffer getData( ){
			return _strData;
	}
	
	public int getX( ){
			return _nX;
	}
	
	public int getY( ){
			return _nY;
	}
	public void set_Cordinates(int x,int y) {
		this._nX=x;
		this._nY=y;
	}
	
	public Vertex(StringBuffer _strUniqueID,StringBuffer _strData) {
		this._strUniqueID= _strUniqueID ;
		this._strData=_strData;
				
	}

	@Override
	public int compareTo(Vertex o) {
		
		return this._nX-o._nX;
	}
	

}
