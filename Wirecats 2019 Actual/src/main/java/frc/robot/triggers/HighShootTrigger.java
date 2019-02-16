package frc.robot.triggers;

import frc.robot.GamepadTriggerPOVMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * This is the trigger to shoot the cargo into a cargo ship slot
 */
public class HighShootTrigger extends Trigger {

    // Gamepad that has the trigger button we're interested in
    private Joystick gamepad;

    /**
     * Create a HighShootTrigger instance
     * @param joystick
     */
    public HighShootTrigger (Joystick joystick) {
        gamepad = joystick;
    }

    /**
     * Determine if left trigger on gamepad is being pressed by getting the value of axis 2
     * 
     * @return true if trigger is being pressed (value is not 0)
     */
    public boolean get() {
        return gamepad.getRawAxis(GamepadTriggerPOVMap.leftTrigger) != 0;
    }
}