package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * Subsytem class for Arm mechanism
 */
public class Arm extends Subsystem{
	
	// Speed controller for arm
	private WPI_TalonSRX armTalon;

	// Digital inputs (switches) for arm
    private static DigitalInput down;
	private static DigitalInput up;

	/**
	 * Create a new Arm instance, setting up talon and digital inputs
	 */
    public Arm(){
		super("Arm");
		armTalon = new WPI_TalonSRX(RobotMap.armId);
		armTalon.setNeutralMode(NeutralMode.Brake);
		
		// Digital inputs commented out for now as don't have yet
		//down = new DigitalInput(RobotMap.armDownInputChannel);
		//up = new DigitalInput(RobotMap.armUpInputChannel);
    }

	/**
     *  Abstract method that's required in subclass; not being used since 
	 * we don't need arm to do anything when Robot is first enabled
     */
    public void initDefaultCommand() {
        // Don't do anything
	}
	
	/**
	 * Set speed for arm to fraction of value passed in if arm 
	 * is not in highest/lowest position
	 * 
	 * @param speed
	 */
    public void set(double speed){
		/**
		 * Set speed of arm as long as arm has not activated digital 
		 * input in direction its trying to go
		 * -->Commented out until have digital inputs
		 */
		// if(isArmDown() && speed > 0){
		// 	armTalon.set(0);
		// }else if(isArmUp() && speed < 0){
		// 	armTalon.set(0);
		// }else{		
		// 	armTalon.set(speed*0.25);
		// }
		
		// Set arm speed to 1/4 of the passed in speed
		armTalon.set(speed*0.25);
	}
	
	/**
	 * Checks if arm is currently as far down as it can go
	 * @return true if bottom switch is active
	 */
	public boolean isArmDown(){
		return down.get();
	}
	
	/**
	 * Checks if arm is currently as far up as it can go
	 * @return true if top switch is active
	 */
	public boolean isArmUp(){
		return up.get();
	}

	/**
	 * Set speed of motor to 0, stopping it
	 */
	public void stop(){
		armTalon.set(0);
	}
}

    


