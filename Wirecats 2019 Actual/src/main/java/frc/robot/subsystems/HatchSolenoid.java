package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *  Class for double solenoid used for hatch mech of robot
 */
public class HatchSolenoid extends Subsystem {
	private DoubleSolenoid solenoid;

    /**
     * Constructor for a double solenoid with values for the forward and reverse channels
     */
    public HatchSolenoid (int forwardChannel, int reverseChannel){
        super("Double Solenoid");
        solenoid = new DoubleSolenoid(forwardChannel, reverseChannel);
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
