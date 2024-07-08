import java.util.Scanner;
public class MatArr {
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter array matrix: ");
        int mat = sn.nextInt();
        System.out.print("Enter Row Value: ");
        int row = sn.nextInt();
        System.out.print("Enter col value: ");
        int col = sn.nextInt();
        int [][] mat1 = new int[row][col];
        int [][] mat2 = new int[row][col];
        for(int k=1; k<=mat; k++)
        {
            System.out.println("Enter matrix "+k+": ");
            for(int i=0; i<row; i++)
            {
                for(int j=0; j<col; j++)
                    {
                        mat1[i][j]= sn.nextInt();
                    }
                System.out.println();
            }
        }
        for(int k=1; k<=mat; k++)
        {
            System.out.println("matrix "+k+" is: ");
            for(int i=0; i<row; i++)
            {
                for(int j=0; j<col; j++)
                    {
                      System.out.print(mat1[i][j]+"  ");
                    }
                System.out.println();
            }
            System.out.println();
        }
        if (mat >= 2) {
            for(int k=1; k<=mat; k++)
            {
                for(int i=0; i<row; i++)
                {
                    for(int j=0; j<col; j++)
                    {
                        mat2[i][j]+=mat1[i][j];
                    }
                }
            }
            System.out.println("OUTPUT IS (ADDITION): ");
            for(int i=0; i<row; i++)
            {
                for(int j=0; j<col; j++)
                {
                    System.out.print(mat2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("PROGRAM EXECUTED");
        }
        else
        {
            System.out.println("PROGRAM EXECUTED");
        }
    }
}
