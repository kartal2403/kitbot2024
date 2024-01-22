// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.tower_command;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TowerSubsystem;

public class ShootCommand extends Command {
  /** Creates a new ShootCommand. */
  TowerSubsystem towerSubsystem;
  double SHOOT_SPEED;
  public ShootCommand(TowerSubsystem towerSubsystem, double SHOOT_SPEED) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.towerSubsystem = towerSubsystem;
    this.SHOOT_SPEED = SHOOT_SPEED;
    addRequirements(towerSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    towerSubsystem.shoot(SHOOT_SPEED);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    towerSubsystem.stopShooter();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
