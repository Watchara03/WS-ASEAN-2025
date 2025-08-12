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
public final class TheStack {

  public static final int TITAN_ID = 42;
  public static final int MOTOR_LEFT_FRONT = 0;
  public static final int MOTOR_LEFT_BACK = 1;
  public static final int MOTOR_RIGHT_FRONT = 2 ;    
  public static final int MOTOR_RIGHT_BACK = 3;

    /**
     * 
     * สิ่งที่ยังขาดไปคือ ขนาดของหุ่นยนต์ กว้าง ยาว สูง ตำแหน่ง Lidar ตำแหน่งล้อ
     *
     * 
     */

  // public final int FRONT_MIN_ANGLE_LEFT = 330;
  // public final int FRONT_MAX_ANGLE_LEFT = 359;
  // public final int FRONT_MIN_ANGLE_RIGHT = 0;
  // public final int FRONT_MAX_ANGLE_RIGHT = 30;

  // public final int LEFT_MIN_ANGLE_BLOCK = 245;
  // public final int LEFT_MAX_ANGLE_BLOCK = 330;
  // public final int RIGHT_MIN_ANGLE_BLOCK = 35;
  // public final int RIGHT_MAX_ANGLE_BLOCK = 115;

  /** Lidar turn right */
// หน้าแคบ
  public final int FRONT_MIN_ANGLE_LEFT = 250;
  public final int FRONT_MAX_ANGLE_LEFT = 270;
  public final int FRONT_MIN_ANGLE_RIGHT = 271;
  public final int FRONT_MAX_ANGLE_RIGHT = 291;

  // public final int FRONT_MIN_ANGLE_LEFT = 200;
  // public final int FRONT_MAX_ANGLE_LEFT = 270;
  // public final int FRONT_MIN_ANGLE_RIGHT = 271;
  // public final int FRONT_MAX_ANGLE_RIGHT = 331;

  public final int LEFT_MIN_ANGLE_LEFT = 200;
  public final int LEFT_MAX_ANGLE_LEFT = 220;
  public final int LEFT_MIN_ANGLE_RIGHT = 221;
  public final int LEFT_MAX_ANGLE_RIGHT = 251;

  public final int RIGHT_MIN_ANGLE_LEFT = 288;
  public final int RIGHT_MAX_ANGLE_LEFT = 318;
  public final int RIGHT_MIN_ANGLE_RIGHT = 319;
  public final int RIGHT_MAX_ANGLE_RIGHT = 339;


  /**
   * 
   * Lidar Protection Robotics
   * 
   */
  
  
  //ไม่ได้ใช้
  // public final int BACK_PROTECT_MIN_ANGLE_LEFT = 91;
  // public final int BACK_PROTECT_MAX_ANGLE_LEFT = 111;
  // public final int BACK_PROTECT_MIN_ANGLE_RIGHT = 70;
  // public final int BACK_PROTECT_MAX_ANGLE_RIGHT = 90;
  
  // public final int LEFT_PROTECT_MIN_ANGLE_LEFT = 138;
  // public final int LEFT_PROTECT_MAX_ANGLE_LEFT = 158;
  // public final int LEFT_PROTECT_MIN_ANGLE_RIGHT = 159;
  // public final int LEFT_PROTECT_MAX_ANGLE_RIGHT = 179;
  
  // public final int RIGHT_PROTECT_MIN_ANGLE_LEFT = 0;
  // public final int RIGHT_PROTECT_MAX_ANGLE_LEFT = 10;
  // public final int RIGHT_PROTECT_MIN_ANGLE_RIGHT = 21;
  // public final int RIGHT_PROTECT_MAX_ANGLE_RIGHT = 41;
  // public final int BACK_PROTECT_MIN_ANGLE_LEFT = 91;

  public final int BACK_PROTECT_MIN_ANGLE_LEFT = 0;
  public final int BACK_PROTECT_MAX_ANGLE_LEFT = 0;
  public final int BACK_PROTECT_MIN_ANGLE_RIGHT =0;
  public final int BACK_PROTECT_MAX_ANGLE_RIGHT = 0;
  
  public final int LEFT_PROTECT_MIN_ANGLE_LEFT = 200;
  public final int LEFT_PROTECT_MAX_ANGLE_LEFT = 210;
  public final int LEFT_PROTECT_MIN_ANGLE_RIGHT = 211;
  public final int LEFT_PROTECT_MAX_ANGLE_RIGHT = 221;
  
  public final int RIGHT_PROTECT_MIN_ANGLE_LEFT = 318;
  public final int RIGHT_PROTECT_MAX_ANGLE_LEFT = 328;
  public final int RIGHT_PROTECT_MIN_ANGLE_RIGHT = 329;
  public final int RIGHT_PROTECT_MAX_ANGLE_RIGHT = 339;
  
  //ใช้ตัวนี้
  public final int LEFT_PROTECT_MIN_ANGLE_FRONT = 200;
  public final int LEFT_PROTECT_MAX_ANGLE_FRONT = 250;

  public final int RIGHT_PROTECT_MIN_ANGLE_FRONT = 299;
  public final int RIGHT_PROTECT_MAX_ANGLE_FRONT = 339;



  // public final int block_distance_Front = 180;
  public final int block_distance_Front = 280;
  public final int block_distance_Left = 350;
  public final int block_distance_Right = 350;

  // public final double front_protech = 250;
  public final double front_protech = 280;
  public final double back_protech = 0;
  public final double left_protech = 320;
  public final double right_protech = 320;
  
  public final double left_back_protech = 0 ;
  public final double right_back_protech = 0;

  public final double left_front_protech = 350; 
  public final double right_front_protech = 350;

  
  
  public double lastTime;
  double currentTime;
  public boolean hasSavedFirstTime = false;
  public boolean timerStarted;

  public final double speed_x = 0.25; //ปกติไม่ได้ใช้
  public final double speed_y = 0.15;
  public final double speed_z = 0.2;
  public final double speed_z_state = 0.2; 
  public final double speed_y_protec = 0.2;
  public final double error_x_protec = 0.0015; //ปกติไม่ได้ใช้
  public final double error_z_protec = 0.0015;
  public final double error_z_middle = 0.001;
  public final double determine_protec = 0.02;
  public final double time_front_block = 0.7;
  public final double time_left_block = 0.1;
  public final double time_right_block = 0.2;

}
