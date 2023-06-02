import java.util.*;

public class P72 {
    public static void main(String[] sha) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for (int i = 0; i < x; ++i) {
            arr[i] = (int) (Math.random() * 100);
        }
        for (int n : arr) {
            int count = 0;
            for (int j = 2; j < n; j++) {

                if (n % j == 0) {
                    count++;
                }

            }
            if (count > 0) {
                System.out.print(n + " ");
            }

        }
    }

}
