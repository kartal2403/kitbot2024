// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.tower_command;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TowerSubsystem;

public class FeederCommand extends Command {
  /** Creates a new FeederCommand. */
  TowerSubsystem towerSubsystem;
  double FEED_SPEED;
  public FeederCommand(TowerSubsystem towerSubsystem, double FEED_SPEED) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.towerSubsystem = towerSubsystem;
    this.FEED_SPEED = FEED_SPEED;
    addRequirements(towerSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    towerSubsystem.feed(FEED_SPEED);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    towerSubsystem.stopFeeder();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
