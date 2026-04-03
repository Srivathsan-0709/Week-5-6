package level2;

import java.util.Scanner;

public class HtApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = {"Amar", "Akbar", "Anthony"};
        int[] a = new int[3];
        double[] b = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for " + n[i]);
            a[i] = sc.nextInt();
            b[i] = sc.nextDouble();
        }
        int minAge = a[0];
        int maxHeight = 0;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (a[i] < minAge) {
                minAge = a[i];
                minIndex = i;
            }
            if (b[i] > b[maxHeight]) {
                maxHeight = i;
            }
        }
        System.out.println("Youngest: " + n[minIndex]);
        System.out.println("Tallest: " + n[maxHeight]);
    }
}