package speedometer;

/**
 * An entity that can be notified of clocked speedometer events
 * 
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
 *
 */
public interface Notifiable {
	/**
	 * Process speedometer ticks
	 */
	public void speedometerTicked(int speed);

	/**
	 * Process speedometer hitting zero mps
	 */
	public void speedometerAtZero();
}