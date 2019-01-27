package frc.robot;

import frc.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

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
	
	JoystickButton tankDrive;
	JoystickButton tankDrive2;
	JoystickButton tankDrive3;
	JoystickButton tankDrive4;
	
	JoystickButton slowDrive;
	JoystickButton slowDrive2;
	
	
	public OI(){
		// init joysticks
		left = new Joystick(0);
		right = new Joystick(1);
		gamepad = new Joystick(2);
		
		// set up buttons here
		
		hatchGrab = new JoystickButton(gamepad, 6);
		hatchRelease = new JoystickButton(gamepad, 5);
		
		tankDrive = new JoystickButton(left, 9);
		tankDrive2 = new JoystickButton(right, 9);
		tankDrive3 = new JoystickButton(left, 4);
		tankDrive4 = new JoystickButton(right, 4);
		
		slowDrive = new JoystickButton(left, 3);
		slowDrive2 = new JoystickButton(right, 3);

		hatchGrab.whenPressed(new HatchGrab(0.5));
		hatchRelease.whenPressed(new HatchRelease(0.5));

		tankDrive.whenPressed(new TankDrive());
		tankDrive2.whenPressed(new TankDrive());
		tankDrive3.whenPressed(new TankDrive());
		tankDrive4.whenPressed(new TankDrive());
		
		slowDrive.whenPressed(new SlowDrive());
		slowDrive2.whenPressed(new SlowDrive());
	}
	
	public void setUpTriggers(){
		/*// intake POV controls
		intakeIn = new IntakeInPOV();
		intakeIn.whenActive(new IntakeIn());
		intakeOut = new IntakeOutPOV();
		intakeOut.whenActive(new IntakeOut());
		cancelIntake.whenActive(new IntakeOff ());*/
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

