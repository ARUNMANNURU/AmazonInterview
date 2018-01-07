/**
 * 
 */
package ShortestPath;

/**
 * @author ArunMannuru
 *
 */
public class PointEqualityComparer extends Point{

	public PointEqualityComparer(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public boolean equals(Point a,Point b) {
		// TODO Auto-generated method stub
		return a.getX() == b.getX() && a.getY() == b.getY();
	}
    
    public int getHashCode(Point p)
    {
      int hashcode = 23;
      hashcode = (hashcode * 37) + p.getX();
      hashcode = (hashcode * 37) + p.getY();
      return hashcode;
    }
	
	
}
