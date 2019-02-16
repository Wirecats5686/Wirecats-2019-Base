package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {
    
    public RobotSolenoid backClimber;
    public RobotSolenoid frontClimber;

    public Climber() {
        super("Climber");
        //backClimber = new RobotSolenoid(RobotMap.climberBackForward, RobotMap.climberBackReverse);
        frontClimber = new RobotSolenoid(RobotMap.climberFrontForward, RobotMap.climberFrontReverse);
    }

    public void initDefaultCommand() {
        // Don't do anything
    }

    /**
     * Extends the solenoids to raise the robot up
     */
    public void liftFrontUp() {
        frontClimber.SolenoidExtend();
    }

    /**
     * Retracts the solenoids to bring robot back down
     */
    public void putFrontDown() {
        frontClimber.SolenoidRetract();
    }

    public void stop() {
        frontClimber.stop();
    }
}