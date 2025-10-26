import java.util.*;

public class leap_year {
    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year to check leapyear or not");
        int year = sc.nextInt();
        boolean x=((year%4==0 || year%100==0 || year%400==0))?true:false;
        System.out.println(x);
        

    }

}
