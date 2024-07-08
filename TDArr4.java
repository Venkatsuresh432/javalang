import java.util.*;
public class TDArr4{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int []a=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int max=a[0];
        for(int j=1;j<a.length;j++){
            if(a[j]>max)
                max=a[j];
        }
        System.out.println("maximum value : "+max);
    }

}

