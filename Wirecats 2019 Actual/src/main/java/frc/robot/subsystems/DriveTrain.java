package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The robot's drivetrain
 */
public class DriveTrain extends Subsystem {
	private static DifferentialDrive drive;
	
	private WPI_TalonSRX rightFront;
	private WPI_VictorSPX rightRear;
	private WPI_TalonSRX leftFront;
	private WPI_VictorSPX leftRear;
	
	// tune these to adjust it so the joysticks act the same
	private static final double BIAS_MULTIPLIER_RIGHT = 1;
	private static final double BIAS_MULTIPLIER_LEFT = 1;
	
	private static final double BIAS_MULTIPLIER_RIGHT_SLOW  = .3;
	private static final double BIAS_MULTIPLIER_LEFT_SLOW = .3;
	
	public DriveTrain(){
		super("DriveTrain");
		
		rightFront = new WPI_TalonSRX(RobotMap.rightFrontDrive);
		rightRear = new WPI_VictorSPX(RobotMap.rightRearDrive);
		leftFront = new WPI_TalonSRX(RobotMap.leftFrontDrive);
		leftRear = new WPI_VictorSPX(RobotMap.leftRearDrive);
		SpeedControllerGroup m_left = new SpeedControllerGroup (leftFront, leftRear);
		SpeedControllerGroup m_right = new SpeedControllerGroup (rightFront, rightRear);
		
		drive = new DifferentialDrive(m_left, m_right);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}
	
	public void arcadeDrive(double x, double y){
		drive.arcadeDrive(x, y);
	}
	
	public void drive(double left, double right){
		drive.tankDrive(left * BIAS_MULTIPLIER_LEFT, right * BIAS_MULTIPLIER_RIGHT);
	}
	
	public void slowDrive(double left, double right){
		drive.tankDrive(left * BIAS_MULTIPLIER_LEFT_SLOW, right * BIAS_MULTIPLIER_RIGHT_SLOW);
	}
	
	public void stop() {
		drive.tankDrive(0, 0);
	}
}

