package Week_10;

public class DeliveryPartner
{
    private int partnerId;
    private String name;
    private double basePay;
    
    public DeliveryPartner(int partnerId , String name , double basePay){
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay;
    }
    public int getpartnerId(){
        return partnerId;
    }
    public void setpartnerId(int getpartnerId){
        this.partnerId = partnerId;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public double getbasePay(){
        return basePay;
    }
    public void setbasePay(double getbasePay){
        this.basePay = basePay;
    }
    public double calculatePayment(){
        return basePay;
    }
    
    @Override
    public String toString(){
        return "ID :" +partnerId + " .Name :" +name + " .Base Pay :" +basePay ;
    }
}
