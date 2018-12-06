package speedometer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * The speedometer sends signals back to its creator every fifth of a second and
 * a speedmeter at zero message.
 *
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
 *
 */
public class Speedometer implements PropertyChangeListener {
	protected int speed;
	protected Notifiable client;

	/**
	 * Sets up the speedometer for a certain client with an initial speed value
	 *
	 * @param client the client, a Notifiable object
	 * @param speed  the initial speed value
	 */
	public Speedometer(Notifiable client, int speed) {
		this.client = client;
		this.speed = speed;
		Clock.instance().addPropertyChangeListener(this);
	}

	/**
	 * Stops the speedometer by deleting itself from the list of observers
	 */
	public void stop() {
		Clock.instance().removePropertyChangeListener(this);
	}

	/**
	 * Returns the speed value
	 *
	 * @return the speed value on the speedometer
	 */
	public int getSpeedValue() {
		return speed;
	}

	/**
	 * Setter for the speed value
	 * 
	 * @param speed the speed value to be set
	 */
	public void setSpeedValue(int speed) {
		this.speed = speed;
	}

	/**
	 * Changing the state
	 */
	@Override
	public void propertyChange(PropertyChangeEvent arg0) {

	}
}