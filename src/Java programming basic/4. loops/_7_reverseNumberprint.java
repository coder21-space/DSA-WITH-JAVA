import java.util.*;
public class _7_reverseNumberprint {
    public static void main(String arge[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0){
            int ln= n%10;
            System.out.print(ln);
             n = n/10;


        }System.out.println();
    }
    
}
