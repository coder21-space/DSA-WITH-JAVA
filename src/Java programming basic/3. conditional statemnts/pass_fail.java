import java.util.*;
public class pass_fail {
    public static void main(String arge[]){
        // check if student pass or fail
        Scanner sc =new Scanner(System.in);
        int marks =sc.nextInt();
        String result =(marks>=33)?"pass":"fail";
        System.out.println( "your are "+result);
    }
    
}
