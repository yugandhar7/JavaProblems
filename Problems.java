import java.util.*;

public class Problems {
    public static boolean isPrime(int num) {
        int sum = 0;

        if (num <= 1)
            return false;
        for (int i = 2; i < num; ++i) {
            if (num % i == 0) {
                sum++;
            }
        }
        return sum == 0;

    }

    public static void main(String[] nsk) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("you entered a negative number");
                break;
            }
            if (isPrime(num)) {
                System.out.println(num + " is prime");
            } else
                System.out.println(num + " is not prime");
        }

    }
}