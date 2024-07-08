import java.util.Scanner;

public class TDArr {
    public static void main(String[] args)
    {
        Scanner sn =new Scanner(System.in);
        System.out.print("enter an row: ");
        int row =sn.nextInt();
        System.out.print("enter an col: ");
        int col =sn.nextInt();
        System.out.print("enter an arr: ");
        int ar =sn.nextInt();

        int [][][]array=new int[row][col][ar];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                for(int k=0;k<ar;k++)
                {
                    System.out.print(" ");
                    array[i][j][k]=sn.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                for(int k=0;k<ar;k++)
                {
                    System.out.print("Print Array value: "+array[i][j][k]+"  ");
                    ;
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}

