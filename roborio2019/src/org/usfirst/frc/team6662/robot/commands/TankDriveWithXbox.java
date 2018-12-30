package org.usfirst.frc.team6662.robot.commands;

import org.usfirst.frc.team6662.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class TankDriveWithXbox extends Command{
	
	public TankDriveWithXbox() {
		super("tank drive with xbox");
		requires(Robot.drivetrain);
	}

	public void execute(){
		double leftSpeed = Robot.oi.getDriverLeftSpeed();
		double rightSpeed = Robot.oi.getDriverRightSpeed();
		
		Robot.drivetrain.tankDrive(leftSpeed, rightSpeed);
	}
	
	protected boolean isFinished() {
		return false;
	}

}
