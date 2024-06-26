/**
 * Exception to be thrown when simulation ID is set to 0 o less
 * @author Hannes Nilsson
 * @version 1.0
 * Final project
 * CS1313ON
 */
@SuppressWarnings("serial")
public class InvalidSimIDException extends RuntimeException{
	/**
	 * @param message
	 */
	public InvalidSimIDException(String message) {
		super(message);
	}//end InvalidSimIDException
	
}//end class
