package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveForward extends Command {
	
	private double distance;
	
	public DriveForward(double distance) {
		requires(Robot.drive);
		this.distance = distance;
	}
	
	@Override
	protected void initialize() {
		Robot.hardware.leftEncoder.reset();
		Robot.hardware.rightEncoder.reset();
		Robot.drive.stopDriveMotors();
	}

	@Override
	protected void execute() {
		if(Robot.hardware.leftEncoder.getDistance() < distance) {
			Robot.drive.setDriveMotors(0.5, 0.5);
		}
	}

	@Override
	protected boolean isFinished() {
		return Robot.hardware.leftEncoder.getDistance() >= distance;
	}

	@Override
	protected void end() {
		Robot.hardware.leftEncoder.reset();
		Robot.hardware.rightEncoder.reset();
		Robot.drive.stopDriveMotors();
	}

	@Override
	protected void interrupted() {
		end();
	}
}
