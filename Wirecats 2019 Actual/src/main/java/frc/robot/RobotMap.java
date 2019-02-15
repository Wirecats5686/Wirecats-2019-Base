package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// TODO: Finalize IDs
	// Drive train CAN IDs [IDs need to be updated]
	public static int rightFrontDrive = 2;
	public static int rightRearDrive = 1;
	public static int leftFrontDrive = 3;
	public static int leftRearDrive = 4;
    
	// Cargo CAN IDs [IDs need to be updated]
	public static int cargoIntake = 6;
	public static int cargoShoot = 7;

	// Arm CAN IDs [IDs need to be updated]
	public static int armUpInputChannel = 8;
	public static int armDownInputChannel = 9;
	public static int armMotorAPort = 10;
	public static int armMotorBPort = 11;

	// Solenoid channels
	public static int hatchForwardChannel = 5;
	public static int hatchReverseChannel = 4;
	//Add values for climber solenoids
	}
