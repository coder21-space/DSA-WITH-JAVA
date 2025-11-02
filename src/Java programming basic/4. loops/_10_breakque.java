import java.util.*;
public class _10_breakque {
    public static void main(String arge[]){
        Scanner sc = new Scanner(System.in);
    
        do{
    int n =sc.nextInt();
    if (n%10==0){
        break;
    
    }    System.out.println(n);
        }while(true);
        System.out.println("break");
       
    }  
}
