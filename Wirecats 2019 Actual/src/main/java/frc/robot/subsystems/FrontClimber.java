package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Subsytem class for Front Climber mechanism
 */
public class FrontClimber extends Subsystem {
    // Solenoid for front climber
    public DoubleSolenoid frontClimber;

    /**
     * Create a new FrontClimber instance, setting up solenoid
     */
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
     * "Extends" the solenoid to raise front of robot up
     */
    public void liftFrontUp() {
        frontClimber.set(DoubleSolenoid.Value.kForward);
    }

    /**
     * "Retracts" the solenoid to bring back of robot down
     */
    public void putFrontDown() {
        frontClimber.set(DoubleSolenoid.Value.kReverse);
    }

    /**
     * Stop solenoid execution
     */
    public void stop() {
        frontClimber.set(DoubleSolenoid.Value.kOff);
    }
}