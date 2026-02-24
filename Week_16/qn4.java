package Week_16;

public class qn4
{
    public static void main(String [] args){
        String text = "  AbhAs ShAkyA";
        String trimmedString = text.trim();
        String[] words = trimmedString.split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < words.length; i++){
            String first = words[i].substring(0,1).toUpperCase();
            String rest = words[i].substring(1).toLowerCase();
            
            System.out.println("First: " +first);
            System.out.println("Rest: " +rest);
        }
        
    }
}