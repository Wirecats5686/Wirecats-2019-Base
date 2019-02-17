package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 *  Subystem Class for robot's hatch mechanism
 */
public class Hatch extends Subsystem {
	private DoubleSolenoid solenoid;

    /**
     * SAVED
     */
    public Hatch (){
        super("Double Solenoid");
        solenoid = new DoubleSolenoid(RobotMap.hatchForward, RobotMap.hatchReverse);
    }
    
    /**
     *  Abstract method that's required in subclass; not being used since 
	 * we don't need arm to do anything when Robot is first enabled
     */
    public void initDefaultCommand() {
        // Nothing needs to be called when we initialize this subsystem
    }

    /**
     * Used to have the solenoid execute an extend action
     */
    public void solenoidExtend (){
        solenoid.set(DoubleSolenoid.Value.kForward);
    }

    /**
     * Used to have the solenoid execute a retract action
     */
    public void solenoidRetract(){
        solenoid.set(DoubleSolenoid.Value.kReverse);
    }

    /**
     * Used to stop the solenoid execution
     */
    public void stop(){
        solenoid.set(DoubleSolenoid.Value.kOff);
    }
}
