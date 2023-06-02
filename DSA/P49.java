import java.util.*;
import java.lang.Math;

public class P49 {
    public static void main(String[] adsh) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // while (x > 0 && y > 0) {
        // if (x > y) {
        // x = x % y;
        // } else if (y > x) {
        // y = y % x;
        // }
        // }
        // if (x == 0) {
        // System.out.println(y);
        // }
        // if (y == 0) {
        // System.out.println(x);
        // }
        int mi = Math.min(x, y);
        while (mi > 0) {
            if (x % mi == 0 && y % mi == 0) {

                System.out.println(mi);
                break;

            }
            mi--;

        }

    }
}
