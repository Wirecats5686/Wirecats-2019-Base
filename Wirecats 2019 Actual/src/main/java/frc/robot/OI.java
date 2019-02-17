package frc.robot;

import frc.robot.commands.*;
import frc.robot.triggers.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);\
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.
	
	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released  and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	// Objects for Logitech joysticks & controller
	Joystick left;
	Joystick right;
	Joystick gamepad;
	
	// For grabbing hatch panel
	JoystickButton hatchGrab;

	// For releasing hatch panel
	JoystickButton hatchRelease;

	// For intaking cargo into the robot
	JoystickButton cargoIntake;

	// For switching between cameras
	JoystickButton camera;

	// For shooting cargo into Cargo Ship
	Trigger lowCargoShoot;

	// For shooting cargo into Rocket
	Trigger highCargoShoot;

	// For spitting/re-intaking cargo
	JoystickButton cargoSpit;

	// For moving arm up
	Trigger armUp;

	// For moving arm down
	Trigger armDown;

	// For activating/deactivating climb mechanisms
	JoystickButton frontClimbUp;
	JoystickButton frontClimbDown;
	JoystickButton backClimbUp;
	JoystickButton backClimbDown;
	
	public OI(){
		// Create objects for the two joysticks and Logitech controller
		left = new Joystick(0);
		right = new Joystick(1);
		gamepad = new Joystick(2);
		
		// Set hatch grab button & command
		hatchGrab = new JoystickButton(gamepad, GamepadButtonMap.rightShoulder);
		hatchGrab.whenPressed(new HatchGrab(0.5));

		// Set hatch release button & command 
		hatchRelease = new JoystickButton(gamepad, GamepadButtonMap.leftShoulder);
		hatchRelease.whenPressed(new HatchRelease(0.5));

		// Set up cargo intake button & command
		cargoIntake = new JoystickButton(gamepad, GamepadButtonMap.yButton);
		cargoIntake.whileHeld(new CargoIntake());

		// Set up high cargo shoot trigger and command (for Cargo Ship)
		highCargoShoot = new HighShootTrigger(gamepad); 
		highCargoShoot.whileActive(new CargoShoot(true));

		// Set up low cargo shoot trigger and command (for Rocket)
		lowCargoShoot = new LowShootTrigger(gamepad);
		lowCargoShoot.whileActive(new CargoShoot(false));

		// Set up cargo spit button and command
		cargoSpit = new JoystickButton(gamepad, GamepadButtonMap.aButton);
		cargoSpit.whileHeld(new CargoSpit());

		// Set trigger and command for moving arm up
		armUp = new ArmUp(gamepad);
		armUp.whileActive(new RunArm(true));

		// Set trigger and command for moving arm down
		armDown = new ArmDown(gamepad);
		armDown.whileActive(new RunArm(false));

		// Set up button & command to swtich between cameras
		camera = new JoystickButton(gamepad, GamepadButtonMap.xButton);
		Camera cameraCommand = new Camera();
		camera.whenPressed(cameraCommand);

		// Set up front climb buttons & commands
		frontClimbDown = new JoystickButton(right,JoystickButtonMap.button2);
		frontClimbUp = new JoystickButton(right, JoystickButtonMap.button3);
		frontClimbDown.whenPressed(new FrontClimbDown());
		frontClimbUp.whenPressed(new FrontClimbUp());

		// Set up back climb buttons & commands
		backClimbDown = new JoystickButton(left,JoystickButtonMap.button2);
		backClimbUp = new JoystickButton(left, JoystickButtonMap.button3);
		backClimbDown.whenPressed(new BackClimbDown());
		backClimbUp.whenPressed(new BackClimbUp());
	}
	
	public Joystick getLeft(){
		return left;
	}
	
	public Joystick getRight(){
		return right;
	}
	
	public Joystick getGamepad(){
		return gamepad;
	}
}

