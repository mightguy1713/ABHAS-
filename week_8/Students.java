package week_8;

public class Students
{
    private int id;
    private String name;
    private String address;
    private long phone_no;
    private static String collegename;
    
    public void setid(int id)
    {
        this.id = id;
    }
    
    public int getid()
    {
        return this.id;
    }
    
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return this.name;
    }
    
    public void setaddress(String address){
        this.address = address;
    }
    public String getaddress(){
        return this.address;
    }
    
    public void setphone_no(long phone_no){
        this.phone_no = phone_no;
    }
    public long getphone_no(){
        return this.phone_no;
    }
    
    public void setcollegename(String collegename){
        this.collegename = collegename;
    }
    public String collegename(){
        return this.collegename;
    }
    void displayinfo(){
        System.out.println("Name :" +name);
        System.out.println("Id :" +id);
        System.out.println("Address :" +address);
        System.out.println("Phone no :" +phone_no);
        System.out.println("College name :" +collegename);
        System.out.println();
    }
}