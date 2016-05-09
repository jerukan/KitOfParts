package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.util.RobotJoystick;

import edu.wpi.first.wpilibj.command.Command;

public class JoystickArcadeDrive extends Command {
	
	private RobotJoystick joystick;
	
	public JoystickArcadeDrive(RobotJoystick robotJoystick) {
		requires(Robot.drive);
		this.joystick = robotJoystick;
	}

	@Override
	protected void initialize() {
		Robot.drive.stopDriveMotors();
	}

	@Override
	protected void execute() {
		Robot.drive.useArcadeDrive(joystick.getModX(), joystick.getModY());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.drive.stopDriveMotors();
	}

	@Override
	protected void interrupted() {
		end();
	}

}
