package frc.robot.triggers;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.buttons.Trigger;
/**
 * This is the trigger to shoot the cargo into a Cargo Ship slot
 */
public class LowShootTrigger extends Trigger {
    
    // @return true if trigger is activated, else false
    // TODO: Determine and experiment with return values of getRawAxis()
    public boolean get() {
        return Robot.oi.getGamepad().getRawAxis(3) != 0;
    }
}