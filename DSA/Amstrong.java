package DSA;

import java.util.*;
import java.lang.Math;

public class Amstrong {
    public static void main(String[] asghdj) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        int sum = 0;
        int digit = 0;
        while (temp > 0) {
            int n = temp % 10;
            digit++;
            temp = temp / 10;

        }

        temp = num;
        while (temp > 0) {
            int x = temp % 10;
            sum += Math.pow(x, digit);
            temp = temp / 10;
        }
        System.out.println(sum);
        if (sum == num) {
            System.out.println("amstrong number");
        } else {
            System.out.println("not a amstrong  num");
        }
    }
}