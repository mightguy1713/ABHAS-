package Week_7;

public class main_class
{
    public static void main(String [] args){
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 20;
        
        System.out.println("rectangle 1 details :");
        System.out.println("Length L1 : " +r1.length);
        System.out.println("Breath B1 : " +r1.breadth);
        System.out.println();
        
        Rectangle r2 = new Rectangle();
        r2.length = 50;
        r2.breadth = 100;
        
        System.out.println("rectangle 2 details :");
        System.out.println("Length L2 : " +r2.length);
        System.out.println("Breath B2 : " +r2.breadth);
        System.out.println();
        
        int area1= r1.length * r1.breadth;
        System.out.println("Area of rectangle 1 is :" +area1 + " cm^2");
        
        int area2 = r2.length * r2.breadth;
        System.out.println("Area of rectangle 2 is :" +area2 + " cm^2");
    }
}