import java.util.*;

public class switch_case {
    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("mango");
                break;
            case 2:
                System.out.println("banana");
                break;
            case 3:
                System.out.println("orange");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
