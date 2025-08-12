/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.DriveType_ModuleC;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class XDrive {

  public static final int TITAN_ID = 42;
  public static final int MOTOR_LEFT_FRONT = 2;
  public static final int MOTOR_RIGHT_FRONT = 0;
  public static final int MOTOR_LEFT_BACK = 3;
  public static final int MOTOR_RIGHT_BACK = 1;;

 /** Lidar turn right */
 public final int FRONT_MIN_ANGLE_LEFT = 250;
 public final int FRONT_MAX_ANGLE_LEFT = 270;
 public final int FRONT_MIN_ANGLE_RIGHT = 271;
 public final int FRONT_MAX_ANGLE_RIGHT = 291;

 public final int LEFT_MIN_ANGLE_LEFT = 180;
 public final int LEFT_MAX_ANGLE_LEFT = 200;
 public final int LEFT_MIN_ANGLE_RIGHT = 201;
 public final int LEFT_MAX_ANGLE_RIGHT = 221;

 public final int RIGHT_MIN_ANGLE_LEFT = 318;
 public final int RIGHT_MAX_ANGLE_LEFT = 328;
 public final int RIGHT_MIN_ANGLE_RIGHT = 329;
 public final int RIGHT_MAX_ANGLE_RIGHT = 359;

 // public final int LEFT_MIN_ANGLE_LEFT = 180;
 // public final int LEFT_MAX_ANGLE_LEFT = 210;
 // public final int LEFT_MIN_ANGLE_RIGHT = 211;
 // public final int LEFT_MAX_ANGLE_RIGHT = 241;

 // public final int RIGHT_MIN_ANGLE_LEFT = 298;
 // public final int RIGHT_MAX_ANGLE_LEFT = 328;
 // public final int RIGHT_MIN_ANGLE_RIGHT = 329;
 // public final int RIGHT_MAX_ANGLE_RIGHT = 359;



 /**
  * 
  * Lidar Protection Robotics
  * 
  */

 public final int BACK_PROTECT_MIN_ANGLE_LEFT = 91;
 public final int BACK_PROTECT_MAX_ANGLE_LEFT = 111;
 public final int BACK_PROTECT_MIN_ANGLE_RIGHT = 70;
 public final int BACK_PROTECT_MAX_ANGLE_RIGHT = 90;
 
 public final int LEFT_PROTECT_MIN_ANGLE_LEFT = 138;
 public final int LEFT_PROTECT_MAX_ANGLE_LEFT = 158;
 public final int LEFT_PROTECT_MIN_ANGLE_RIGHT = 159;
 public final int LEFT_PROTECT_MAX_ANGLE_RIGHT = 189;

 public final int RIGHT_PROTECT_MIN_ANGLE_LEFT = 349;
 public final int RIGHT_PROTECT_MAX_ANGLE_LEFT = 359;
 public final int RIGHT_PROTECT_MIN_ANGLE_RIGHT = 1;
 public final int RIGHT_PROTECT_MAX_ANGLE_RIGHT = 41;


 public final int LEFT_PROTECT_MIN_ANGLE_FRONT = 30;
 public final int LEFT_PROTECT_MAX_ANGLE_FRONT = 80;
 public final int RIGHT_PROTECT_MIN_ANGLE_FRONT = 100;
 public final int RIGHT_PROTECT_MAX_ANGLE_FRONT = 150;

 // public final int block_distance_Front = 180;
 public final int block_distance_Front = 240;
 public final int block_distance_Left = 250;
 public final int block_distance_Right = 250;

 public final double front_protech = 200;
 public final double back_protech = 0; // useless in model XDrive
 public final double left_protech = 155;
 public final double right_protech = 155;
 public final double left_back_protech = 220;
 public final double right_back_protech = 220;

 public final double left_front_protech = 350;
 public final double right_front_protech = 350;

 public double lastTime;
 double currentTime;
 public boolean hasSavedFirstTime = false;
 public boolean timerStarted;

 public final double speed_x = 0.1;
 public final double speed_y = 0.10;
 public final double speed_z = 0.13;
 public final double speed_z_state = 0.25; 
 public final double speed_y_protec = 0.15;
 public final double error_x_protec = 20.0;
 public final double error_z_protec = 0.0015;
 public final double error_z_middle = 0.002;
 public final double determine_protec = 0.08;
 public final double time_front_block = 0.7;
 public final double time_left_block = 0.1;
 public final double time_right_block = 0.2;

}
