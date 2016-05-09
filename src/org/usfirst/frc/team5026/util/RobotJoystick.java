package org.usfirst.frc.team5026.util;

import edu.wpi.first.wpilibj.Joystick;

public class RobotJoystick extends Joystick {
	private double deadX;
	private double deadY;
	private double deadMotor;
	private double scale;
	
	public RobotJoystick(int port, double xDeadzone, double yDeadzone, double motorDeadzone, JoystickScaling scale) {
		super(port);
		deadX = xDeadzone;
		deadY = yDeadzone;
		deadMotor = motorDeadzone;
		
		this.scale = scale.getPower();
	}
	
	public double getModX() {
		if(Math.abs(getX()) > deadX && Math.abs(getX()) > deadMotor) {
			return getX() * scale;
		} else {
			return 0;
		}
	}
	
	public double getModY() {
		if(Math.abs(getY()) > deadY && Math.abs(getY()) > deadMotor) {
			return getY() * scale;
		} else {
			return 0;
		}
	}
}
