package level2;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 10;
        int[] a = new int[max];
        int i = 0;
        while (n != 0) {
            if (i == max) {
                max = max + 10;
                int[] temp = new int[max];
                for (int j = 0; j < a.length; j++) {
                    temp[j] = a[j];
                }
                a = temp;
            }
            a[i] = n % 10;
            n = n / 10;
            i++;
        }
        int x = 0;
        int y = 0;
        for (int j = 0; j < i; j++) {
            if (a[j] > x) {
                y = x;
                x = a[j];
            } else if (a[j] > y && a[j] != x) {
                y = a[j];
            }
        }
        System.out.println("Largest: " + x);
        System.out.println("Second Largest: " + y);
    }
}