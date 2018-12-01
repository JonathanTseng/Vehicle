package states;

import display.VehicleDisplay;

/**
 * The context is an observer for the clock and stores the context info for
 * states
 *
 */
public class VehicleContext {
	private VehicleDisplay display;

	private VehicleState currentState;
	private static VehicleContext instance;

	/**
	 * Make it a singleton
	 */
	private VehicleContext() {
		instance = this;
		currentState = OffState.instance();
	}

	/**
	 * Return the instance
	 * 
	 * @return the object
	 */
	public static VehicleContext instance() {
		if (instance == null) {
			instance = new VehicleContext();
		}
		return instance;
	}

	/**
	 * The display could change. So we have to get its reference.
	 * 
	 * @param display The current display object
	 */
	public void setDisplay(VehicleDisplay display) {
		this.display = display;
	}

	/**
	 * Lets door closed state be the starting state adds the object as an observable
	 * for clock
	 */
	public void initialize() {
		instance.changeState(OffState.instance());
	}

	/**
	 * Called from the states to change the current state
	 * 
	 * @param nextState the next state
	 */
	public void changeState(VehicleState nextState) {
		currentState.leave();
		currentState = nextState;
		currentState.enter();
	}

	/**
	 * Process turn off request
	 */
	public void turnOff() {
		currentState.turnOff();
	}

	/**
	 * Process turn on request
	 */
	public void turnOn() {
		currentState.turnOn();
	}

	/**
	 * Process the change gear to park request
	 */
	public void changeGearToPark() {
		currentState.changeGearToPark();
	}

	/**
	 * Process the change gear to drive request
	 */
	public void changeGearToDrive() {
		currentState.changeGearToDrive();
	}

	/**
	 * Process brake request
	 */
	public void brakeApplied() {
		currentState.brakeApplied();
	}

	/**
	 * Process accelerator request
	 */
	public void acceleratorApplied() {
		currentState.acceleratorApplied();
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 * @param speed the speed the vehicle is moving at
	 */
	public void showVehicleSpeed(int speed) {
		display.showVehicleSpeed(speed);
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 */
	public void showVehicleOff() {
		display.showVehicleOff();
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 */
	public void showVehicleOn() {
		display.showVehicleOn();
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 */
	public void showGearInPark() {
		display.showGearInPark();
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 */
	public void showGearInDrive() {
		display.showGearInDrive();
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 */
	public void showBrakePressed() {
		display.showBrakePressed();
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 */
	public void showAcceleratorPressed() {
		display.showAcceleratorPressed();
	}

}