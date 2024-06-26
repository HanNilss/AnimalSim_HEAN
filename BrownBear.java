/**
 * Brown bear subclass of animal, implements the walkable and swimmable interfaces.
 * @author Hannes Nilsson
 * @version 1.0
 * Final project
 * CS1313ON
 */
public class BrownBear extends Animal implements Walkable,Swimmable{

	private String subSpecies;
	
	public BrownBear() throws InvalidCoordinateException, InvalidSubSpeciesException {
		super();
		setSubSpecies("Alaskan");
	}//end empty-argument constructor
	
	public BrownBear(int simID,Location l, String subSpecies) throws InvalidSimIDException, InvalidSubSpeciesException {
		super(simID,l);
		setSubSpecies(subSpecies);
	}//end preferred constructor

	/**
	 * Swims 2 units in specified direction, 0 for x, 1 for y
	 */
	@Override
	public void swim(int direction) {
		
		if (direction == 0) {
			location.setxCoord(location.getxCoord()+2);
		}
		else if (direction == 1) {
			location.setyCoord(location.getyCoord()+2);
		}
		else {
			location.update(location.getxCoord(),location.getyCoord());
		}
		
	}//end swim

	/**
	 * Walks 3 units in specified direction, 0 for x, 1 for y
	 */
	@Override
	public void walk(int direction) {
		
		if (direction == 0) {
			location.setxCoord(location.getxCoord()+3);
		}
		else if (direction == 1) {
			location.setyCoord(location.getyCoord()+3);
		}
		else {
			location.update(location.getxCoord(),location.getyCoord());
		}
		
	}//end walk
	
	
	/**
	 * @return the subSpecies
	 */
	public String getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies

	/**
	 * Sets one of the following sub-species: Alaskan, Asiatic, European, Grizzly, Kodiak, Siberian.
	 * If sub-species are not one of the ones mentioned, InvalidSubSpeciesException is thrown.
	 * 
	 * @param subSpecies the subSpecies to set
	 */
	public void setSubSpecies(String subSpecies){
		try {
		switch(subSpecies) {
			case "Alaskan":
				this.subSpecies = subSpecies;
				break;
			case "Asiatic":
				this.subSpecies = subSpecies;
				break;
			case "European":
				this.subSpecies = subSpecies;
				break;
			case "Grizzly":
				this.subSpecies = subSpecies;
				break;
			case "Kodiak":
				this.subSpecies = subSpecies;
				break;
			case "Siberian":
				this.subSpecies = subSpecies;
				break;
			default:
				throw new InvalidSubSpeciesException("Invalid subspecies!");
			}
		}
		catch(InvalidSubSpeciesException e) {
			System.out.println(e.getMessage());
			}
	}//end setSubSpecies

	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + "("+location.getCoordinates()[0]+","+location.getCoordinates()[1]+")" + ", full=" + full
				+ ", rested=" + rested + "]";
	}

}//end class
