package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 *  Subystem Class for robot's hatch mechanism
 */
public class Hatch extends Subsystem {
    // Solenoid for hatch mechanism
    private DoubleSolenoid solenoid;

    /**
     * Create new Hatch instance, setting up solenoid
     */
    public Hatch (){
        super("Hatch");
        solenoid = new DoubleSolenoid(RobotMap.hatchForward, RobotMap.hatchReverse);
    }
    
    /**
     *  Abstract method that's required in subclass; not being used since 
	 * we don't need arm to do anything when Robot is first enabled
     */
    public void initDefaultCommand() {
        // Do nothing
    }

    /**
     * "Extend" solenoid to grab a hatch panel
     */
    public void grabHatch (){
        solenoid.set(DoubleSolenoid.Value.kForward);
    }

    /**
     * "Retract" solenoid to release hatch panel
     */
    public void releaseHatch(){
        solenoid.set(DoubleSolenoid.Value.kReverse);
    }

    /**
     * Stop solenoid execution
     */
    public void stop(){
        solenoid.set(DoubleSolenoid.Value.kOff);
    }
}
