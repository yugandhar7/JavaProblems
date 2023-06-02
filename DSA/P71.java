import java.util.*;

public class P71 {
    public static void main(String[] dgs) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double sum = 0;
        int[] arr = new int[x];
        for (int i = 0; i < x; ++i) {
            arr[i] = (int) (Math.random() * 100);
        }
        for (int j = 0; j < x; ++j) {
            sum += arr[j];
            System.out.println(arr[j] + " ");
        }
        System.out.println(sum / arr.length);
        if (arr.length % 2 == 0) {
            int g = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
            System.out.println("median =" + g);

        } else {
            System.out.println("median = " + arr[arr.length / 2]);
        }

    }

}
