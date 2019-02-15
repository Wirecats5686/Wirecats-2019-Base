package frc.robot.triggers;

import frc.robot.GamepadTriggerPOVMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * Maps trigger to POV of gamepad and determines whether down arrow on POV pressed
 */
public class ArmDown extends Trigger {
    
    private Joystick gamepad;

    public ArmDown(Joystick joystick) {
        gamepad = joystick;
    }

    public boolean get() {
        return gamepad.getPOV() == GamepadTriggerPOVMap.povDown;
    }
}