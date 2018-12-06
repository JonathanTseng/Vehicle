package states;

/**
 * Represents the on in park state
 *
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
 * 
 */
public class OnInParkState extends VehicleState {
	private static OnInParkState instance;

	/**
	 * Private constructor for the singleton pattern
	 */
	private OnInParkState() {
		instance = this;
	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the object
	 */
	public static OnInParkState instance() {
		if (instance == null) {
			instance = new OnInParkState();
		}
		return instance;
	}

	/**
	 * Change to the off state
	 */
	@Override
	public void turnOff() {
		VehicleContext.instance().changeState(OffState.instance());
	}

	/**
	 * Change to the drive state
	 */
	@Override
	public void changeGearToDrive() {
		VehicleContext.instance().changeState(DriveState.instance());
	}

	/**
	 * initialize the state
	 * 
	 */
	@Override
	public void enter() {
		VehicleContext.instance().showGearInPark();
	}

	/**
	 * Leaving the state.
	 * 
	 */
	@Override
	public void leave() {

	}

}