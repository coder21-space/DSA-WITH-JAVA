import java.util.*;
public class _1_pattern {
public static void main(String arge[]){
    int n=4;

    for (int i=1;i<=4;i++){
        for (int j=1;j<=i;j++) {  //n-i+1 for reverse
            System.out.print("*");
        }System.out.println(); 
    }

}

}