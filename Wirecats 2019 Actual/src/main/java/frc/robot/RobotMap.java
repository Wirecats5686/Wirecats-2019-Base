package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// Drive train CAN IDs [IDs need to be updated]
	public static int rightFrontDrive = 4;
	public static int rightRearDrive = 7;
	public static int leftFrontDrive = 5;
	public static int leftRearDrive = 6;
    
	// Cargo CAN IDs [IDs need to be updated]
	public static int cargoIntake = 1;
	public static int cargoShoot = 2;

	// Arm CAN IDs [IDs need to be updated]
	public static int arm = 3;

	}
