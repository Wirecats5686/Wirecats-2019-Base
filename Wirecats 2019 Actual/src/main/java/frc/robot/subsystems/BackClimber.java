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
     * Extends the solenoids to raise the robot up
     */
    public void liftBackUp() {
        backClimber.set(DoubleSolenoid.Value.kForward);
    }

    /**
     * Retracts the solenoids to bring robot back down
     */
    public void putBackDown() {
        backClimber.set(DoubleSolenoid.Value.kReverse);
    }

    public void stop() {
        backClimber.set(DoubleSolenoid.Value.kOff);
    }
}