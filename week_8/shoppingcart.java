package week_8;

public class shoppingcart
{
    private String itemname;
    private double itemprice;
    private int quantity;
   
    public shoppingcart (String itemname , double itemprice)
    {
        this.itemname = itemname;
        this.itemprice = itemprice;
    }
    
    public String getitemname()
    {
        return this.itemname;
    }
    
   
    public double getitemprice()
    {
        return this.itemprice;
    }
    
    public void setquantity(int quantity)
    {
        this.quantity = quantity;
    }
    public int getquantity()
    {
        return this.quantity;
    }
    
    public double calculateTotal()
    {
        return itemprice * quantity;
    }
    public double calculateDiscountedTotal(double discountPercent)
    {
        double total = calculateTotal();
        double discountAmount = total * discountPercent / 100;
        return total - discountAmount;
    }
    public void displayCart()
    {
        System.out.println("Item Name : " + itemname);
        System.out.println("Item Price : Rs. " + itemprice);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Price : Rs. " + calculateTotal());
    }
}