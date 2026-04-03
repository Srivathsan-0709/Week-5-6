package level2;

import java.util.Scanner;

public class Rev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 10;
        int[] a = new int[max];
        int i = 0;
        while (n != 0) {
            if (i == max) {
                break;
            }
            a[i] = n % 10;
            n = n / 10;
            i++;
        }
        for (int j = 0; j < i; j++) {
            System.out.print(a[j]);
        }
    }
}