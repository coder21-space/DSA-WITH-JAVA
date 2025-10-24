package questions;

import java.util.*;

public class que2 {
    public static void main(String arge[]) {
        // Question 2: In a program, input the side of a square. You have to output the
        // area of the
        // square.
        // (Hint : area of a square is (side x side))
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        Float area = side*side;
        System.out.println("area of the square is " +area);

    }

}
