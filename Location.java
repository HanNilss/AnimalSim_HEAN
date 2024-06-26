/**
 * Location class containing coordinates for any object in a 2d plane.
 * @author Hannes Nilsson
 * @version 1.0
 * Final project
 * CS1313ON
 */
public class Location{

	/**
	 * x coordinate for object
	 * y coordinate for object
	 */
	private int xCoord;
	private int yCoord;
	/**
	 * Creates an location object with 0 set as default coordinate values.
	 * 
	 * @throws InvalidCoordinateException if either coordinate is less than 0.
	 */
	public Location() throws InvalidCoordinateException{
		super();
		setxCoord(0);
		setyCoord(0);
	}//end empty-argument constructor
	
	/**
	 * Creates a Location objects with x and y coordinates passed in as arguments. 
	 * 
	 * @throws InvalidCoordinateException if either coordinate is less than 0.
	 * @param x coordinate to be set
	 * @param y coordinate to be set
	 */
	public Location(int x, int y) throws InvalidCoordinateException{
		setxCoord(x);
		setyCoord(y);
	}//end preferred constructor
	
	/**
	 * Updates the x and y coordinates with passed in values for each coordinate.
	 * 
	 * @throws InvalidCoordinateException if either coordinate is less than 0.
	 */
	public void update(int x, int y) throws InvalidCoordinateException{
		setxCoord(x);
		setyCoord(y);
	}//end update
	
	/**
	 * @return x and y coordinates, in that order, as an array.
	 */
	public int[] getCoordinates() {
		int[] c = {getxCoord(),getyCoord()};
		return c;
	}//end getCoordinates

	/**
	 * @return the xCoord
	 */
	public int getxCoord() {
		return xCoord;
	}//end getxCoord

	/**
	 * Sets x coordinate. 
	 * 
	 * @throws InvalidCoordinateException if x coordinate is less than 0.
	 * @param xCoord the xCoord to set
	 */
	public void setxCoord(int xCoord) throws InvalidCoordinateException{
		try {
			if(xCoord<0) {
				throw new InvalidCoordinateException("X coordinate cannot be less than 0!");
			}
			else {
				this.xCoord = xCoord;
			}
		}
		catch(InvalidCoordinateException e){
			System.out.println(e.getMessage());
			this.xCoord = 0;
		}
	}//end setxCoord

	/**
	 * @return the yCoord
	 */
	public int getyCoord() {
		return yCoord;
	}//end getyCoord

	/**
	 * Sets y coordinate.
	 * 
	 * @throws InvalidCoordinateException if y coordinate is less than 0.
	 * @param yCoord the yCoord to set
	 */
	public void setyCoord(int yCoord) throws InvalidCoordinateException{
		try {
			if(yCoord<0) {
				throw new InvalidCoordinateException("Y coordinate cannot be less than 0!");
			}
			else {
				this.yCoord = yCoord;
			}
		}
		catch(InvalidCoordinateException e){
			System.out.println(e.getMessage());
			this.yCoord = 0;
		}
	}//end setyCoord
	
}//end class
