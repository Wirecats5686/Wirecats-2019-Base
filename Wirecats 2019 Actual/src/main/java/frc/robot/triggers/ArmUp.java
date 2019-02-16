package frc.robot.triggers;

import frc.robot.GamepadTriggerPOVMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * Maps trigger to POV of gamepad and determines whether up arrow on POV is pressed
 */
public class ArmUp extends Trigger {
    
    private Joystick gamepad;

    public ArmUp(Joystick joystick) {
        gamepad = joystick;
    }

    public boolean get() {
        return gamepad.getPOV() == GamepadTriggerPOVMap.povUp;
    }
}