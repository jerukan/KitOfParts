package org.usfirst.frc.team5026.robot;

public class Constants {
	public static final int leftDriveMotor = 5;
	public static final int rightDriveMotor = 3;
	
	public static final int leftDriveEncoder1 = 0;
	public static final int leftDriveEncoder2 = 1;
	
	public static final int rightDriveEncoder1 = 2;
	public static final int rightDriveEncoder2 = 3;
	
	public static final int robotJoystickPort = 0;
	
	public static final double encoderDistancePerPulse = (4 * Math.PI) / 256; 
	
	public static final double xDeadzone = 0.01;
	public static final double yDeadzone = 0.15;
	
	public static final double motorDeadzone = 0.3;
}
