package states;

/**
 * Super class for all states
 *
 */
public abstract class VehicleState {

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
	public void turnedOff() {

	}

	/**
	 * Specifies the actions to be taken when the On button is pressed.
	 */
	public void turnedOn() {

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
	public void timerTicked(int timeLeft) {

	}

	// May need to update to when car comes to stop after braking
	/**
	 * Process clock ticks Generates the timer runs out event
	 */
	public void timerRanOut() {

	}

}