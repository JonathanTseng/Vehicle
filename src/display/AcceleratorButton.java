package display;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import states.VehicleContext;

public class AcceleratorButton extends GUIButton implements EventHandler<ActionEvent> {

	public AcceleratorButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		VehicleContext.instance().acceleratorApplied();
	}
}
