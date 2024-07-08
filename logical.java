public class logical {
    public static void main(String[] args)
    {
        int a=10,b=12,c=22,d=30;
        boolean bl =true;
        if((a>b) && (c<d))
        {
            System.out.println("AND: "+bl);
        }
        else if(a>b || c<d)
        {
            System.out.println("OR: "+bl);
        }
        else
        {
            System.out.println("error");
        }
//
        System.out.println( (a>b)&&(c<d) );
        System.out.println( (a>b)||(c<d) );


    }
}
//ternary operator
//expression ? var1 : var2
