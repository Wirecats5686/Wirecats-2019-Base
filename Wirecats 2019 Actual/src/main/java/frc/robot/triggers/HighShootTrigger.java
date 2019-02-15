package frc.robot.triggers;

import frc.robot.GamepadTriggerPOVMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * This is the trigger to shoot the cargo into a cargo ship slot
 */
public class HighShootTrigger extends Trigger {

    private Joystick gamepad;

    public HighShootTrigger (Joystick joystick) {
        gamepad = joystick;
    }

    /**
     * Determine if trigger is being pressed
     * getRawAxis(2) represents left trigger on gamepad
     * @return true if trigger is activated, else false
     */
    public boolean get() {
        return gamepad.getRawAxis(GamepadTriggerPOVMap.leftTrigger) != 0;
    }
}