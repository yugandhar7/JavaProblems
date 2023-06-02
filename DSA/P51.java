import java.util.*;

public class P51 {
    public static void main(String[] bfjsadb) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        System.out.print(a + " " + b + " " + c + " ");
        while (d < n) {
            d = b + c;
            if (d > n)
                break;
            System.out.print(d + " ");
            b = c;
            c = d;

        }

    }
}
