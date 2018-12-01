package states;

/**
 * Represents the drive state
 *
 */
public class DriveState extends VehicleState {
	private static DriveState instance;

	/**
	 * Private constructor for the singleton pattern
	 */
	private DriveState() {
		instance = this;
	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the object
	 */
	public static DriveState instance() {
		if (instance == null) {
			instance = new DriveState();
		}
		return instance;
	}

	/**
	 * Change to the on in park state
	 */
	@Override
	public void changeGearToPark() {
		VehicleContext.instance().changeState(OnInParkState.instance());
	}

	/**
	 * Change to the accelerating state
	 */
	@Override
	public void acceleratorApplied() {
		VehicleContext.instance().changeState(AcceleratingState.instance());
	}

	/**
	 * initialize the state
	 * 
	 */
	@Override
	public void enter() {
		VehicleContext.instance().showGearInDrive();
	}

	@Override
	public void leave() {
		// VehicleContext.instance().showVehicleOn();
	}

}