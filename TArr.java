import java.util.*;
public class TArr {


        public static void main(String[] args)
        {
            Scanner sn=new Scanner(System.in);
            System.out.print("Enter an Row Value: ");
            int row =sn.nextInt();
            System.out.print("Enter an Column Value: ");
            int col =sn.nextInt();
            int [][]ar= new int[row][col];
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print("Enter an value of"+i+"."+j+": ");
                    ar[i][j]=sn.nextInt();
                }
            }
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(" "+ar[i][j]);
                }
                System.out.println();
            }
        }
    }

