public class pattern5 {
    public static void main(String[] args)
    {
      int row=5, k=0;
      for(int i = 1; i <= row; ++i)
      {
          for(int sp=1; sp <= row-i; ++sp)
          {
              System.out.print("  ");
          }

          while(k != (2 * i) - 1)
          {
                System.out.print("* ");
                ++k;

          }
          System.out.println();
//          System.out.println(k);
      }
    }
}
