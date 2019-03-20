package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Subystem class for DriveTrain of robot - used to drive Robot
 */
public class DriveTrain extends Subsystem {
	// Drive platform used in robot
	private static DifferentialDrive drive;
	
	// Speed controllers for right motors
	private WPI_TalonSRX rightFront;
	//doc oc code:
	//private WPI_VictorSPX rightRear;
	//shuri tester:
	private WPI_TalonSRX rightRear;

	// Speed controllers for left motors
	private WPI_TalonSRX leftFront;
	//doc oc
	//private WPI_VictorSPX leftRear;
	//shuri tester
	private WPI_TalonSRX leftRear;
	
	// tune these to adjust it so the joysticks act the same
	private static final double BIAS_MULTIPLIER_RIGHT = 1;
	private static final double BIAS_MULTIPLIER_LEFT = 1;
	
	/**
	 * Create new DriveTrain instance, involves: 
	 * (1) Setting up Talons & Victors
	 * (2) Creating speed controller groups
	 * (3) Setting up DifferentialDrive
	 */
	public DriveTrain(){
		super("DriveTrain");
		
		rightFront = new WPI_TalonSRX(RobotMap.rightFrontDrive);
		leftFront = new WPI_TalonSRX(RobotMap.leftFrontDrive);
		//Doc oc code:
		//rightRear = new WPI_VictorSPX(RobotMap.rightRearDrive);
		//leftRear = new WPI_VictorSPX(RobotMap.leftRearDrive);
		//shuri modified code:
		rightRear = new WPI_TalonSRX(RobotMap.rightRearDrive);
		leftRear = new WPI_TalonSRX(RobotMap.leftRearDrive);
		


		// Group right speed controllers together
		SpeedControllerGroup m_left = new SpeedControllerGroup (leftFront, leftRear);
		// Group left speed controllers together
		SpeedControllerGroup m_right = new SpeedControllerGroup (rightFront, rightRear);
		
		// Set up Differential drive using speed controller groups
		drive = new DifferentialDrive(m_left, m_right);
	}
	
	/**
	 * Have robot start in TankDrive mode
	 */
	public void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}
	
	/**
	 * Have the robot drive with speed and direction based on left and right values passed in
	 * @param left
	 * @param right
	 */
	public void drive(double left, double right){
		drive.tankDrive(left * BIAS_MULTIPLIER_LEFT, right * BIAS_MULTIPLIER_RIGHT);
	}
	
	/**
	 * Stop the robot by setting speed to 0
	 */
	public void stop() {
		drive.tankDrive(0, 0);
	}
}
