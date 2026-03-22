package level1;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[10];
        System.out.println("Enter age of 10 Students : ");
        for(int i=0;i<10;i++){
            age[i]= sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(age[i]>=18){
                System.out.println("The student with the age "+age[i]+" can vote.");
            }else if(age[i]<18 && age[i]>=0){
                System.out.println("The student with the age "+age[i]+" cannot vote.");
            }else{
                System.out.println("Age cannot be negative");
            }
        }
    }
}
