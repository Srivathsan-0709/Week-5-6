package level1;

import java.awt.desktop.SystemSleepListener;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a= new int[5];
        System.out.println("Enter 5 Numbers : ");
        for(int i=0;i<5;i++){
            a[i]= sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(a[i]>0){
                System.out.println(a[i]+" is POSITIVE");
            }else if(a[i]==0){
                System.out.println(a[i]+" is ZERO");
            }else{
                System.out.println(a[i]+" is NEGATIVE");
            }
        }if(a[0]>a[4]){
            System.out.println("First Number is GREATER than Last Number");
        }else if(a[0]==a[4]){
            System.out.println("First Number is EQUAL to Last Number");
        }else{
            System.out.println("First Number is LESSER than Last Number");
        }
    }
}
