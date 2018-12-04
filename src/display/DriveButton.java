package display;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import states.VehicleContext;

public class DriveButton extends GUIButton implements EventHandler<ActionEvent> {

	public DriveButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		VehicleContext.instance().changeGearToDrive();
	}
}
