/**
 * 
 */
package ShortestPath;

import java.util.Comparator;

/**
 * @author ArunMannuru
 *
 */
public class Point implements Comparable<Point>{
	    
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
	    
	    public Point(int x, int y){
	      this.x = x;
	      this.y = y;
	    }
	    
	    public double DistanceToOrigin(){
	      return Math.pow(x, 2) + Math.pow(y, 2);
	    }
	    @Override
		public int compareTo(Point b) {
			// TODO Auto-generated method stub
	    	double Tdto = this.DistanceToOrigin();
	    	double Bdto = b.DistanceToOrigin();
	    	return 0;
		}
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return String.format("({0,2}, {1,2}) [{2,2}]", this.x, this.y, this.DistanceToOrigin());
	    }
		
}
