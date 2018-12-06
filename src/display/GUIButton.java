package display;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 * This class implements EventHandler. The methods in this class are used to
 * create a button.
 * 
 * @author Stephen Thomas, Jose Morales, and Jonathan Tseng
 *
 */
public abstract class GUIButton extends Button implements EventHandler<ActionEvent> {

	/**
	 * Method used to create a button.
	 * 
	 * @param string
	 */
	public GUIButton(String string) {
		super(string);
		setOnAction(this);
	}

}
