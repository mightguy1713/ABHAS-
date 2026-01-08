package week_8;

public class mainclass
{
    public static void main(String [] args){
        calculator calc = new calculator();
        calc.displayinfo();
        calc.add(10,20);
        int fixednum = calc.getfixednumber();
        System.out.println("My fixed number is : " +fixednum);
        System.out.println(calc.getfixednumber());
        
        int multiply = calc.multiply(10,20);
        System.out.println("The multiplication of two numbers are: " +multiply);
        
        //static method invocation or invoking static method.
        //using class name.
        calculator.square(10);
        
        //constructor.
        student s1 = new student("Abhas" , 39332);
        
    }
}