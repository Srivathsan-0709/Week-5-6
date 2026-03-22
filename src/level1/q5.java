package level1;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] h=new double[11];
        double sum=0.0;
        System.out.println("Enter Height of each player in cms : ");
        for(int i=0;i<11;i++){
            h[i]=sc.nextDouble();
        }for(int i=0;i<11;i++){
            sum=sum+h[i];
        }double mean=sum/11.0;
        System.out.println("The mean height of the football team : "+mean+" cms");
    }
}
