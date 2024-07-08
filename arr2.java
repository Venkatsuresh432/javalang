public class arr2 {
    public static void main(String[] args)
    {
        int[] ab=new int[5];
        String[] a={"bolo","dolu","bolu","khalia","chhota Bheem"};
        ab[0]=12;
        ab[1]=23;
        ab[2]=34;
        ab[3]=45;
        ab[4]=56;
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int j=0;j<ab.length;j++)
        {
            System.out.println("Arr2 value: "+ab[j]);
        }

     }
}
