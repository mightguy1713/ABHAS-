/**
 * Write a description of class wwe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wwe
{
    public static void main(String[] args){
        int age = 15; //int : 4 byte.
        System.out.println(age);
        //implicit typecasting
        double dg= age;//double : 8 byte.
        System.out.println(dg);
        
        //explicit typecasting
        double weight = 59.56;
        System.out.println(weight);
        int wei = (int)weight;
        System.out.println(wei);
        
        byte t=2;
        byte c=3;
        byte h=(byte)(t+c);
        System.out.println(h);
        
        short a= 5;
        short b= 10;
        short d= (short) (a+b);
        System.out.println(d);
        //Escape sequence.
        System.out.println("Hello\nWorld");
        System.out.println("Hello\t\tWorld");
        System.out.println("Hey \"Hey\"");
        System.out.println("\u2764");
        
    }
}