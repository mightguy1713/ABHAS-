package Week_10;

public class ManagementStudent extends Student
{
    public ManagementStudent(int rollNo , String name , int marks){
        super(rollNo , name , marks);
    }
    
    @Override
    public String calculateResult(){
        return super.calculateResult();
    }
    
    public String calculateResult(int graceMarks){
        int total = getMarks() + graceMarks ;
        
        if(total >=40)
        return "Pass";
        else 
        return "fail";
    }
}