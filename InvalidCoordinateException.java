/**
 * Exception to be thrown when a coordinate is invalid (below 0)
 * @author Hannes Nilsson
 * @version 1.0
 * Final project
 * CS1313ON
 */
@SuppressWarnings("serial")
public class InvalidCoordinateException extends RuntimeException{
	/**
	 * @param message
	 */
	public InvalidCoordinateException(String message){
		super(message);
	}//end invalidCoordinateException
	
}//end class
