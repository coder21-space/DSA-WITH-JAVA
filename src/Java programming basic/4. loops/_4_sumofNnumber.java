import java.util.*;

public class _4_sumofNnumber {

    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;


        int i = 1;
        while (i <= n) {
          sum +=i;
            i++;

        }
        System.out.println("the sum of N numer is " +sum);

    }

}
