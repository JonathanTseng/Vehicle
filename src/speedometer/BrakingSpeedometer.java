package speedometer;

import java.beans.PropertyChangeEvent;

/**
 * Represents the speedometer when the vehicle is braking.
 * 
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
 *
 */
public class BrakingSpeedometer extends Speedometer {

	/**
	 * Method used to update speedometer on the GUI.
	 * 
	 * @param client
	 * @param speed
	 */
	public BrakingSpeedometer(Notifiable client, int speed) {
		super(client, speed);
	}

	/**
	 * Method to update the speed when the vehicle is braking.
	 */
	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// timeValue += 5;
		// if (timeValue <= 0) {
		if (--speed <= 0) {
			client.speedometerAtZero();
			Clock.instance().removePropertyChangeListener(this);
		} else {
			client.speedometerTicked(speed);
		}
	}
}
