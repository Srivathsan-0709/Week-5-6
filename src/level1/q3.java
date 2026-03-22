package level1;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("Enter Format Number : ");
        int n=sc.nextInt();
        int x=1;
        for(int i=0;i<10;i++){
            a[i]=n*x;
            x++;
        }x=1;
        for(int i=0;i<10;i++){
            System.out.println(n+" x "+x+" = "+a[i]);
            x++;
        }
    }
}
