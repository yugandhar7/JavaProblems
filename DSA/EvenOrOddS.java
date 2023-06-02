package DSA;

import java.util.*;

public class EvenOrOddS {
    public static void main(String[] hsdk) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch (num % 2) {

            case 0:
                System.out.println(num + " is even");
                break;
            case 1:
                System.out.println(num + " is odd");
        }
    }

}
