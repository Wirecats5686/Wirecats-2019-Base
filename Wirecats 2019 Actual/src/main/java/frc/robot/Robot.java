/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.subsystems.*;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.cscore.VideoSink;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  // Timeout for solenoids to prevent them from being on constantly
  public static final double SOLENOID_TIMEOUT = 0.25;
  
  // Create objects for each subsystem
  public static Arm arm;
  public static BackClimber backClimber;
  public static Cargo cargo;
  public static DriveTrain drivetrain;
  public static FrontClimber frontClimber;
  public static Hatch hatch;
  
  // Camera objects
  public static UsbCamera backCamera;
  public static UsbCamera frontCamera;
  public static VideoSink server;

  // Object for Compresser
  public static Compressor compressor;

  // Object for button/command mapping
	public static OI oi;

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    // Create and start compressor
    compressor = new Compressor(0);
    compressor.start ();
    
    // Set up subsystems
		drivetrain = new DriveTrain();
    hatch = new Hatch();
    cargo = new Cargo();
    frontClimber = new FrontClimber();
    backClimber = new BackClimber();
    arm = new Arm();
    
    // Create button/command mappings
		oi = new OI();
    
    // Create camera and camera server objects
    backCamera = CameraServer.getInstance().startAutomaticCapture(0);
    frontCamera = CameraServer.getInstance().startAutomaticCapture(1);
    server = CameraServer.getInstance().getServer();

    // Display video from front camera to start
    server.setSource(frontCamera);
  }


  	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	public void disabledInit(){}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to
   * the switch structure below with additional strings. If using the
   * SendableChooser make sure to add them to the chooser code above as well.
   */
  @Override
  public void autonomousInit() {
   // Not doing autonomous this year so leaving method empty
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  public void teleopInit() {
		// Don't need to do anything here
	}

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
}
