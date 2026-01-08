package week_8;
public class ShoppingApp
{
    public static void main(String[] args)
    {
        shoppingcart cart = new shoppingcart("Laptop", 60000);
        cart.displayCart();

        cart.setquantity(3);
        System.out.println("After updating quantity:");
        cart.displayCart();

        double discountedTotal = cart.calculateDiscountedTotal(10);
        System.out.println("Total after 10% discount (Festival Offer): Rs. " + discountedTotal);
    }
}


