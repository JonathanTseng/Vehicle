package display;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import states.VehicleContext;

public class OffButton extends GUIButton implements EventHandler<ActionEvent> {

	public OffButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		VehicleContext.instance().turnOff();
	}
}
