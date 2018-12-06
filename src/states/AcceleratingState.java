package states;

import speedometer.AcceleratingSpeedometer;
import speedometer.Notifiable;
import speedometer.Speedometer;

/**
 * Represents the accelerating state
 * 
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
 *
 */
public class AcceleratingState extends VehicleState implements Notifiable {
	private static AcceleratingState instance;
	private Speedometer speedometer;

	/**
	 * Private constructor for the singleton pattern
	 */
	private AcceleratingState() {
		instance = this;
	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the object
	 */
	public static AcceleratingState instance() {
		if (instance == null) {
			instance = new AcceleratingState();
		}
		return instance;
	}

	/**
	 * Change to the braking state
	 */
	@Override
	public void brakeApplied() {
		VehicleContext.instance().changeState(BrakingState.instance());
	}

	/**
	 * Process clock tick Generates the speedometer changes
	 */
	@Override
	public void speedometerTicked(int speedValue) {
		VehicleContext.instance().showVehicleSpeed(speedValue);
		speed = speedValue;
	}

	/*
	 * can probably delete, should not change the state at all
	 * 
	 * @Override public void speedometerAtZero() { System.out.println("Max Speed");
	 * 
	 * }
	 */

	/**
	 * initialize the state
	 * 
	 */
	@Override
	public void enter() {
		speedometer = new AcceleratingSpeedometer(this, speed);
		VehicleContext.instance().showAcceleratorPressed();
		VehicleContext.instance().showVehicleSpeed(speedometer.getSpeedValue());
	}

	/**
	 * Stopping the speemometer and updating the display.
	 */
	@Override
	public void leave() {
		speedometer.stop();
		speedometer = null;
		VehicleContext.instance().showBrakePressed();
	}

}