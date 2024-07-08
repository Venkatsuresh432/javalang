public class cls {
    public static void main(String[] args)
    {
        //Static and instance method
        cls2.getname("Suresh");
    }
}

class cls2
{
    static String name;
    public static void getname(String str)
        {
            name = str;
            System.out.println(name);
        }
}
