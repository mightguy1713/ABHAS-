
/**
 * Write a description of class MathOperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperation
{
    public static void main(String [] args){
        //Question no 1 
        //Arithmetic operators.
        int a = 30;
        int b = 15;
        System.out.println("Arithmetic operators are:");
        int sum = a+b;
        System.out.println("Sum is :"+sum);
        int diff = a-b;
        System.out.println("Difference is:" +diff);
        int prod = a*b;
        System.out.println("Product is:" +prod);
        int div = a/b;
        System.out.println("Division is:" +div);
        int mod = a%b;
        System.out.println("Modulus is:" +mod);
        System.out.println();
        
        //Unary operator
        System.out.println("Unary operator are:");
        int inc = ++a;
        System.out.println("Increment is:" +inc);
        int dec = --a;
        System.out.println("Decrement is:" +dec);
        System.out.println();
        
        //Assignment operator
        System.out.println("Assignment operators are:");
        int c =10;
        c +=4;
        System.out.println("Add and Assign :"+c);
        c -=5;
        System.out.println("Sub and Assign  :"+c);
        c *=2;
        System.out.println("Product and Assign :"+c);
        c /=5;
        System.out.println("Difference and Assign :"+c);
        c %=3;
        System.out.println("Modulus and Assign :"+c);
        System.out.println();
        
        //Relational operators.
        System.out.println("Relational opeartors are:");
        int d= 10;
        int e= 5;
        System.out.println(d==e);
        System.out.println(d!=e);
        System.out.println(d>e);
        System.out.println(d<e);
        System.out.println(d>=e);
        System.out.println(d<=e);
    }
        
}