import java.util.Scanner;
/**
 * Write a description of class simplenumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class simplenumber
{
    public static void main(String [] args){
        int sum = 0;
        int avg = 0;
        Scanner scan = new Scanner(System.in);
        int [] value = {10,20,30,40,50};
        System.out.println("Scores of five students");
        for (int i =0; i<value.length; i++){
            System.out.println("values are: "+value[i]);
        }
        sum = value[0]+value[1]+value[2]+value[3]+value[4];
        System.out.println("Sum of all numbers: " +sum);
        avg = sum/5;
        System.out.println("Avg of all numbers: " +avg);
        
        int highest = value[0];
        int lowest = value[0];
        for (int i = 1; i < value.length; i++) {
        if (value[i] > highest) {
        highest = value[i];
    }
        if (value[i] < lowest) {
        lowest = value[i];
    }
}
System.out.println("Highest score: " + highest);
System.out.println("Lowest score: " + lowest);   
    }
}