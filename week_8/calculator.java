package week_8;

public class calculator
{
    //instance method.
    
    //voud return type plus no parameter.
    public void displayinfo(){
        System.out.println("Welcome to the calculator.");
    }
    
    //void return type plus parameter.
    public void add(int a , int b) //formal parameters.
    {
        System.out.println("The sum of two numbers are :" +(a+b));
    }
    
    public void add(double a , double b)
    {
        System.out.println("The sum of two numbers are :" +(a+b));
    }
    
    public void add(int a , int b , int c)
    {
        System.out.println("The sum of three numbers are :" +(a+b+c));
    }
    //return type plus no parameter.
    public int getfixednumber()
    {
        return 10;
    }
    
    //return type plus parameter.
    public int multiply(int a , int b){
        return a*b;
    }
    
    //static method.
    public static int square(int a)
    {
        return a*a;
    }
}
