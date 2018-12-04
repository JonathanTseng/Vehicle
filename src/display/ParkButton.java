package display;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import states.VehicleContext;

public class ParkButton extends GUIButton implements EventHandler<ActionEvent> {

	public ParkButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		VehicleContext.instance().changeGearToPark();
	}
}
