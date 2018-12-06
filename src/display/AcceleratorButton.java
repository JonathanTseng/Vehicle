package display;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import states.VehicleContext;

/**
 * This class implements EventHandler. The methods in this class are used to
 * create the accelerator button for the application.
 * 
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
 *
 */
public class AcceleratorButton extends GUIButton implements EventHandler<ActionEvent> {

	/**
	 * Method used to create an accelerator button
	 * 
	 * @param string
	 */
	public AcceleratorButton(String string) {
		super(string);
	}

	/**
	 * Method used to handle button clicks.
	 * 
	 */
	@Override
	public void handle(ActionEvent event) {
		VehicleContext.instance().acceleratorApplied();
	}
}
