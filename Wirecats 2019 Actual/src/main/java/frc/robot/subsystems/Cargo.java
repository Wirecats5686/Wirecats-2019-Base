package frc.robot.subsystems;

import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Cargo Subsystem code that is required for CargoIntake, CargoShoot, & CargoSpit commands
 */
public class Cargo extends Subsystem{
    // Speed controllers for cargo intake/shoot motors
    private WPI_TalonSRX intake;
    private WPI_TalonSRX shoot;
    
    // Speed for intaking cargo
    private static final double INTAKE_SPEED = 0.6;

    // Speed for shooting cargo into rocket
    private static final double ROCKET_SHOOT = 0.5;

    // Speed for shooting cargo into cargo ship
    private static final double SHIP_SHOOT = 0.85;

    // Speed for re-intaking/spitting cargo from top
    private static final double SPIT_INTAKE = -0.6;

    /**
     * Create a new Cargo instance, setting up talons
     */
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
		// Don't do anything
    }
    
    /** 
     * Intake cargo from ground
     */
    public void intakeCargo(){
        intake.set(INTAKE_SPEED);
    }

    /** 
     * Shoot Cargo into a Rocket slot (low shoot)
     */
    public void shootIntoRocket(){
        shoot.set(ROCKET_SHOOT);
    }

    /** 
     * Shoot Cargo into a Cargo Ship slot (high shoot)
     */
    public void shootIntoCargoShip(){
        shoot.set(SHIP_SHOOT);
    }

    /**
     * Intake cargo from top or spit it out
     */
    public void spitIntakeCargo(){
        shoot.set(SPIT_INTAKE);
    }

    /**
     * Stop intake motor by setting speed to 0
     */
    public void stopIntake(){
		intake.set(0);
    }
    
    /**
     * Stop shoot motor by setting speed to 0
     */
    public void stopShoot(){
		shoot.set(0);
	}
}