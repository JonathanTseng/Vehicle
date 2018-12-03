package states;

/**
 * Super class for all states
 *
 */
public abstract class VehicleState {
	protected static int speed;

	/**
	 * Initializes the state
	 */
	public abstract void enter();

	/**
	 * Performs any necessary clean up while leaving the state
	 */
	public abstract void leave();

	/**
	 * Specifies the actions to be taken when the Off button is pressed.
	 */
	public void turnOff() {

	}

	/**
	 * Specifies the actions to be taken when the On button is pressed.
	 */
	public void turnOn() {

	}

	/**
	 * Specifies the actions to be taken when the Park button is pressed.
	 */
	public void changeGearToPark() {

	}

	/**
	 * Specifies the actions to be taken when the Drive button is pressed.
	 */
	public void changeGearToDrive() {

	}

	/**
	 * Specifies the actions to be taken when the Brake button is pressed.
	 */
	public void brakeApplied() {

	}

	/**
	 * Specifies the actions to be taken when the Accelerator button is pressed.
	 */
	public void acceleratorApplied() {

	}

	// May need to update to satisfy mps limits
	/**
	 * Process clock tick Generates the timer runs out event
	 */
	public void speedometerTicked(int speed) {

	}

	// May need to update to when car comes to stop after braking
	/**
	 * Process clock ticks Generates the timer runs out event
	 */
	public void speedometerAtZero() {

	}

}