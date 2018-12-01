
import display.GUIDisplay;
import display.VehicleDisplay;
import javafx.application.Application;
import states.Clock;
import states.VehicleContext;

public class VehicleMain {
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