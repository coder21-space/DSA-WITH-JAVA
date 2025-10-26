import java.util.*;
public class incometax {
    public static void main(String arge[]){
     Scanner sc = new Scanner(System.in);
     int income = sc.nextInt();

     if (income>=100000){
        System.out.println("you have to pay tex ="+(income*0.3));

     }else if (income>=500000 && income<=100000){
         System.out.println("you have to pay tax ="+(income*0.2));
     }else {
        System.out.println("you dont have to pay tex 😊");
     }
     

    }

    
}
