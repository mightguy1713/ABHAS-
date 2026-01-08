package Week_10;

public class person
{
    private String name;
    private int id;
    
    public person(String name , int id){
        this.id = id;
        this.name = name;
    }
    
    public int getid(){
        return id;
    }
    public void setid(int getid){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(int getName){
        this.name = name;
    }
    public double calculateSalary(){
        return 0.0;
    }
    @Override 
    public String toString(){
        return "ID :"+ id + "Name :" +name;
    }
}