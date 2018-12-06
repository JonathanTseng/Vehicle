package speedometer;

import java.beans.PropertyChangeEvent;

/**
 * Represents the speedometer when the vehicle is being accelerated.
 * 
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
 *
 */
public class AcceleratingSpeedometer extends Speedometer {

	/**
	 * Method used to update speedometer on the GUI.
	 * 
	 * @param client
	 * @param speed
	 */
	public AcceleratingSpeedometer(Notifiable client, int speed) {
		super(client, speed);
	}

	/**
	 * Method used to update the speed when its accelerating.
	 */
	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// timeValue += 5;
		// if (timeValue <= 0) {
		if (++speed >= 51) {
			// may not need the following call in accelerating speedometer
			client.speedometerAtZero();
			Clock.instance().removePropertyChangeListener(this);
		} else {
			client.speedometerTicked(speed);
		}
	}
}
