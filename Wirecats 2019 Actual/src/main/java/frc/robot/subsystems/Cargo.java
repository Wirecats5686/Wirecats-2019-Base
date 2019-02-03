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
    
    // TODO: Determine actual values and if any other values are needed
    private static final double INTAKE_SPEED = 1.0;
    private static final double HOLD_SPEED = 0.25;
    private static final double ROCKET_SHOOT = 0.5;
    private static final double SHIP_SHOOT = 1.0;

    public Cargo(){
        super("Cargo");
        intake = new WPI_TalonSRX(RobotMap.cargoIntake);
        shoot = new WPI_TalonSRX(RobotMap.cargoShoot);
    }

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
     * Have robot shoot Cargo into a Rocket slot
     */
    public void shootIntoRocket(){
        shoot.set(ROCKET_SHOOT);
    }

    /** 
     * Have robot shoot Cargo into a Cargo Ship slot
     */
    public void shootIntoCargoShip(){
        shoot.set(SHIP_SHOOT);
    }
    
    /**
     * Have robt hold onto Cargo
     */
    public void holdCargo() {
        intake.set(HOLD_SPEED);
        shoot.set(-HOLD_SPEED);
    }
}