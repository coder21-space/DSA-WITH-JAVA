package questions;
import java.util.*;
public class que1 {
    public static void main(String arge[]){

        // Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)
         Scanner sc = new Scanner(System.in);

         int A = sc.nextInt();
         int B = sc.nextInt();
         int C = sc.nextInt();
         int avarage = (A+B+C)/3;
         System.out.println("avarage of 3 rendom number is "+avarage);

    }
}