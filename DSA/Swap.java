package DSA;

import java.util.*;

public class Swap {
    public static void main(String[] args) {

        int num1 = 35;
        int num2 = 45;

        // int temp = num1;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1);
        System.out.println(num2);

    }
}
