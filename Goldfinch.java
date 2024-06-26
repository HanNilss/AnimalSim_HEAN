/**
 * Goldfinch subclass of animal, implements the Flyable and Swimmable interfaces.
 * @author Hannes Nilsson
 * @version 1.0
 * Final project
 * CS1313ON
 */
public class Goldfinch extends Animal implements Walkable, Flyable {

	/**
	 * Wingspan of goldfinch object
	 */
	private double wingSpan;
	
	/**
	 * Creates a goldfinch object with default values
	 * @throws InvalidCoordinateException
	 * @throws InvalidWingspanException
	 */
	public Goldfinch() throws InvalidCoordinateException, InvalidWingspanException{
		super();
		setWingSpan(9.0);
	}//end empty-argument constructor
	
	/**
	 * 
	 * Creates a goldfinch object with attributes passed in as arguments
	 * 
	 * @param simID
	 * @param l
	 * @param wingSpan
	 * @throws InvalidSimIDException
	 * @throws InvalidWingspanException if wingspan is not between 5.0 and 11.0 cm.
	 */
	public Goldfinch(int simID,Location l, double wingSpan) throws InvalidSimIDException, InvalidWingspanException{
		super(simID,l);
		setWingSpan(wingSpan);
	}//end preferred constructor

	/**
	 * Flies to specified location passed in as arguments.
	 */
	@Override
	public void fly(Location l) {
		
		location.update(l.getxCoord(), l.getyCoord());
		
	}//end fly

	/**
	 * Walks 1 unit in specified direction, 0 for x, 1 for y
	 */
	@Override
	public void walk(int direction) {
		
		if (direction == 0) {
			location.setxCoord(location.getxCoord()+1);
		}
		else if (direction == 1) {
			location.setyCoord(location.getyCoord()+1);
		}
		else {
			location.update(location.getxCoord(),location.getyCoord());
		}

	}//end walk
	
	/**
	 * @return the wingSpan
	 */
	public double getWingSpan() {
		return wingSpan;
	}//end getWingSpan

	/**
	 * @param wingSpan the wingSpan to set.
	 * @throws InvalidWingspanException if wingspan is not between 5.0 and 11.0 cm.
	 */
	public void setWingSpan(double wingSpan) throws InvalidWingspanException{
		try {
			if(wingSpan >= 5.0 && wingSpan <= 11.0) {
				this.wingSpan = wingSpan;
			}
			else {
				throw new InvalidWingspanException("Invalid wingspan. Must be between 5.0 and 11.0 cm!");
			}
		}
		catch(InvalidWingspanException e) {
			System.out.println(e.getMessage());
			this.wingSpan = 5.0;
		}
	}//end setWingSpan

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + "("+location.getCoordinates()[0]+","+location.getCoordinates()[1]+")" +  ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString
	
}//end class
