package states;

/**
 * Represents the braking state
 *
 */
public class BrakingState extends VehicleState {
	private static BrakingState instance;

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

	// not yet complete need to implement the braking process
	/**
	 * Change to the drive state after vehicle comes to a stop
	 */
	@Override
	public void vehicleStopped() {
		VehicleContext.instance().changeState(DriveState.instance());
	}

	/**
	 * initialize the state
	 * 
	 */
	@Override
	public void enter() {
		// VehicleContext.instance().showAcceleratorPressed();
	}

	@Override
	public void leave() {
		// VehicleContext.instance().showBrakePressed();
	}

}