import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (Abhas)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[] args){
        
        //Question no 6.
        int waterlevel = 1100;
        System.out.println("Current water level: " +waterlevel );
        String isValid = (waterlevel >= 1000) ? " Warning ! Water level has reached 1000L " : "Normal water level" ;
        System.out.println(isValid);
    }
}