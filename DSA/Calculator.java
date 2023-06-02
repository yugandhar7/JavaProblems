package DSA;

import java.util.*;

public class Calculator {
    public static void main(String[] hadsbd) {
        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        char ch = sc.next().charAt(0);
        float y = sc.nextFloat();

        switch (ch) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;

        }

    }
}
