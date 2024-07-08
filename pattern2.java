public class pattern2 {
    public static void  main(String[] args){
        char end ='D', start='A';
        for(int i=1;i<=(end-'A'+1);++i)
        {
            System.out.println(end-'A'+1);
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
            }
            ++start;
            System.out.println();
        }
    }
}
