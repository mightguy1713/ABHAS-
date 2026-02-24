package Week_16;
import java.util.Scanner;

public class qn2
{
    public static void main(String[] args){
        System.out.println(" HelloWorld ".trim());
        
        String name = "Abhas Shakya";
        
        String part1 = name.substring(5);
        System.out.println("SubString part 1:" +part1);
        
        String part2 = name.substring(0,5);
        System.out.println("SubString part 2 : " +part2);
        
        Scanner scan = new Scanner(System.in);
        
        String[] words = name.split(" ");
        for(String word : words){
            System.out.println("Split :" +word);
        }
    }
}