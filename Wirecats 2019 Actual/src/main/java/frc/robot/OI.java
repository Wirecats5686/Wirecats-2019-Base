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
	
	// defining actions that will be commnaded by joysticks
	Joystick left;
	Joystick right;
	Joystick gamepad;
	
	JoystickButton hatchGrab;
	JoystickButton hatchRelease;
	JoystickButton cargoIntake;
	JoystickButton frontCamera;
	JoystickButton backCamera;

	// For "shooting" cargo into Cargo Ship
	Trigger lowCargoShoot;
	// For "shooting" cargo into Rocket
	Trigger highCargoShoot;

	Trigger armUp;
	Trigger armDown;

	JoystickButton tankDrive;
	JoystickButton tankDrive2;
	JoystickButton tankDrive3;
	JoystickButton tankDrive4;
	
	JoystickButton slowDrive;
	JoystickButton slowDrive2;

	// TODO: Confirm gamepad mapping for climber
	JoystickButton climb;
	
	public OI(){
		// init joysticks
		left = new Joystick(0);
		right = new Joystick(1);
		gamepad = new Joystick(2); // USB Logitech controller
		
		// set up buttons here	
		hatchGrab = new JoystickButton(gamepad, GamepadButtonMap.aButton);
		hatchRelease = new JoystickButton(gamepad, GamepadButtonMap.rightShoulder);
		cargoIntake = new JoystickButton(gamepad, GamepadButtonMap.yButton);
		climb = new JoystickButton(gamepad, GamepadButtonMap.leftShoulder);
		//TODO check with hannah on button specifics
		frontCamera = new JoystickButton(gamepad, GamepadButtonMap.bButton);
		backCamera = new JoystickButton(gamepad, GamepadButtonMap. xButton);

		// Right trigger button = high cargo shoot (Rocket cargo)
		// Note that button mapping for triggers will occur in corresponding trigger class
		highCargoShoot = new HighShootTrigger(); 

		// Left trigger button -> low cargo shoot (Cargo Ship cargo)
		lowCargoShoot = new LowShootTrigger();

		armUp = new ArmUp();
		armDown = new ArmDown();

		tankDrive = new JoystickButton(left, 9);
		tankDrive2 = new JoystickButton(right, 9);
		tankDrive3 = new JoystickButton(left, 4);
		tankDrive4 = new JoystickButton(right, 4);
		
		slowDrive = new JoystickButton(left, 3);
		slowDrive2 = new JoystickButton(right, 3);

		// Activate commands based on interaction with mapped button/trigger/POV
		hatchGrab.whenPressed(new HatchGrab(0.5));
		hatchRelease.whenPressed(new HatchRelease(0.5));
		cargoIntake.whileHeld(new CargoIntake());
		lowCargoShoot.whileActive(new CargoShoot(false));
		highCargoShoot.whileActive(new CargoShoot(true));
		
		
		backCamera.whenPressed(new BackCamera());
		frontCamera.whenPressed(new FrontCamera());

		armUp.whenActive(new RunArm(true));
		armDown.whenActive(new RunArm(false));

		climb.whileHeld(new Climb());

		tankDrive.whenPressed(new TankDrive());
		tankDrive2.whenPressed(new TankDrive());
		tankDrive3.whenPressed(new TankDrive());
		tankDrive4.whenPressed(new TankDrive());
		
		slowDrive.whenPressed(new SlowDrive());
		slowDrive2.whenPressed(new SlowDrive());
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

