import java.util.ArrayList;
import java.util.List;

public class arr3 {
    public static void main(String[] args)
    {
        List<String> bikes=new ArrayList<>();
        bikes.add("Yamaha");
        bikes.add("KTM");
        bikes.add("Bajaj");
        bikes.add("Honda");
        bikes.add("RE");

            System.out.println("Print list: ");
            for(String b:bikes)
            {
                System.out.print(b+"  ");

            }
    }
}
