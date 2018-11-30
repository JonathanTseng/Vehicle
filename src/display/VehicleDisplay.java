package display;

/**
 * Specifies what the display system should do. Note that the implementation has
 * a lot of freedom to choose its display.
 */
public interface VehicleDisplay {
	/**
	 * Indicate that the vehicle is off
	 */
	public void showVehicleOff();

	/**
	 * Indicate that the vehicle is on
	 */
	public void showVehicleOn();

	/**
	 * Indicate that the vehicle's gear is in the park position
	 */
	public void showGearInPark();

	/**
	 * Indicate that the vehicle's gear is in the drive position
	 */
	public void showGearInDrive();

	/**
	 * Indicate that the vehicles's brake pedal is pressed
	 */
	public void showBrakePressed();

	/**
	 * Indicate that the vehicles's accelerator pedal is pressed
	 */
	public void showAcceleratorPressed();

	/**
	 * Displays the speed of the vehicle
	 * 
	 * @param speed speed in miles per second (mps)
	 */
	public void showVehicleSpeed(int speed);

}