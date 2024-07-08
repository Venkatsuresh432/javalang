class box
{
    int l,b,h;// instance variable
    int vol()
    {
        return l*b*h;
    }
}
public class invoke
{
    public static void main(String[] args)
    {
        box bx=new box();
        bx.l=12; bx.b=6; bx.h=8;
        System.out.println(bx.vol());// invoke method
    }
}
