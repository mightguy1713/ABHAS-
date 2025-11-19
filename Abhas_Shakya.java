
/**
 * Write a description of class Abhas_Shakya here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Abhas_Shakya
{
    int age; // instance variable.
    static int qty; //static variable.
    public static void main(String[] args){
        //<Classname> <variable> = new <classname>(); [Syntax]
        int age=18; // local variable.
        
        Abhas_Shakya v1 = new Abhas_Shakya();//calling instance variable in static method.
        System.out.println(v1.age);
        System.out.println(age);
        System.out.println(Abhas_Shakya.qty);
        
    }
}
