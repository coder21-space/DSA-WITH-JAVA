package questions;

import java.util.*;

public class que3 {
    public static void main(String arge[]) {
        // Question 3: Enter cost of 3 items from the user (using float data type) - a
        // pencil, a pen and
        // an eraser. You have to output the total cost of the items back to the user as
        // their bill.
        // (Add on : You can also try adding 18% gst tax to the items in the bill as an
        // advanced problem)
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the pencil price");
        float pencil = sc.nextFloat();
        System.out.println("please enter the pen price");
        float pen = sc.nextFloat();
        System.out.println("please enter the eraser price");
        float eraser = sc.nextFloat();

        float bill =(pencil+pen+eraser);
          System.out.println("total bill is your "+bill);

          //18% gst bill tex after payment
          float totalbill = 0.18f+bill;
            System.out.println("your final tex with bill is "+totalbill);


    }
}
