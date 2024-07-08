public  class stack {
    static int []st =new int[10];
    static  int tos;
    stack()
    {
       tos = -1;
    }
    static void push(int item)
    {
        if(tos >= 9)
            System.out.println("Stack is overflow");
        else
            st[++tos] =item;
    }
   static int pop()
    {
        if(tos>0)
            return st[tos--];
        else
            System.out.println("Stack is Underflow");
            return -1;
    }
}
