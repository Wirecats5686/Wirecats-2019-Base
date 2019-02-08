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

    protected void execute() {

    }
}