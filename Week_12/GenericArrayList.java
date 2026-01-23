package Week_12;
import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayList
{
    public static void main(String [] args){
    ArrayList<Integer> numbers = new ArrayList();
    ArrayList<String> names = new ArrayList();
    
    numbers.add(5);
    numbers.add(10);
    numbers.add(15);
    numbers.add(20);
    numbers.add(25);
    
    names.add("Abhas");
    names.add("Diya");
    names.add("Ram");
    names.add("Sita");
    names.add("Abdica");
    
    System.out.println("Names using ArrayList: ");
    for (String name : names){
        System.out.println(name);
    }
    
    //Traversing using iterator
    System.out.println("Numbers using Iterator :");
    Iterator<Integer> num = numbers.iterator();
    while(num.hasNext())
    {
        System.out.println(num.next());
    }
    
    System.out.println("Names using Iterator :");
    Iterator<String> name = names.iterator();
    while(name.hasNext())
    {
        System.out.println(name.next());
    }
    
    names.remove(2);
    System.out.println(names);
    
    System.out.println(names.size());
    System.out.println(numbers.size());
    
    numbers.clear();
    System.out.println(numbers);
    
    names.get(2);
    System.out.println(names);
    
    names.get(3);
    System.out.println(names);
 }
}