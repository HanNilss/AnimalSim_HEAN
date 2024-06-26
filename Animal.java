/**
 * Abstract class describing an animal in an animal simulation program.
 * @author Hannes Nilsson
 * @version 1.0
 * Final project
 * CS1313ON
 */

public abstract class Animal {

	/**
	 * Simulation ID for animal
	 * Location of animal
	 * Is the animal full or not
	 * Is the animal rested or not
	 */
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	/**
	 * Creates an animal object with default values
	 * @throws InvalidCoordinateException
	 */
	public Animal() throws InvalidCoordinateException{
		super();
		this.simID = 0;
		this.setLocation(new Location(0,0));
		setFull(false);
		setRested(true);
		
	}//end empty-argument constructor
	
	/**
	 * Creates and animal object with simID and location passed in as arguments, and full and rested are default values.
	 * @param simID
	 * @param l
	 * @throws InvalidSimIDException
	 */
	public Animal(int simID,Location l) throws InvalidSimIDException{
		super();
		this.simID = simID;
		this.location = l;
		setFull(false);
		setRested(true);
	}//end preferred constructor
	
	/**
	 * @return true if animal is full and false if animal is not full
	 */
	public boolean eat() {
		boolean r;
		if(Math.random() > 0.5) {
			setFull(true);
			r = true;
		}
		else {
			setFull(false);
			r = false;
		}
		return r;
	}//end eat
	
	/**
	 * 
	 * @return true if animal is rested and false if animal is not rested
	 */
	public boolean sleep() {
		boolean r;
		if(Math.random() > 0.5) {
			setRested(true);
			r = true;
		}
		else {
			setRested(false);
			r = false;
		}
		return r;
	}//end sleep

	/**
	 * @return the simID
	 */
	public int getSimID() {
		return simID;
	}//end getSimID

	/**
	 * @param simID the simID to set
	 */
	public void setSimID(int simID) throws InvalidSimIDException{
		try {
			if(simID<1) {
				throw new InvalidSimIDException("Simulation ID cannot be less than 0!");
			}
			else {
				this.simID = simID;
			}
		}
		catch(InvalidSimIDException e){
			System.out.println(e.getMessage());
			this.simID = 1;
		}
	}//end setSimID

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}//end getLocation

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation

	/**
	 * @return the full
	 */
	public boolean isFull() {
		return full;
	}//end isFull

	/**
	 * @param full the full to set
	 */
	public void setFull(boolean full) {
		this.full = full;
	}//end setFull

	/**
	 * @return the rested
	 */
	public boolean isRested() {
		return rested;
	}//end isRested

	/**
	 * @param rested the rested to set
	 */
	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested
	
}//end class
