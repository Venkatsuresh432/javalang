class copy{
    int l,b,h;
    int add(int l,int b,int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
        return l+b+h;
    }
   // using heap method to save values
    boolean match(copy cp)
    {
       if(l == cp.l && b == cp.b && h == cp.h) {
//           System.out.println("true");
           return true;
       }
       else
            return false;
    }   
}
public class passingobj {
    public static void main(String[] args)
    {
        copy c1=new copy();
        c1.add(12,4,6);
        copy c2=new copy();
        c2.add(12,4,6);
       System.out.println(c1.match(c2));
    }
}
