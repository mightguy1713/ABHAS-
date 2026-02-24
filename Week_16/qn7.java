package Week_16;

public class qn7
{
    public static boolean isValidPhone(String phone) {
        return phone.matches("^(98|97)\\d{8}$");
    }

    public static void main(String[] args) {
        System.out.println(isValidPhone("9841234567")); 
        System.out.println(isValidPhone("1234567890"));
        System.out.println(isValidPhone("98412345"));   
        System.out.println(isValidPhone("98-412-345"));
    }
}