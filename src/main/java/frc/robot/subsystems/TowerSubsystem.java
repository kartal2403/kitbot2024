// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.TowerConstants;

public class TowerSubsystem extends SubsystemBase {
  /** Creates a new TowerSubsystem. */
  public TowerSubsystem() {}
  TowerConstants towerConstants = new TowerConstants();
  CANSparkMax shooterSpark = new CANSparkMax(towerConstants.SHOOTER, MotorType.kBrushless);
  CANSparkMax feederSpark = new CANSparkMax(towerConstants.FEEDER, MotorType.kBrushless);

  RelativeEncoder shooterEncoder;
  RelativeEncoder feederEncoder;

  public void shoot(double SHOOT_SPEED){
    shooterSpark.set(SHOOT_SPEED);
  }

  public void feed(double FEED_SPEED){
    feederSpark.set(FEED_SPEED);
  }

  public void stopShooter(){
    shooterSpark.set(0);
  }
  
  public void stopFeeder(){
    feederSpark.set(0);
  }

  public void resetEncoders(){
    shooterEncoder.setPosition(0);
    feederEncoder.setPosition(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    shooterEncoder = shooterSpark.getEncoder();
    feederEncoder = feederSpark.getEncoder();
  }
}
