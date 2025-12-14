/**
 * Write a description of class Miniseating2d here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Miniseating2d
{
    public static void main(String[] args)
    {
        String[][] seats = new String[2][3];
        seats[0][0] = "Diya";
        seats[0][1] = "Abhas";
        seats[0][2] = "Ramrai";
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                String seat = seats[i][j];
                if (seat == null) seat = "empty";
                System.out.print("(" +seat+ ")");
            }
            System.out.println();
        }
   }
}