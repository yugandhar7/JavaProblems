import java.util.*;

public class Array {
    public static void main(String[] hgf) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int arr[][] = new int[x][y];
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = (int) (Math.random() * 100);

            }

        }
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        // for (int n[] : arr) {
        // for (int u : n) {
        // System.out.print(u + " ");
        // }
        // System.out.println(" ");

        // }

    }
}