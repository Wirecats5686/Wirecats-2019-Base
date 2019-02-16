//this is where the subsystem code for the arm will go
package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.RunArm;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Arm extends Subsystem{
	private WPI_TalonSRX armTalon;

    private static DigitalInput down;
	private static DigitalInput up;

    public Arm(){
		super("Arm");
		armTalon = new WPI_TalonSRX(RobotMap.armId);
		
		//down = new DigitalInput(RobotMap.armDownInputChannel);
		//up = new DigitalInput(RobotMap.armUpInputChannel);

    }

    public void initDefaultCommand() {
        // Don't do anything
	}
	
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
		// 	armTalon.set(speed*0.1);
		// }
		
		// Set arm speed to 1/10th of the passed in speed
		armTalon.set(speed*0.1);
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

	public void stop(){
		set(0);
	}
}

    


