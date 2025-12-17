package Week_7;

public class Mainclass2
{
    public static void main(String [] args){
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 100000;
        
        System.out.println("Mobile 1 :");
        System.out.println("M1 id :" +m1.brand);
        System.out.println("M1 name :" +m1.price);
        System.out.println();
        
        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 15000;
        
        System.out.println("Mobile 2 :");
        System.out.println("M2 id :" +m2.brand);
        System.out.println("M2 name :" +m2.price);
        System.out.println();
        
        Mobile m3 = new Mobile();
        m3.brand = "Google pixel";
        m3.price = 50000;
        
        System.out.println("Mobile 3 :");
        System.out.println("M3 id :" +m3.brand);
        System.out.println("M3 name :" +m3.price);
        System.out.println();
        
        System.out.println("Affordable :");
    if (m1.price < 20000) {
        System.out.println(m1.brand + ":" +"RS. " + m1.price);
    }
    if (m2.price < 20000) {
        System.out.println(m2.brand + ":" +"RS. " + m2.price);
    }
    if (m3.price < 20000) {
        System.out.println(m3.brand + ":" +"RS. " + m3.price);
    } 
}
}