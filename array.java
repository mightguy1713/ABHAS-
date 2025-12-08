
/**
 * Write a description of class array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array
{
    public static void main (String [] args){
        int [] age; //array decleration.
        age = new int [5]; //array construction.
        
        System.out.println("Length of this array :" +age.length);
        age[0] = 10;
        age[1] = 20;
        age[2] = 30;
        age[3] = 40;
        age[4] = 50;
        for (int i = 0; i<age.length ; i++)
        {
            System.out.println(age[i]);
        }

        int [][] matrix = {{1,2,4},{5,6,7},{8,9,10}};
        for (int i=0; i<matrix.length ; i++){
            for (int j=0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}