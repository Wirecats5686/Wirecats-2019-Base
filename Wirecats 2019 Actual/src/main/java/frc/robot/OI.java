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

	// For moving arm up
	Trigger armUp;

	// For moving arm down
	Trigger armDown;

	// TODO: Confirm gamepad mapping for climber
	// For activating/deactivating climb mechanism
	JoystickButton climb;
	
	public OI(){
		// Create objects for the two joysticks and Logitech controller
		left = new Joystick(0);
		right = new Joystick(1);
		gamepad = new Joystick(2);
		
		// Set up button 	
		hatchGrab = new JoystickButton(gamepad, GamepadButtonMap.aButton);
		hatchRelease = new JoystickButton(gamepad, GamepadButtonMap.rightShoulder);
		cargoIntake = new JoystickButton(gamepad, GamepadButtonMap.yButton);
		climb = new JoystickButton(gamepad, GamepadButtonMap.leftShoulder);
		camera = new JoystickButton(gamepad, GamepadButtonMap.xButton);
	

		/**
		 * Creating triggers (Arm & Cargo shoot); mapping of triggers
		 * occurs within Trigger sub-class
		 */

		// Right trigger button = high cargo shoot (Cargo Ship cargo)
		highCargoShoot = new HighShootTrigger(gamepad); 

		// Left trigger button -> low cargo shoot (Rocket cargo)
		lowCargoShoot = new LowShootTrigger(gamepad);

		// Up button -> move arm up
		armUp = new ArmUp(gamepad);

		// Down button -> move arm down
		armDown = new ArmDown(gamepad);

		// Activate commands based on interaction with mapped button/trigger/POV
		hatchGrab.whenPressed(new HatchGrab(0.5));
		hatchRelease.whenPressed(new HatchRelease(0.5));
		cargoIntake.whileHeld(new CargoIntake());
		lowCargoShoot.whileActive(new CargoShoot(false));
		highCargoShoot.whileActive(new CargoShoot(true));
		
		// Switch between cameras when assigned button is pressed
		Camera cameraCommand = new Camera();
		camera.whenPressed(cameraCommand);
		

		armUp.whileActive(new RunArm(true));
		armDown.whileActive(new RunArm(false));

		// ADD Comments
		climb.whenPressed(new BackClimbDown());
		climb.whenPressed(new BackClimbUp());
		climb.whenPressed(new FrontClimbDown());
		climb.whenPressed(new FrontClimbUp());
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

