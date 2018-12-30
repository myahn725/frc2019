/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6662.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

public class OI {
	
	public static final int DRIVER_PORT = 0;
	
	XboxController driver = new XboxController(DRIVER_PORT);
	
	public double getDriverLeftSpeed() {
		return driver.getY(Hand.kLeft); //what is Hand.kLeft
	}
	
	public double getDriverRightSpeed() {
		return driver.getY(Hand.kRight); //what is Hand.kRight
	}
}
