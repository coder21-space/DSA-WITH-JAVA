import java.util.*;
public class incometax2 {
    public static void main(String arge[]){
     Scanner sc = new Scanner(System.in);
     int income = sc.nextInt();
     int tax =0;

     if (income>=100000){
        tax = (int)(income*0.3);

     }else if (income>=500000 && income<=100000){
         tax = (int)(income*0.2);
     }else {
        tax = 0 ;
     }
     System.out.println("your tax is "+tax);

    }

    
}
