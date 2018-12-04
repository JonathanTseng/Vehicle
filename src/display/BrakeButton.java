package display;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import states.VehicleContext;

public class BrakeButton extends GUIButton implements EventHandler<ActionEvent> {

	public BrakeButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		VehicleContext.instance().brakeApplied();
	}
}
