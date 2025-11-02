import java.util.*;
public class _12_continueque {
    public static void main ( String arge[]){
        Scanner sc = new Scanner(System.in);

        do{
             System.out.println("Enetr number that not multiple of 10");
            int n =sc.nextInt();
            if(n%10==0){
                continue;
              
            }  System.out.println("your number is  "+n);

        }while(true);
    }
    
}
