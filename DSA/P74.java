import java.util.*;

public class P74 {
    public static void main(String[] kdfgu) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for (int i = 0; i < x; ++i) {
            arr[i] = (int) (Math.random() * 100);
        }
        for (int j = 0; j < arr.length; ++j) {
            for (int k = j + 1; k < arr.length; ++k) {
                if (arr[j] > arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
            System.out.println(arr[j]);

        }
        System.out.print(arr[1] + " " + arr[arr.length - 2]);

    }

}
