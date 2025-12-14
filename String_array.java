import java.util.Scanner;
/**
 * Write a description of class String_array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class String_array
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String [] names = {"Saroj","Sushant","Ujjwal","Rabina","Sandesh"};
        System.out.println("Student names");
        for (int i=0;i<names.length;i++){
            System.out.println("Students name:");
        }
        System.out.println("Name at index 2 (3rd element):"+names[2]);
        names[4] = "Abhas";
        System.out.println("Name index 4 updated value: "+names[4]);
        System.out.println("Enter a name:");
        String newName = scan.nextLine();
        names[1] = newName;
        System.out.println("Updated names");
        for (int i =0;i<names.length;i++){
        System.out.println(names[i]);
    }
}
}