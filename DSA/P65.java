import java.util.*;

public class P65 {
    public static void main(String[] dsgf) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int a = 1;
        int b = 1;
        int c;
        for (int i = 0; i < 20; i++) {

            c = a + b;
            b = a;
            a = c;
            for (int j = 2; j < c; j++) {
                int count = 0;
                if (c % j == 0) {
                    count++;
                }
                if (count == 0) {
                    if (c == num1) {
                        System.out.println("fprime");
                        break;
                    }
                }

            }

        }

    }
}