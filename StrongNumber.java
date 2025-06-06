// Write a program to check whether a number is a Strong Number or not

import java.util.Scanner;

public class StrongNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int sum=0;
        int fact;
        int num1=num;
        for(int i=num; i>0; i=i/10){
            fact=1;
            for(int j=1;j<=i%10;j++){
                fact= fact*j;
            }
            sum=sum+fact;
        }
            if(sum==num1){
                System.out.println(num1+" is a Strong Number");
                }
            else{
                System.out.println(num1+" is not a Strong Number");
                }
    }
}