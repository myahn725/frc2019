package org.usfirst.frc.team6662.robot.subsystems;

import org.usfirst.frc.team6662.robot.RobotMap;
import org.usfirst.frc.team6662.robot.commands.TankDriveWithXbox;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends Subsystem{

	WPI_TalonSRX leftFront = new WPI_TalonSRX(RobotMap.LEFT_FRONT_MOTOR); //robotmap this
	WPI_TalonSRX leftRear = new WPI_TalonSRX(RobotMap.LEFT_REAR_MOTOR);
	SpeedControllerGroup leftSide = new SpeedControllerGroup(leftFront, leftRear);
	
	WPI_TalonSRX rightFront = new WPI_TalonSRX(RobotMap.RIGHT_FRONT_MOTOR);
	WPI_TalonSRX rightRear = new WPI_TalonSRX(RobotMap.LEFT_FRONT_MOTOR);
	SpeedControllerGroup rightSide = new SpeedControllerGroup(rightFront, rightRear);
	
	DifferentialDrive drivetrain = new DifferentialDrive(leftSide, rightSide);
	
	public Drivetrain(){
		super("drivetrain");
	}
	
	public void tankDrive(double leftSpeed, double rightSpeed) {
		drivetrain.tankDrive(leftSpeed, rightSpeed);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDriveWithXbox());
	}
	
}
