package Week_7;

public class main
{
    public static void main (String [] args){
        // classname s1 = new classname();
        student s1 = new student();
        s1.name = "Abhas";
        s1.collegeid = 39332;
        s1.age = 18;
        s1.study(); 
        
        System.out.println(s1.name);
        System.out.println(s1.collegeid);
        System.out.println(s1.age);
        
        student s2 = new student();
        s2.name= "Diya";
        s2.collegeid = 39923;
        s2.age = 18;
        s2.study();
        
        System.out.println(s2.name);
        System.out.println(s2.collegeid);
        System.out.println(s2.age);
    }
}