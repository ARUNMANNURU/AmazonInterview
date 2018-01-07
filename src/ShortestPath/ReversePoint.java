/**
 * 
 */
package ShortestPath;

/**
 * @author ArunMannuru
 *
 */
public class ReversePoint extends Point implements Comparable<T>{

	private int x;
	private int y;
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	public ReversePoint(int x, int y){
		this.x = x;
		this.y = y;
	}
    public int compareTo(Point o) {
    	double Tdto = this.DistanceToOrigin();
        double Bdto = b.DistanceToOrigin();
        
        return Bdto.CompareTo(Tdto);
    }
	
}
