package org.usfirst.frc.team5026.util;

public enum JoystickScaling {
	HALVED (0.5),
	LINEAR (1),
	DOUBLED (2);
	
	private double power;
	JoystickScaling(double power) {
		this.power = power;
	}
	
	public double getPower() {
		return power;
	}
}
