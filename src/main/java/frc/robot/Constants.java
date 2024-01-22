// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SPI.Port;

public final class Constants {
  public final int DRIVER_1 = 0;
  public final int DRIVER_2 = 1;
  public static class DriveConstants {
    public final int FRONT_LEFT_SPARK_ID = 2;
    public final int REAR_LEFT_SPARK_ID = 3;
    public final int FRONT_RIGHT_SPARK_ID = 4;
    public final int REAR_RIGHT_SPARK_ID = 6;
    public final Port NAVX_PORT = SPI.Port.kMXP;
  }
  public static class TowerConstants {
    public final int FEEDER = 7;
    public final int SHOOTER = 8;
  }

  public final double DRIVE_SPEED = 0.7;
  public final double INTAKE_SPEED = 0.7;
  public final double SHOOT_SPEED = 0.7;
  public final double FEED_SPEED = 0.7;
}
