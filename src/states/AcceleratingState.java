package states;

/**
 * Represents the accelerating state
 *
 */
public class AcceleratingState extends VehicleState {
	private static AcceleratingState instance;

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
	 * initialize the state
	 * 
	 */
	@Override
	public void enter() {
		VehicleContext.instance().showAcceleratorPressed();
	}

	@Override
	public void leave() {
		VehicleContext.instance().showBrakePressed();
	}

}