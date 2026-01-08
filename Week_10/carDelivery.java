package Week_10;

public class carDelivery extends DeliveryPartner
{
    public carDelivery(int id , String name , double basePay){
        super(id , name , basePay);
    }
    
    @Override
    public double calculatePayment(){
        return super.calculatePayment() + 5000;
    }
    
    public double calculatePayment(int extraOrder){
        return calculatePayment() + (extraOrder * 150);
    }   
}