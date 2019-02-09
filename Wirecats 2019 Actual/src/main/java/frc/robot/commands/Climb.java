package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Climb extends Command {

    public Climb() {
        requires(Robot.climber);
    }

    protected boolean isFinished() {
        return false;
    }

    // TODO: Implement climb execution based on mechanical design
    protected void execute() {

    }
}