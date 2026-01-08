package Week_10;

public class bikeDelivery extends DeliveryPartner
{
    public bikeDelivery(int id , String name , double basePay){
        super(id , name , basePay);
    }
    
    @Override
    public double calculatePayment(){
        return super.calculatePayment() + 2000;
    }
    
    public double calculatePayment(int extraOrder){
        return calculatePayment() + (extraOrder * 60);
    }   
}