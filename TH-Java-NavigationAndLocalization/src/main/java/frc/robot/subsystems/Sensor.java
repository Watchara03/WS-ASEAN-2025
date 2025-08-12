package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;
import com.studica.frc.Lidar;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Sensor extends SubsystemBase
{
    /**
     *  Switch
     */
    private final DigitalInput SW_Start ;
    private final DigitalInput SW_Emmer ;
    private final DigitalInput SW_Reset;
    private final DigitalInput SW_Stop;

    
    /**
     * IMU
     */
    private AHRS navx;


    /**
     * Lidar
     */
    // Lidar Library
    private Lidar lidar;
    // Lidar Scan Data Storage Class
    private Lidar.ScanData scanData;
    // Dashboard flag to prevent updating when not scanning
    public boolean scanning = true;

    private String currentLidarState = "";

        
    private float currentAngle = -1;
    private float currentDistance = 0;
    private Thread lidarThread;
    
    /**
     * Shufflboard
     */
    private ShuffleboardTab tab = Shuffleboard.getTab("Sensor");
    private NetworkTableEntry swStart = tab.add("Start",false).getEntry();
    private NetworkTableEntry isMoving = tab.add("isMoving",false).getEntry();
    private NetworkTableEntry SwStop = tab.add("Stop",false).getEntry();
    private final NetworkTableEntry SwReset = tab.add("SwReset", false).getEntry();
    private final NetworkTableEntry SWStop = tab.add("SWStop", false).getEntry();
    private NetworkTableEntry ValueAngle = tab.add("Angle",0).getEntry();   
    private NetworkTableEntry Lidar_Distance_front = tab.add("Lidar_Distance_front",0).getEntry();
    private NetworkTableEntry Lidar_Distance_right = tab.add("Lidar_Distance_right",0).getEntry();
    private NetworkTableEntry Lidar_Distance_left = tab.add("Lidar_Distance_left",0).getEntry();
    private NetworkTableEntry navx_angle = tab.add("navx_angle",0).getEntry();
    private NetworkTableEntry navx_AccelX = tab.add("navx_AccelX",0).getEntry();
    private NetworkTableEntry navx_AccelY = tab.add("navx_AccelY",0).getEntry();
    private NetworkTableEntry navx_getVelocityX = tab.add("navx_getVelocityX",0).getEntry();
    private NetworkTableEntry navx_getVelocityY = tab.add("navx_getVelocityY",0).getEntry();
    private NetworkTableEntry navx_getRawMagX = tab.add("navx_getRawMagX",0).getEntry();
    private NetworkTableEntry navx_getRawMagY = tab.add("navx_getRawMagY",0).getEntry();
    private NetworkTableEntry navx_getRawGyroX = tab.add("navx_getRawGyroX",0).getEntry();
    private NetworkTableEntry navx_getRawGyroY = tab.add("navx_getRawGyroY",0).getEntry();
    private NetworkTableEntry navx_getWorldLinearAccelX = tab.add("navx_getWorldLinearAccelX",0).getEntry();
    private NetworkTableEntry navx_getWorldLinearAccelY = tab.add("navx_getWorldLinearAccelY",0).getEntry();
    private NetworkTableEntry navx_getPitch = tab.add("navx_getPitch",0).getEntry();
    private NetworkTableEntry navx_getRoll = tab.add("navx_getRoll",0).getEntry();
    private NetworkTableEntry navx_quaternionX = tab.add("navx_quaternionX",0).getEntry();
    private NetworkTableEntry navx_quaternionW = tab.add("navx_quaternionW",0).getEntry();
    private NetworkTableEntry navx_quaternionY = tab.add("navx_quaternionY",0).getEntry();
    private NetworkTableEntry navx_quaternionZ = tab.add("navx_quaternionZ",0).getEntry();
    private NetworkTableEntry navx_getTempC = tab.add("navx_getTempC",0).getEntry();

    public Sensor()
    {
        //** IMU */
        navx = new AHRS(SPI.Port.kMXP);
        
        //**Swith */
        SW_Start = new DigitalInput(Constants.START_BUTTON);
        SW_Emmer = new DigitalInput(Constants.EMERGENCY_BUTTON);
        SW_Reset = new DigitalInput(Constants.RESET_BUTTON);
        SW_Stop = new DigitalInput(Constants.STOP_BUTTON);

        //** Lidar */
        lidar = new Lidar(Lidar.Port.kUSB1); //Lidar will start spinning the moment this is called

        // Configure filters
        lidar.clusterConfig(50.0f, 5);

        // lidar.kalmanConfig(1e-5f, 1e-1f, 1.0f);
        // lidar.movingAverageConfig(5);
        // lidar.medianConfig(5);
        // lidar.jitterConfig(50.0f);

        // Enable Filter
        lidar.enableFilter(Lidar.Filter.kCLUSTER, true);
        startLidarThread(180);
    }

    /**
     * Starts the lidar if it was stopped
     */
    public void startScan()
    {
        lidar.start();
        scanning = true;
    }

    /**
     * Stops the lidar if needed. This will reduce the overhead of CPU and RAM by very little. 
     */
    public void stopScan()
    {
        lidar.stop();
        scanning = false;
    }

    public double getDistionLidar(int d)
    {
        // scanData.angle[degrees];
        scanData = lidar.getData();
        return scanData.distance[d];
        
    }

    public void startLidarThread(int targetAngle) {
        startScan();
        lidarThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                Lidar.ScanData data = lidar.getData();
                if (data != null && data.angle.length > targetAngle) {
                    currentAngle = data.angle[targetAngle];
                    currentDistance = data.distance[targetAngle];
                    SmartDashboard.putNumber("Angle[" + targetAngle + "]", currentAngle);
                    SmartDashboard.putNumber("Distance[" + targetAngle + "]", currentDistance);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });
        lidarThread.start();
    }
    public float getCurrentDistance() {
        return currentDistance;
    }
    
    public float getCurrentAngle() {
        return currentAngle;
    }

    public void stopLidarThread() {
        if (lidarThread != null && lidarThread.isAlive()) {
            stopScan();
            lidarThread.interrupt();
        }
    }



    public boolean getSwitchStart()
    {
        return !SW_Start.get() == true; //! revert value 
    }

    public boolean getSwitchEmergency() {
        return !SW_Emmer.get() == true;
    }

    public boolean getSwitchReset(){
        return !SW_Reset.get() == true;
      }
    
      public boolean getSwitchStop(){
        return !SW_Stop.get() == true;
      }


    public double getYaw()
    {
        return navx.getYaw();
    }

    public double getAngle()
    {
        return navx.getAngle();
    }

    public double getRawAccelX(){
        return navx.getRawAccelX();
    }
    
    public double getRawAccelY(){
        return navx.getRawAccelY();
    }
    public double getVelocityX(){
        return navx.getVelocityX();
    }
    public double getVelocityY(){
        return navx.getVelocityY();
    }
    public double getRawMagX(){
        return navx.getRawMagX();
    }
    public double getRawMagY(){
        return navx.getRawMagY();
    }
    public double getRawGyroX(){
        return navx.getRawGyroX();
    }
    public double getRawGyroY(){
        return navx.getRawGyroY();
    }
    public double getWorldLinearAccelX(){
        return navx.getWorldLinearAccelX();
    }
    public double getWorldLinearAccelY(){
        return navx.getWorldLinearAccelY();
    }
    public double getRoll(){
        return navx.getRoll();
    }
    public double getPitch(){
        return navx.getPitch();
    }
    public double getQuaternionW(){
        return navx.getQuaternionW();
    }
    public double getQuaternionX(){
        return navx.getQuaternionX();
    }
    public double getQuaternionY(){
        return navx.getQuaternionY();
    }
    public double getQuaternionZ(){
        return navx.getQuaternionZ();
    }
    public boolean isMoving(){
        return navx.isMoving();
    }
    public float getTempC(){
        return navx.getTempC();
    }




    public void resetYaw()
    {
        navx.zeroYaw();
    }

    @Override
    public void periodic()
    {

            ValueAngle.setDouble(getYaw());
            navx_angle.setDouble(getAngle());
            swStart.setBoolean(getSwitchStart());
            isMoving.setBoolean(isMoving());
            SwStop.setBoolean(getSwitchEmergency());
            SWStop.setBoolean(getSwitchStop());
            SwReset.setBoolean(getSwitchReset());
            Lidar_Distance_front.setDouble(getDistionLidar(0));
            Lidar_Distance_right.setDouble(getDistionLidar(90));
            Lidar_Distance_left.setDouble(getDistionLidar(270));
            navx_AccelX.setDouble(getRawAccelX());
            navx_AccelY.setDouble(getRawAccelY());
            navx_getVelocityX.setDouble(getVelocityX());
            navx_getVelocityY.setDouble(getVelocityY());
            navx_getRawMagX.setDouble(getRawMagX());
            navx_getRawMagY.setDouble(getRawMagY());
            navx_getRawGyroX.setDouble(getRawGyroX());
            navx_getRawGyroY.setDouble(getRawGyroY());
            navx_getWorldLinearAccelX.setDouble(getWorldLinearAccelX());
            navx_getWorldLinearAccelY.setDouble(getWorldLinearAccelY());
            navx_getRoll.setDouble(getRoll());
            navx_getPitch.setDouble(getPitch());
            navx_quaternionW.setDouble(getQuaternionW());
            navx_quaternionX.setDouble(getQuaternionX());
            navx_quaternionY.setDouble(getQuaternionY());
            navx_quaternionZ.setDouble(getQuaternionZ());
            navx_getTempC.setDouble(getTempC());

        

    }

}

