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
public final class TheStack_MyBot {

  public static final int TITAN_ID = 42;
  public static final int MOTOR_LEFT = 3;
  public static final int MOTOR_RIGHT = 2;

  
  public final int W = 300;
  public final int L = 340;
  public final int H = 220;
  public final int H_Lidar = 220;

  /** Lidar turn Back */

  // public final int FRONT_MIN_ANGLE_LEFT = 60;
  // public final int FRONT_MAX_ANGLE_LEFT = 90;
  // public final int FRONT_MIN_ANGLE_RIGHT = 91;
  // public final int FRONT_MAX_ANGLE_RIGHT = 111;

  // public final int LEFT_MIN_ANGLE_LEFT = 10;
  // public final int LEFT_MAX_ANGLE_LEFT = 30;
  // public final int LEFT_MIN_ANGLE_RIGHT = 31;
  // public final int LEFT_MAX_ANGLE_RIGHT = 51;

  // public final int RIGHT_MIN_ANGLE_LEFT = 130;
  // public final int RIGHT_MAX_ANGLE_LEFT = 150;
  // public final int RIGHT_MIN_ANGLE_RIGHT = 151;
  // public final int RIGHT_MAX_ANGLE_RIGHT = 171;
  
  public final int FRONT_MIN_ANGLE_LEFT = 150;
  public final int FRONT_MAX_ANGLE_LEFT = 180;
  public final int FRONT_MIN_ANGLE_RIGHT = 181;
  public final int FRONT_MAX_ANGLE_RIGHT = 221;

  // public final int LEFT_MIN_ANGLE_LEFT = 100;
  // public final int LEFT_MAX_ANGLE_LEFT = 130;
  // public final int LEFT_MIN_ANGLE_RIGHT = 131;
  // public final int LEFT_MAX_ANGLE_RIGHT = 151;

  // public final int RIGHT_MIN_ANGLE_LEFT = 220;
  // public final int RIGHT_MAX_ANGLE_LEFT = 240;
  // public final int RIGHT_MIN_ANGLE_RIGHT = 241;
  // public final int RIGHT_MAX_ANGLE_RIGHT = 261;

  public final int LEFT_MIN_ANGLE_LEFT = 90;
  public final int LEFT_MAX_ANGLE_LEFT = 130;
  public final int LEFT_MIN_ANGLE_RIGHT = 131;
  public final int LEFT_MAX_ANGLE_RIGHT = 151;
  // public final int LEFT_MAX_ANGLE_RIGHT = 161;

  public final int RIGHT_MIN_ANGLE_LEFT = 220;
  // public final int RIGHT_MIN_ANGLE_LEFT = 210;
  public final int RIGHT_MAX_ANGLE_LEFT = 240;
  public final int RIGHT_MIN_ANGLE_RIGHT = 241;
  public final int RIGHT_MAX_ANGLE_RIGHT = 271;


  /**
   * 
   * Lidar Protection Robotics
   * 
   */

  public final int BACK_PROTECT_MIN_ANGLE_LEFT = 339;
  public final int BACK_PROTECT_MAX_ANGLE_LEFT = 359;
  public final int BACK_PROTECT_MIN_ANGLE_RIGHT = 0;
  public final int BACK_PROTECT_MAX_ANGLE_RIGHT = 20;


  // Front_protect แทน Left_Protect
  public final int LEFT_PROTECT_MIN_ANGLE_LEFT = 70; // Left_front
  public final int LEFT_PROTECT_MAX_ANGLE_LEFT = 90;
  public final int LEFT_PROTECT_MIN_ANGLE_RIGHT = 91;
  public final int LEFT_PROTECT_MAX_ANGLE_RIGHT = 101;


  // Back_Protect แทน Right_Protect
  public final int RIGHT_PROTECT_MIN_ANGLE_LEFT = 260; // Right_Front
  public final int RIGHT_PROTECT_MAX_ANGLE_LEFT = 280;
  public final int RIGHT_PROTECT_MIN_ANGLE_RIGHT = 281; // Right_Back
  public final int RIGHT_PROTECT_MAX_ANGLE_RIGHT = 301;
  //อ้างอิงจากกึ่งกลางหุ่นยนต์ด้านขวาถึงล้อหน้าด้านขวา 

  
  //L_F
  public final int LEFT_PROTECT_MIN_ANGLE_FRONT = 30;
  public final int LEFT_PROTECT_MAX_ANGLE_FRONT = 80;
  //R_F
  public final int RIGHT_PROTECT_MIN_ANGLE_FRONT = 100;
  public final int RIGHT_PROTECT_MAX_ANGLE_FRONT = 150;


  public final int block_distance_Front = 280;
  public final int block_distance_Left = 370;
  public final int block_distance_Right = 370;

  public final double front_protech = 300;
  // public final double back_protech = 320;
  public final double back_protech = 0;
  public final double left_protech = 320;
  public final double right_protech = 320;

  // public final double left_back_protech = 0;
  // public final double right_back_protech = 0;

  public final double left_front_protech = 0;
  public final double right_front_protech = 0;
  public final double left_back_protech = 240;
  public final double right_back_protech = 220;

  // public final double left_front_protech = 360;
  // public final double right_front_protech = 360;
  public final double differ_conned_and_mid = 0;

  public double lastTime;
  double currentTime;
  public boolean hasSavedFirstTime = false;
  public boolean timerStarted;

  public final double speed_x = 0.2; 
  public final double speed_y = 0.15;
  public final double speed_z = 0.22;
  public final double speed_z_state = 0.3; 
  public final double speed_y_protec = 0.17;
  public final double error_x_protec = 0.0022;
  public final double error_z_protec = 0.002;
  public final double error_z_middle = 0.0025;
  public final double determine_protec = 0.05;
  public final double time_front_block = 0.7;
  public final double time_left_block = 0.1;
  public final double time_right_block = 0.2;

}
