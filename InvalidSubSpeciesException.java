/**
 * Exception to be thrown when sub-species of brownbear is invalid
 * @author Hannes Nilsson
 * @version 1.0
 * Final project
 * CS1313ON
 */
@SuppressWarnings("serial")
public class InvalidSubSpeciesException extends RuntimeException{

	/**
	 * @param message
	 */
	public InvalidSubSpeciesException(String message) {
		super(message);
	}

}
