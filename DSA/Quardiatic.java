package DSA;

import java.util.*;
import java.lang.Math;

public class Quardiatic {
    public static void main(String[] gasjf) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double det = (b * b) - (4 * a * c);

        double root1, root2;
        if (det > 0) {
            root1 = (-b + Math.sqrt(det)) / (2 * a);
            root2 = (-b - Math.sqrt(det)) / (2 * a);
            System.out.printf("%.2f %.2f", root1, root2);

        } else if (det == 0) {
            root1 = root2 = (-b) / (2 * a);
            System.out.printf("%.2f", root1);
        } else {
            double real = (-b) / (2 * a);
            double imaginary = Math.sqrt(-det) / (2 * a);
            System.out.printf("%.2f +%.2fi", real, imaginary);
            System.out.printf("%.2f -%.2fi", real, imaginary);
        }

    }
}