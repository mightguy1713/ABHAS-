
/**
 * Write a description of class DefaultValues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValues
{

    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    int age;
    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        DefaultValues v1 = new DefaultValues();//calling instance variable in static method.
        System.out.println(v1.age);
        System.out.println("byte: " + obj.b);
        System.out.println("short: " + obj.s);
        System.out.println("int: " + obj.i);
        System.out.println("long: " + obj.l);
        System.out.println("float: " + obj.f);
        System.out.println("double: " + obj.d);
        System.out.println("char: '" + obj.c + "A"); 
        System.out.println("boolean: " + obj.bool);
        System.out.println("My name is abhas:");
    }
}