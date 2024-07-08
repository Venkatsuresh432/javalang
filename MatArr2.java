import java.util.*;
public class MatArr2 {
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("PERFORMING MATRIX ADDITION: ");
        System.out.print("Enter Row 1: ");
        int r1 = sn.nextInt();
        System.out.print("Enter Row 2: ");
        int r2 = sn.nextInt();
        System.out.print("Enter Col 1: ");
        int c1 = sn.nextInt();
        System.out.print("Enter Col 2: ");
        int c2 = sn.nextInt();
//----------------------------------------------------------------------------------------------------------------------
        if(r1 == r2 && c1 == c2)
        {
           int [][]arr1 = new int[r1][c1];
           int [][]arr2 = new int[r2][c2];
           int [][]arr3 = new int[r1][c1];
//----------------------------------------------------------------------------------------------------------------------
           System.out.println("Enter value for Array 1: ");
           for(int i=0;i<arr1.length;i++)
           {
               for(int j=0;j<arr1[i].length;j++)
               {
                 arr1[i][j]=sn.nextInt();
               }
               System.out.println();
           }
//----------------------------------------------------------------------------------------------------------------------
            System.out.println("Enter value for Array 2: ");
            for(int i=0;i<arr2.length;i++)
            {
                for(int j=0;j<arr2[i].length;j++)
                {
                    arr2[i][j]=sn.nextInt();
                }
                System.out.println();
            }
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("Performing Addition: ");
            for(int i=0;i<arr2.length;i++)
            {
                for(int j=0;j<arr2[i].length;j++)
                {
                    arr3[i][j] = arr1[i][j]+arr2[i][j];
                    System.out.print(arr3[i][j]+ "  ");
                }
                System.out.println();
            }
//----------------------------------------------------------------------------------------------------------------------
        }
        else
        {
            System.out.println("Please Check Row and Col are equal and Try again !");
        }

    }
}
