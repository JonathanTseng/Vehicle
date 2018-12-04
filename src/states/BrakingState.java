package states;

import speedometer.BrakingSpeedometer;
import speedometer.Notifiable;
import speedometer.Speedometer;

/**
 * Represents the braking state
 *
 */
public class BrakingState extends VehicleState implements Notifiable {
	private static BrakingState instance;
	private Speedometer speedometer;

	/**
	 * Private constructor for the singleton pattern
	 */
	private BrakingState() {
		instance = this;
	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the object
	 */
	public static BrakingState instance() {
		if (instance == null) {
			instance = new BrakingState();
		}
		return instance;
	}

	/**
	 * Change to the accelerating state
	 */
	@Override
	public void acceleratorApplied() {
		VehicleContext.instance().changeState(AcceleratingState.instance());
	}

	/**
	 * Process clock tick Generates the speedometer changes
	 */
	@Override
	public void speedometerTicked(int speedValue) {
		VehicleContext.instance().showVehicleSpeed(speedValue);
		speed = speedValue;
	}

	/**
	 * Change to the drive state after vehicle comes to a stop
	 */
	@Override
	public void speedometerAtZero() {
		VehicleContext.instance().showVehicleSpeed(0);
		VehicleContext.instance().changeState(DriveState.instance());
	}

	/**
	 * initialize the state
	 * 
	 */
	@Override
	public void enter() {
		speedometer = new BrakingSpeedometer(this, speed);
		VehicleContext.instance().showVehicleSpeed(speedometer.getSpeedValue());
		// VehicleContext.instance().showAcceleratorPressed();
	}

	@Override
	public void leave() {
		speedometer.stop();
		speedometer = null;
		// VehicleContext.instance().showBrakePressed();
	}

}