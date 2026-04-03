package level2;

import java.util.Scanner;

public class Rev1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        int[] a = new int[count];
        int i = 0;
        while (n != 0) {
            a[i] = n % 10;
            n = n / 10;
            i++;
        }
        for (int j = 0; j < count; j++) {
            System.out.print(a[j]);
        }
    }
}