package display;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import states.VehicleContext;

/**
 * GUI to implement the VehicleDisplay interface A pretty elementary interface
 *
 */
public class GUIDisplay extends Application implements VehicleDisplay, EventHandler<ActionEvent> {
	private Button offButton;
	private Button onButton;
	private Button gearToPark;
	private Button gearToDrive;
	private Button accelerator;
	private Button brake;
	private Text vehiclePowerStatus = new Text("Vehicle is off");
	private Text speedStatus = new Text("            ");
	private Text gearStatus = new Text("Gear in park position");
	private Text pedalStatus = new Text("Brake pedal being pressed");
	private static VehicleDisplay display;

	private VehicleContext microwaveContext;

	public static VehicleDisplay getInstance() {
		return display;
	}

	/**
	 * Sets up the interface
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		microwaveContext = VehicleContext.instance();
		microwaveContext.setDisplay(this);
		display = this;

		offButton = new Button("Turn Off");
		onButton = new Button("Turn On");
		gearToPark = new Button("Park");
		gearToDrive = new Button("Drive");
		brake = new Button("Brake");
		accelerator = new Button("Accelerator");

		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.add(vehiclePowerStatus, 0, 0);
		pane.add(gearStatus, 1, 0);
		pane.add(pedalStatus, 2, 0);
		pane.add(speedStatus, 3, 0);
		pane.add(offButton, 4, 0);
		pane.add(onButton, 5, 0);
		pane.add(gearToPark, 6, 0);
		pane.add(gearToDrive, 7, 0);
		pane.add(brake, 8, 0);
		pane.add(accelerator, 9, 0);
		showVehicleOff();
		showGearInPark();
		showBrakePressed();
		showVehicleSpeed(0);
		offButton.setOnAction(this);
		onButton.setOnAction(this);
		gearToPark.setOnAction(this);
		gearToDrive.setOnAction(this);
		brake.setOnAction(this);
		accelerator.setOnAction(this);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Vehicle");
		try {
			while (microwaveContext == null) {
				Thread.sleep(1000);
			}
		} catch (Exception e) {

		}
		primaryStage.show();
		primaryStage.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST, new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent window) {
				System.exit(0);
			}
		});
	}

	/**
	 * Indicate that the vehicle is off
	 */
	@Override
	public void showVehicleOff() {
		vehiclePowerStatus.setText("Vehicle is off");
	}

	/**
	 * Indicate that the vehicle is on
	 */
	@Override
	public void showVehicleOn() {
		vehiclePowerStatus.setText("Vehicle is on");
	}

	/**
	 * Indicate that the vehicle's gear is in the park position
	 */
	@Override
	public void showGearInPark() {
		gearStatus.setText("Gear in park position");
	}

	/**
	 * Indicate that the vehicle's gear is in the drive position
	 */
	@Override
	public void showGearInDrive() {
		gearStatus.setText("Gear in drive position");
	}

	/**
	 * Indicate that the vehicle's brake pedal is being pressed
	 */
	@Override
	public void showBrakePressed() {
		pedalStatus.setText("Brake pedal being pressed");
	}

	/**
	 * Indicate that the vehicle's accelerator pedal is being pressed
	 */
	@Override
	public void showAcceleratorPressed() {
		pedalStatus.setText("Accelerator pedal being pressed");
	}

	/**
	 * Display the speed of the vehicle
	 * 
	 * @param speed the speed of the vehicle
	 */
	@Override
	public void showVehicleSpeed(int speed) {
		speedStatus.setText(" " + speed);
	}

	// re-write with sub-classes instead of conditionals
	@Override
	public void handle(ActionEvent event) {
		if (event.getSource().equals(offButton)) {
			VehicleContext.instance().turnOff();
		} else if (event.getSource().equals(onButton)) {
			VehicleContext.instance().turnOn();
		} else if (event.getSource().equals(gearToPark)) {
			VehicleContext.instance().changeGearToPark();
		} else if (event.getSource().equals(gearToDrive)) {
			VehicleContext.instance().changeGearToDrive();
		} else if (event.getSource().equals(accelerator)) {
			VehicleContext.instance().acceleratorApplied();
		} else if (event.getSource().equals(brake)) {
			VehicleContext.instance().brakeApplied();
		}

	}

}