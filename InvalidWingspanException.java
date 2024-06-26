/**
 * Exception to be thrown when wingspan is now between 5.0 and 11.0 cm
 * @author Hannes Nilsson
 * @version 1.0
 * Final project
 * CS1313ON
 */
@SuppressWarnings("serial")
public class InvalidWingspanException extends RuntimeException{
	
	/**
	 * @param message
	 */
	public InvalidWingspanException(String message) {
		super(message);
	}//end invalidWingspanException
	
}//end class
