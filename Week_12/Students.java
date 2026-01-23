package Week_12;

public class Students
{
    private String name;
    private String phone;
    private String group;
    
    public Students(String name , String phone , String group)
    {
        this.name = name;
        this.phone = phone;
        this.group = group;
    }
    //getters and setters.
    
    public String getName(){
        return name;
    }
    public void setName(String Name){
        this.name = name;
    }
    
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getGroup(){
        return group;
    }
    public void setGroup(String group){
        this.group = group;
    }
    
    @Override
    public String toString(){
        return "\n Student details --> student name: "+ this.name +", student phoneno: " + this.phone + ", student group: " + this.group;
    }
}