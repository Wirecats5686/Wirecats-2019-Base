package frc.robot.triggers;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.GenericHID;
/**
 * This is the trigger to shoot the cargo into a Cargo Ship slot
 */
public class LowShootTrigger extends Trigger {
    /*TODO: Need to figure out what default value is when trigger is not being pressed
    * that way we can figure out when the trigger is actually being pressed
    * Emily: Based on getRawAxis() description; default value appears to be 0
    */

    public LowShootTrigger(GenericHID joystick, int axisNumber) {

    }

    public boolean get() {
        return Robot.oi.getGamepad().getRawAxis(2) >= 180;
    }

    public boolean isPressed() {
        return Robot.oi.getGamepad().getRawAxis(2) > 0;
    }
}