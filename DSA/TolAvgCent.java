package DSA;

import java.util.*;

public class TolAvgCent {
    public static void main(String[] askudh) {
        Scanner sc = new Scanner(System.in);

        float marks = 0.0f;
        float total = 0.0f;
        for (int i = 1; i <= 5; ++i) {
            marks = sc.nextFloat();

            total += marks;

        }
        System.out.println("total marks =" + total);
        System.out.println("average = " + total / 5);

        System.out.println("percentage = " + (total / 500) * 100);

    }

}