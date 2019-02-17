package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Subsytem class for Back Climber mechanism
 */
public class BackClimber extends Subsystem {
    
    // Solenoid for back climber
    public DoubleSolenoid backClimber;

    /**
     * Create a new BackClimber instance, setting up solenoid
     */
    public BackClimber() {
        super("BackClimber");
        backClimber = new DoubleSolenoid(RobotMap.climberBackForward, RobotMap.climberBackReverse);
    }

    /**
     *  Abstract method that's required in subclass; not being used since 
	 * we don't need arm to do anything when Robot is first enabled
     */
    public void initDefaultCommand() {
        // Don't do anything
    }

    /**
     * "Extends" the solenoid to raise back of robot up
     */
    public void liftBackUp() {
        backClimber.set(DoubleSolenoid.Value.kForward);
    }

    /**
     * "Retracts" the solenoid to bring back of robot down
     */
    public void putBackDown() {
        backClimber.set(DoubleSolenoid.Value.kReverse);
    }

    /**
     * Turn solenoid off
     */
    public void stop() {
        backClimber.set(DoubleSolenoid.Value.kOff);
    }
}