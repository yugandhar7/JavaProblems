package DSA;

import java.util.*;

public class Leap {
    public static void main(String[] sha) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("leap year");

        } else if (year % 4 == 0) {
            System.out.println(" leap year");
        } else {
            System.out.println("not leap year");
        }
    }

}
