package states;

/**
 * Super class for all states
 * 
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
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

	/**
	 * Process clock tick Generates the speedometer ticked event
	 */
	public void speedometerTicked(int speed) {

	}

	/**
	 * Process clock ticks Generates the speedometer runs out event
	 */
	public void speedometerAtZero() {

	}

}