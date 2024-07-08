public class pattern4 {
    public static void main(String[] args)
    {
        char last='E',first='A';
        for(int i=(last - first +1);i>=1;--i)
        {
            System.out.println(i);
            for(int j=1;j<=i;j++)
            {
                System.out.print(first+" ");
            }
            ++first;
            System.out.println();
        }
    }
}
