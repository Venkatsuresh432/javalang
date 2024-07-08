public class cons {
    public static void main(String[] args)
    {
       constr ct= new constr();
       constr ct2= new constr();
       System.out.println("Perform Addition: "+ct.constr(23,44));
       System.out.println("Perform SI: "+ct2.constr(12000,5,6));
    }
}
class constr
{
    int constr(int a, int b)
    {
        return a+b;
    }
   int constr(int p,int n, int r)
    {
        return (p*n*r)/100;
    }

}