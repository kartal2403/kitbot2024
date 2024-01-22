// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.tower_command.FeederCommand;
import frc.robot.commands.tower_command.ShootCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.TowerSubsystem;

public class RobotContainer {
  Constants constants = new Constants();
  DriveSubsystem driveSubsystem;
  TowerSubsystem towerSubsystem;
  Joystick driver_1 = new Joystick(constants.DRIVER_1);
  
  public RobotContainer() {
    driveSubsystem = new DriveSubsystem();
    towerSubsystem = new TowerSubsystem();
    driveSubsystem.setDefaultCommand(new ArcadeDrive(driveSubsystem, constants.DRIVE_SPEED));
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(driver_1, 1).whileTrue(new ShootCommand(towerSubsystem, constants.SHOOT_SPEED));
    new JoystickButton(driver_1, 2).whileTrue(new ShootCommand(towerSubsystem, -constants.SHOOT_SPEED));
  
    new JoystickButton(driver_1, 3).whileTrue(new FeederCommand(towerSubsystem, constants.FEED_SPEED));
    new JoystickButton(driver_1, 4).whileTrue(new FeederCommand(towerSubsystem, -constants.FEED_SPEED));}

  public Command getAutonomousCommand() {    
    return null;
  }
}
