import java.util.Scanner;
public class TArr3 {
        public static void main(String[] args)
        {
            Scanner sn =new Scanner(System.in);
            System.out.print("Enter Row Value: ");
            int row = sn.nextInt();
            System.out.print("Enter col value: ");
            int col = sn.nextInt();
            sn.nextLine();
            String [][] st=new String[row][col];
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {

                    System.out.print("String value of"+i+" "+j+"is: ");
                    st[i][j]=sn.nextLine();
                }
            }
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print("Entered Value is: "+st[i][j]+"  ");
                }
                System.out.println();
            }

        }
    }


