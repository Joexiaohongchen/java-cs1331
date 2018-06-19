/**
 * A custom unchecked exception which will bethrown
 * when a tired Athlete’s train() is called.
 * @author Xiaohong chen
 * @version 1
 */
public class OvertrainedAthleteException extends RuntimeException {
/**
 * A custom unchecked exception which will be thrown
 * when a tired Athlete’s train() is called.
 * @param message String as a parameter and invoke the
 * constructor in the super class that also accepts a String as a parameter
 */
    public OvertrainedAthleteException(String message) {
        super(message);
    }
}