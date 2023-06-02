import java.util.*;

public class P50 {
    public static void main(String[] gdsdh) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;

            }
        }
        if (count >= 1) {
            System.out.println("not prime");
        } else {
            System.out.println("prime ");
        }
    }

}
