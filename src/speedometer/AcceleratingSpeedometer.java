package speedometer;

import java.beans.PropertyChangeEvent;

public class AcceleratingSpeedometer extends Speedometer {

	public AcceleratingSpeedometer(Notifiable client, int speed) {
		super(client, speed);
	}

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
