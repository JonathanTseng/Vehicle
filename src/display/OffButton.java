package display;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import states.VehicleContext;

/**
 * This class implements EventHandler. The methods in this class are used to
 * create an off button for the application.
 * 
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
 *
 */
public class OffButton extends GUIButton implements EventHandler<ActionEvent> {

	/**
	 * Method used to create the off button.
	 */
	public OffButton(String string) {
		super(string);
	}

	/**
	 * Method used to handle the button clicks.
	 */
	@Override
	public void handle(ActionEvent event) {
		VehicleContext.instance().turnOff();
	}
}
