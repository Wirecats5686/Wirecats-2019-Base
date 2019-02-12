package frc.robot.triggers;

import frc.robot.Robot;
import frc.robot.GamepadTriggerPOVMap;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * This is the trigger to shoot the cargo into a Rocket slot
 */
public class HighShootTrigger extends Trigger {

    /**
     * Determine if trigger is being pressed
     * getRawAxis(2) represents left trigger on gamepad
     * @return true if trigger is activated, else false
     * TODO: Determine and experiment with return values of getRawAxis(); should be between -1 and 1
     */
    public boolean get() {
        return true;
        // return Robot.oi.getGamepad().getRawAxis(GamepadTriggerPOVMap.leftTrigger) != 0;
    }
}