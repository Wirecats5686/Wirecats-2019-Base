package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

//TODO: will need separate climb commands for up/down and front/back climbers
public class Climb extends Command {

    public Climb() {
        super(0.25);
        requires(Robot.climber);
    }

    /**
     * 
     */
    protected void execute() {
        Robot.climber.putFrontDown();
    }

    /**
     * 
     */
    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        Robot.climber.stop();
    }
}