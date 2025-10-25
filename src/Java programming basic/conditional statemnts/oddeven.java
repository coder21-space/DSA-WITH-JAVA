import java.util.*;

public class oddeven {
    public static void main(String arge[]) {
        System.out.println("give me some number ");
        // print if a number is odd and even
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("even number ");
        } else {
            System.out.println("odd number ");
        }
    }
}
