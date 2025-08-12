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
public final class Differance_2 {

  public static final int TITAN_ID = 42;
  public static final int MOTOR_LEFT = 0;
  public static final int MOTOR_RIGHT = 1 ;    

    /**
     * 
     * สิ่งที่ยังขาดไปคือ ขนาดของหุ่นยนต์ กว้าง ยาว สูง ตำแหน่ง Lidar ตำแหน่งล้อ
     *
     * 
     */

  
  public final int W = 300;
  public final int L = 340;
  public final int H = 220;
  
  /** Lidar turn right */

  public final int FRONT_MIN_ANGLE_LEFT = 220;
  public final int FRONT_MAX_ANGLE_LEFT = 270;
  public final int FRONT_MIN_ANGLE_RIGHT = 271;
  public final int FRONT_MAX_ANGLE_RIGHT = 321;

  public final int LEFT_MIN_ANGLE_LEFT = 205;
  // public final int LEFT_MIN_ANGLE_LEFT = 215;
  public final int LEFT_MAX_ANGLE_LEFT = 225;
  public final int LEFT_MIN_ANGLE_RIGHT = 216;
  // public final int LEFT_MAX_ANGLE_RIGHT = 236;
  public final int LEFT_MAX_ANGLE_RIGHT = 246;

  // public final int RIGHT_MIN_ANGLE_LEFT = 304;
  public final int RIGHT_MIN_ANGLE_LEFT = 294;
  public final int RIGHT_MAX_ANGLE_LEFT = 324;
  public final int RIGHT_MIN_ANGLE_RIGHT = 315;
  // public final int RIGHT_MAX_ANGLE_RIGHT = 325;
  public final int RIGHT_MAX_ANGLE_RIGHT = 335;


  /**
   * 
   * Lidar Protection Robotics
   * 
   */

  public final int BACK_PROTECT_MIN_ANGLE_LEFT = 60;
  public final int BACK_PROTECT_MAX_ANGLE_LEFT = 90;
  public final int BACK_PROTECT_MIN_ANGLE_RIGHT = 91;
  public final int BACK_PROTECT_MAX_ANGLE_RIGHT = 121;

  /**
   * Protect Back
   */
  
  public final int LEFT_PROTECT_MIN_ANGLE_LEFT = 110;
  public final int LEFT_PROTECT_MAX_ANGLE_LEFT = 130;
  public final int LEFT_PROTECT_MIN_ANGLE_RIGHT = 131;
  public final int LEFT_PROTECT_MAX_ANGLE_RIGHT = 171;

  public final int RIGHT_PROTECT_MIN_ANGLE_LEFT = 10;
  public final int RIGHT_PROTECT_MAX_ANGLE_LEFT = 40;
  public final int RIGHT_PROTECT_MIN_ANGLE_RIGHT = 41;
  public final int RIGHT_PROTECT_MAX_ANGLE_RIGHT = 71;

  /**
   * Protech Front
   */

  public final int LEFT_PROTECT_MIN_ANGLE_FRONT = 190;
  public final int LEFT_PROTECT_MAX_ANGLE_FRONT = 230;

  public final int RIGHT_PROTECT_MIN_ANGLE_FRONT = 309;
  public final int RIGHT_PROTECT_MAX_ANGLE_FRONT = 349;



  // public final int block_distance_Front = 180;
  public final int block_distance_Front = 260;
  public final int block_distance_Left = 250;
  public final int block_distance_Right = 250;

  public final double front_protech = 230;
  public final double back_protech = 250;

  public final double left_protech = 200;
  public final double right_protech = 200;

  /**
   * Protect
   */
  public final double left_back_protech = 230;
  public final double right_back_protech = 230;

  public final double left_front_protech = 220;
  public final double right_front_protech = 220;

  public double lastTime;
  double currentTime;
  public boolean hasSavedFirstTime = false;
  public boolean timerStarted;

  public final double speed_x = 0.25; //ปกติไม่ได้ใช้
  public final double speed_y = 0.14;
  public final double speed_z = 0.10;
  public final double speed_z_state = 0.25; 
  public final double speed_y_protec = 0.2;
  public final double error_x_protec = 0.0015; //ปกติไม่ได้ใช้
  public final double error_z_protec = 0.0015;
  public final double error_z_middle = 0.002;
  public final double determine_protec = 0.02;
  // public final double time_front_block = 0.7;
  // public final double time_left_block = 0.1;
  // public final double time_right_block = 0.2;
  public final double time_front_block = 100;
  public final double time_left_block = 10;
  public final double time_right_block = 20;

}
