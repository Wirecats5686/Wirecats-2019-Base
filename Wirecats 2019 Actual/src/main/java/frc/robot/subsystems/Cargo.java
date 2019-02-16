package frc.robot.subsystems;

import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Cargo Subsystem code that is required for CargoIntake & CargoShoot commands
 */
public class Cargo extends Subsystem{
    private WPI_TalonSRX intake;
    private WPI_TalonSRX shoot;
    
    // TODO: Finalize values
    private static final double INTAKE_SPEED = 0.5;
    private static final double ROCKET_SHOOT = 0.5;
    private static final double SHIP_SHOOT = 0.85;

    public Cargo(){
        super("Cargo");
        intake = new WPI_TalonSRX(RobotMap.cargoIntake);
        shoot = new WPI_TalonSRX(RobotMap.cargoShoot);
    }

    /**
     *  Abstract method that's required in subclass; not being used since 
	 * we don't need arm to do anything when Robot is first enabled
     */
    public void initDefaultCommand() {
		// Nothing needs to be called when we initialize this subsystem
    }
    
    /** 
     * Have robot take in Cargo
     */
    public void intakeCargo(){
        intake.set(INTAKE_SPEED);
    }

    /** 
     * Have robot shoot Cargo into a Rocket slot (low shoot)
     */
    public void shootIntoRocket(){
        shoot.set(ROCKET_SHOOT);
    }

    /** 
     * Have robot shoot Cargo into a Cargo Ship slot (high shoot)
     */
    public void shootIntoCargoShip(){
        shoot.set(SHIP_SHOOT);
    }

    public void stopIntake(){
		intake.set(0);
    }
    
    public void stopShoot(){
		shoot.set(0);
	}
}