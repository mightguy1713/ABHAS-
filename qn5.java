/**
 * Write a description of class qn5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qn5
 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <=n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.println(j);
            }
            System.out.println();
        }
    }
}

