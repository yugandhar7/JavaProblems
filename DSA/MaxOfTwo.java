package DSA;

import java.util.*;

public class MaxOfTwo {
    public static void main(String[] gds) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int y = sc.nextInt();

        switch (x / y) {

            case 1:
                System.out.println(x + " is  grater then" + y);
                break;
            case 0:
                System.out.println(y + " is grater  then " + x);

        }

    }
}
