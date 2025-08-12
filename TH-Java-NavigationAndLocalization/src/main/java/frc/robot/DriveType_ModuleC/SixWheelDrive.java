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
public final class SixWheelDrive {

  public static final int TITAN_ID = 42;
  public static final int MOTOR_LEFT_FRONT = 2;
  public static final int MOTOR_LEFT_BACK = 3;
  public static final int MOTOR_RIGHT_FRONT = 0 ;    
  public static final int MOTOR_RIGHT_BACK = 1;

  public final int FRONT_MIN_ANGLE_LEFT = 230;
  public final int FRONT_MAX_ANGLE_LEFT = 270;
  public final int FRONT_MIN_ANGLE_RIGHT = 271;
  public final int FRONT_MAX_ANGLE_RIGHT = 311;

  public final int LEFT_MIN_ANGLE_LEFT = 210;
  public final int LEFT_MAX_ANGLE_LEFT = 220;
  public final int LEFT_MIN_ANGLE_RIGHT = 221;
  public final int LEFT_MAX_ANGLE_RIGHT = 241;

  public final int RIGHT_MIN_ANGLE_LEFT = 301;
  public final int RIGHT_MAX_ANGLE_LEFT = 311;
  public final int RIGHT_MIN_ANGLE_RIGHT = 312;
  public final int RIGHT_MAX_ANGLE_RIGHT = 332;

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

  public final int BACK_PROTECT_MIN_ANGLE_LEFT = 70;
  public final int BACK_PROTECT_MAX_ANGLE_LEFT = 90;
  public final int BACK_PROTECT_MIN_ANGLE_RIGHT = 91;
  public final int BACK_PROTECT_MAX_ANGLE_RIGHT = 110;


  // Front_protect แทน Left_Protect
  public final int LEFT_PROTECT_MIN_ANGLE_LEFT = 180;
  public final int LEFT_PROTECT_MAX_ANGLE_LEFT = 190;
  public final int LEFT_PROTECT_MIN_ANGLE_RIGHT = 191;
  public final int LEFT_PROTECT_MAX_ANGLE_RIGHT = 211;



  // Back_Protect แทน Right_Protect
  public final int RIGHT_PROTECT_MIN_ANGLE_LEFT = 322;
  public final int RIGHT_PROTECT_MAX_ANGLE_LEFT = 332;
  public final int RIGHT_PROTECT_MIN_ANGLE_RIGHT = 333;
  public final int RIGHT_PROTECT_MAX_ANGLE_RIGHT = 353;


  public final int LEFT_PROTECT_MIN_ANGLE_FRONT = 210;
  public final int LEFT_PROTECT_MAX_ANGLE_FRONT = 260;

  public final int RIGHT_PROTECT_MIN_ANGLE_FRONT = 280;
  public final int RIGHT_PROTECT_MAX_ANGLE_FRONT = 330;


  // public final int block_distance_Front = 180;
  public final int block_distance_Front = 390;
  public final int block_distance_Left = 370;
  public final int block_distance_Right = 370;

  public final double front_protech = 350;
  public final double back_protech = 320;
  public final double left_protech = 320;
  public final double right_protech = 320;

  public final double left_back_protech = 270;
  public final double right_back_protech = 270;

  public final double left_front_protech = 380;
  public final double right_front_protech = 380;
  public final double differ_conned_and_mid = 0;

  public double lastTime;
  double currentTime;
  public boolean hasSavedFirstTime = false;
  public boolean timerStarted;

  public final double speed_x = 0.25; // ไม่ได้ใช้ 
  public final double speed_y = 0.18;
  public final double speed_z = 0.2;
  public final double speed_z_state = 0.2; 
  public final double speed_y_protec = 0.15;
  public final double error_x_protec = 0.0022;  //ไม่ได้ใช้ 
  public final double error_z_protec = 0.002;
  public final double error_z_middle = 0.0025;
  public final double determine_protec = 0.08;
  public final double time_front_block = 0.7;
  public final double time_left_block = 0.1;
  public final double time_right_block = 0.2;
}
