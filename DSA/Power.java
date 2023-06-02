package DSA;

import java.util.*;

public class Power {
    public static void main(String[] hdfb) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 1;
        for (int i = 0; i < y; ++i) {
            result *= x;

        }
        System.out.println(result);
    }
}