import display.GUIDisplay;
import display.VehicleDisplay;
import javafx.application.Application;
import states.Clock;
import states.VehicleContext;

/**
 * This class contains the main method to launch the GUI for the vehicle display
 * 
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
 *
 */
public class VehicleMain {
	/**
	 * Main method used to launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Clock.instance();
		new Thread() {
			@Override
			public void run() {
				Application.launch(GUIDisplay.class, null);
			}
		}.start();
		try {
			while (GUIDisplay.getInstance() == null) {
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
		}
		VehicleDisplay display = GUIDisplay.getInstance();
		VehicleContext.instance().setDisplay(display);
	}
}