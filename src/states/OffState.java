package states;

/**
 * Represents the off state
 * 
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
 *
 */
public class OffState extends VehicleState {
	private static OffState instance;

	/**
	 * Private constructor for the singleton pattern
	 */
	private OffState() {
		instance = this;
	}

	/**
	 * For the singleton pattern
	 * 
	 * @return the object
	 */
	public static OffState instance() {
		if (instance == null) {
			instance = new OffState();
		}
		return instance;
	}

	/**
	 * Used to change the state of the vehicle to on.
	 * 
	 */
	@Override
	public void turnOn() {
		VehicleContext.instance().changeState(OnInParkState.instance());
	}

	/**
	 * initialize the state
	 * 
	 */
	@Override
	public void enter() {
		VehicleContext.instance().showVehicleOff();
	}

	/**
	 * Leaving the state and showing the vehicle is on.
	 * 
	 */
	@Override
	public void leave() {
		VehicleContext.instance().showVehicleOn();
	}

}