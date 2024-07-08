class dec
{
    int p,n,r;
    dec(int a,int b,int c)
    {
          p=a;
          n=b;
          r=c;
    }
    int display()
    {
        return (p*n*r)/100;
    }
}
public class cons2 {
    public static void main(String[] args)
    {
        dec c1 =new dec(12000,3,8);
        System.out.println("op is: "+c1.display());
    }
}
