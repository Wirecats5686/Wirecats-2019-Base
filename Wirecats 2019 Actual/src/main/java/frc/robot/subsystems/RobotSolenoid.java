package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SolenoidBase;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *  Class for solenoids used in robot - modified to allow use 
 *  of either single or double solenoids
 */
public class RobotSolenoid extends Subsystem {
	private static SolenoidBase solenoid;

	public RobotSolenoid(String type){
        super("Solenoid");

        /* Check what type of solenoid we're creating:  
         *   If value of type is "single", create a single solenoid object 
         *   Otherwise we default to creating a double solenoid object
         */
        if ("single".equalsIgnoreCase(type)){
            solenoid = new Solenoid(0);
        }
        else {
            solenoid = new DoubleSolenoid(5, 4);
        }

    }
    
    /**
     *  Abstract method that's required in subclass but not being used by us;
     *   currently does nothing
     */
    public void initDefaultCommand() {
        // Nothing needs to be called when we initialize this subsystem
    }

    /**
     * Used to have the solenoid execute an extend action;
     * modified to allow use of either single or double solenoid
     */
    public void SolenoidExtend (){
        if (solenoid instanceof Solenoid){
            //saved for single solenoid implementation
        }
        else if (solenoid instanceof DoubleSolenoid){
            ((DoubleSolenoid) solenoid).set(DoubleSolenoid.Value.kForward);
        }
    }

    /**
     * Used to have the solenoid execute a retract action;
     * modified to allow use of either single or double solenoid
     */
    public void SolenoidRetract(){
        if (solenoid instanceof Solenoid){
            //saved for single solenoid implementation
        }
        else if (solenoid instanceof DoubleSolenoid){
            ((DoubleSolenoid) solenoid).set(DoubleSolenoid.Value.kReverse);
        }
    }

    /**
     * Used to stop the solenoid execution;
     * modified to allow use of either single or double solenoid
     */
    public void stop(){
        if (solenoid instanceof Solenoid){
            //saved for single solenoid implementation
        }
        else if (solenoid instanceof DoubleSolenoid){
            ((DoubleSolenoid) solenoid).set(DoubleSolenoid.Value.kOff);
        }
    }
}
