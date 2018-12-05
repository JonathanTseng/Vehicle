package speedometer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * The timer allows a certain time period to be set when created. It sends
 * signals back to its creator every second and a timer runs out message when
 * the time period has elapsed.
 *
 * @author Stephen Thomas
 *
 */
public class Speedometer implements PropertyChangeListener {
	protected int speed;
	protected Notifiable client;

	/**
	 * Sets up the speedometer for a certain client with an initial speed value
	 *
	 * @param client    the client, a Notifiable object
	 * @param timeValue the initial time value after which the timer runs out of
	 *                  time.
	 */
	public Speedometer(Notifiable client, int speed) {
		this.client = client;
		this.speed = speed;
		Clock.instance().addPropertyChangeListener(this);
	}

	// may not be needed
	/**
	 * The timer value could be changed using this method.
	 *
	 * @param value the increment (could be negative) for the time value.
	 */
	// public void addTimeValue(int value) {
	// speed += value;
	// }

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

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		/*
		 * timeValue += 5; // if (timeValue <= 0) { if (++speed >= 51) { // change
		 * client.speedometerAtZero();
		 * Clock.instance().removePropertyChangeListener(this); } else {
		 * client.speedometerTicked(speed); }
		 */
	}
}