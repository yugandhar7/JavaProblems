package DSA;

import java.util.*;

public class FtoC {
    public static void main(String[] jkah) {
        Scanner sc = new Scanner(System.in);

        float fahrenhit = sc.nextFloat();

        float celsius = (fahrenhit - 32) * 5 / 9;
        System.out.println(fahrenhit + "=" + celsius + "celsius");

    }
}
