import java.util.*;
import java.lang.Math;

public class P54 {
    public static void main(String[] hdfs) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int amg = num;
        int sum = 0, digit = 0;

        // while (num > 0) {
        // int x = num / 10;
        // digit++;
        // num = num / 10;

        // }
        int poww = (int) Math.log10(num) + 1;
        System.out.println(poww);
        num = amg;
        while (num > 0) {
            int y = num % 10;
            sum += Math.pow(y, poww);
            num = num / 10;
        }
        if (sum == amg) {
            System.out.println("amg num");
        } else {
            System.out.println("not amg");
        }

    }

}
