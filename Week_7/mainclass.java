package Week_7;

public class mainclass
{
    public static void main(String [] args){
        Book b1 = new Book();
        b1.title = "The lion king.";
        b1.author = "Abhas Shakya.";
        b1.price = 750.50;
        b1.read();
        
        System.out.println("Book 1 details:");
        System.out.println("Title :" + b1.title);
        System.out.println("Author :" + b1.author);
        System.out.println("Price :" + b1.price);
        System.out.println();
        
        Book b2 = new Book();
        b2.title = "Philosophy";
        b2.author = "Annal Shrestha.";
        b2.price = 1000.50;
        b2.read();
        
        System.out.println("Book 1 details:");
        System.out.println("Title :" + b2.title);
        System.out.println("Author :" + b2.author);
        System.out.println("Price :" + b2.price);
        System.out.println();
    }
}