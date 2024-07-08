public class TArr2 {

        public static void main(String[] args)
        {
            int [][]ar = new int[4][3];
            ar[0][0]= 12;
            ar[1][0] = 34;
            ar[2][0] = 56;
            ar[3][0] = 23;
            for(int i=0;i<ar.length;i++)
            {
                System.out.println("i-length=: "+ar.length);
                System.out.println("print i: "+i);
                for(int j=0;j<ar[i].length;j++)
                {
                    System.out.print("print j: " + j + " :");
                    System.out.println(ar[i][j]);
                }

                System.out.println("j-length: "+ar[i].length);
                System.out.println();
            }

        }
    }

