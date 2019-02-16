package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class FrontClimber extends Subsystem {
    
    public DoubleSolenoid frontClimber;

    public FrontClimber() {
        super("FrontClimber");
        frontClimber = new DoubleSolenoid(RobotMap.climberFrontForward, RobotMap.climberFrontReverse);
    }

    /**
     *  Abstract method that's required in subclass; not being used since 
	 * we don't need arm to do anything when Robot is first enabled
     */
    public void initDefaultCommand() {
        // Don't do anything
    }

    /**
     * Extends the solenoids to raise the robot up
     */
    public void liftFrontUp() {
        frontClimber.set(DoubleSolenoid.Value.kForward);
    }

    /**
     * Retracts the solenoids to bring robot back down
     */
    public void putFrontDown() {
        frontClimber.set(DoubleSolenoid.Value.kReverse);
    }

    public void stop() {
        frontClimber.set(DoubleSolenoid.Value.kOff);
    }
}