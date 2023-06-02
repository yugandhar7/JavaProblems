package DSA;

import java.util.*;

public class WeatherP39 {
  public static void main(String[] dsnkfk) {
    Scanner sc = new Scanner(System.in);
    int temp = sc.nextInt();
    if (temp < 0) {
      System.out.println("Freezing weather");
    } else if (temp >= 0 && temp < 10) {
      System.out.println("very cold weather");
    } else if (temp >= 10 && temp < 20) {
      System.out.println("cold weather");
    } else if (temp >= 20 && temp < 30) {
      System.out.println("normal temp");
    } else if (temp > 30 && temp < 40) {
      System.out.println("its hot");
    } else {
      System.out.println("its very hot");
    }
  }
}