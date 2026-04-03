package level2;

import java.util.Scanner;

public class BonusApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[10];
        double[] b = new double[10];
        double[] c = new double[10];
        double[] d = new double[10];
        double x = 0;
        double y = 0;
        double z = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years for employee " + (i + 1));
            double s = sc.nextDouble();
            double yr = sc.nextDouble();
            if (s <= 0 || yr < 0) {
                System.out.println("Invalid input, enter again");
                i--; // retry
                continue;
            }
            a[i] = s;
            b[i] = yr;
        }
        for (int i = 0; i < 10; i++) {
            if (b[i] > 5) {
                c[i] = a[i] * 0.05;
            } else {
                c[i] = a[i] * 0.02;
            }
            d[i] = a[i] + c[i];
            x = x + c[i];
            y = y + a[i];
            z = z + d[i];
        }
        System.out.println("Total Bonus: " + x);
        System.out.println("Total Old Salary: " + y);
        System.out.println("Total New Salary: " + z);
    }
}