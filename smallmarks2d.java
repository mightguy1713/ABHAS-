/**
 * Write a description of class smallmarks2d here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class smallmarks2d
{
    public static void main(String[] args)
    {
        int total = 0;
        int[][] marks = {{80, 75},{90, 85}};
        System.out.println("Computer Maths");
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(marks[i][j] + "\t");
                total += marks[i][j];
            }
            System.out.println(" Total = " + total);
        }
   }
}