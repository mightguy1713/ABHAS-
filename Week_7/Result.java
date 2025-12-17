package Week_7;

public class Result
{
    int subject1, subject2, subject3;
    int total;
    double percentage;
    
   
    public Result(int s1, int s2, int s3)
    {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }
    void calculateTotal()
    {
        total = subject1 + subject2 + subject3;
    }
    void calculatePercentage()
    {
        percentage = total / 3.0;
    }
    void displayResult()
    {
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
    public static void main(String [] args){
        Result r1 = new Result (80,90,50);
        Result r2 = new Result (74,84,96);
        
        r1.displayResult();
        r2.displayResult();
    }
    
}