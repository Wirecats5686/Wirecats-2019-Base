package frc.robot;

public class GamepadTriggerPOVMap {
    // Mappings for triggers (Under "Axes") and POVs on Logitech Controller aka "gamepad"
    // Refer to Driver Station for mappings
    
    // POVs measured in degrees, with 0 degrees as the "up" arrow and rotating clockwise
    public static int povUp = 0;
    public static int povUpRight = 45;
    public static int povRight = 90;
    public static int povDownRight = 135;
    public static int povDown = 180;
    public static int povDownLeft = 225;
    public static int povLeft = 270;
    public static int povUpLeft = 315;

    // trigger IDs 
    public static int leftTrigger = 2;
    public static int rightTrigger = 3;
}