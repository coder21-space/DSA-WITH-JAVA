import java.util.*;
public class largest_of_3number {
    public static void main(String arge[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        if ((a>=b) && (a>=c)){
            System.out.println(a+" is a largest number");
        }else if (b>=c){
            System.out.println(b+" is a largest number");
    }else
    System.out.println(c+" is a largest number");
}
}
