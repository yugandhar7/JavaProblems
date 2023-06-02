package DSA;

import java.util.*;

public class Div511 {
    public static void main(String[] asj) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible bye 5 and 11");
        } else {
            System.out.println(num + " is not divisible by 5 and 11");
        }

    }
}
