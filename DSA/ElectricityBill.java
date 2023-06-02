
import java.util.*;

public class ElectricityBill {
    public static void main(String[] hdsj) {
        try (Scanner sc = new Scanner(System.in)) {
            int id = sc.nextInt();
            String name = sc.next();
            double units = sc.nextDouble();
            double charge;
            if (units <= 199) {
                charge = units * 1.20;
                System.out.println("id=" + id + "  name = " + name + " charges = " + charge);
            } else if (units > 199 && units < 400) {
                charge = units * 1.50;
            } else if (units >= 400 && units < 600) {
                double surge = (15 * units) / 100;
                charge = units * 1.80 + surge;
                System.out.println("id = " + id + " name = " + name + " charge = " + charge);
            } else {
                double surge = (15 * units) / 100;
                System.out.println(surge);
                charge = units * 2.00 + surge;
                System.out.println("id = " + id + " name = " + name + " chareg = " + charge);
            }
        }
    }
}