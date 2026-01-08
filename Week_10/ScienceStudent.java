package Week_10;

public class ScienceStudent extends Student
{
    public ScienceStudent(int rollNo , String name , int marks){
        super(rollNo , name , marks);
    }
    
    @Override
    public String calculateResult(){
        return super.calculateResult();
    }
    
    public String calculateResult(int graceMarks){
        int total = getMarks() + graceMarks ;
        
        if(total >=45)
        return "Pass";
        else 
        return "fail";
    }
}