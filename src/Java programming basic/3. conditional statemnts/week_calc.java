import java.util.*;
public class week_calc {
    public static void main (String arge[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter number 1-7 to know week name");
        int number =sc.nextInt();

        switch (number){
            case 1: System.out.println("monday");
            break;
             case 2: System.out.println("tue");
            break;

             case 3: System.out.println("web");
            break;
             case 4: System.out.println("thr");
            break;
             case 5: System.out.println("fri");
            break;
             case 6: System.out.println("sat");
            break;

             case 7: System.out.println("sun");
            break;
             default : System.out.println("wrong entery");
            
        }
    }
    
}
