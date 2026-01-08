package Week_10;

public class Student
{
    private int rollNo;
    private String name;
    private int marks;
    
    public Student(int rollNo , String name , int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    public int getrollNo(){
        return rollNo;
    }
    
    public void setrollNo(int rollNo){
        this.rollNo = rollNo;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getMarks(){
        return marks;
    }
    public void setMarks(){
        this.marks = marks;
    }
    
    public String calculateResult(){
        if(marks >= 40)
        return "Pass";
        else 
        return "fail";
    }
    
    @Override
    public String toString(){
        return "Roll No :" + rollNo + " .Name :" + name + " .Marks :" +marks;
    }
}