package speedometer;

import java.beans.PropertyChangeEvent;

public class BrakingSpeedometer extends Speedometer {

	public BrakingSpeedometer(Notifiable client, int speed) {
		super(client, speed);
	}

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
