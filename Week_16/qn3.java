package Week_16;

public class qn3
{
    public static void main(String [] args){
        
        String name = new String("Abhas Shakya");
        System.out.println("Index of a");
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        
        System.out.println(name.charAt(2));
        
        String sentence = "My name is Abhas Shakya";
        System.out.println(sentence.contains("Abhas"));
        System.out.println(sentence.contains("Ram"));
    }
}