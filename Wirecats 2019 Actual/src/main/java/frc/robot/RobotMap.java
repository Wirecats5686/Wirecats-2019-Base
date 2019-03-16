package frc.robot;

/**
 * The RobotMap is a mapping of the ports and CAN IDs to a variable;
 * This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// Drive train CAN IDs
	public static int rightFrontDrive = 2;
	public static int rightRearDrive = 1;
	public static int leftFrontDrive = 3;
	public static int leftRearDrive = 4;
    
	// Cargo CAN IDs
	public static int cargoIntake = 6;
	public static int cargoShoot = 7;

	// Arm CAN ID
	public static int armId = 5;

	// Port numbers for Hatch Solenoid channels
	public static int hatchForward = 7;
	public static int hatchReverse = 6;

	// Port numbers for climber Solenoid channels
	public static int climberBackForward = 4;
	public static int climberBackReverse = 2;
	public static int climberFrontForward = 1;
	public static int climberFrontReverse = 0;
	}
