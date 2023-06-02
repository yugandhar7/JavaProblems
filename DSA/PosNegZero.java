package DSA;

import java.util.*;
import java.lang.Integer;
import java.lang.Math;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // int res = Integer.signum(num);
        // int res = (int) Math.signum(num);// used in double or accept double

        // switch (res) {
        // case 1:
        // System.out.println(num + " is positive");
        // break;
        // case -1:
        // System.out.println(num + " is negitive");
        // break;
        // default:
        // System.out.println(num + " is zero");
        // }
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            default:
                switch (num >> 31) {
                    case 0:
                        System.out.println("positive");
                        break;
                    default:
                        System.out.println("negitive");
                }
        }
    }

}
