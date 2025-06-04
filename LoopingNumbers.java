//Write a program to find sum of all natural numbers between 1 to n

import java.util.Scanner;

public class LoopingNumbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of all natural numbers between 1 to "+n+" is "+sum);
        int sumeven=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sumeven=sumeven+i;
            }
        }
        System.out.println("Sum of all natural even numbers between 1 to "+n+" is "+ sumeven);
        int sumodd=0;
       for(int i=1;i<=n;i++){
            if(i%2!=0){
                sumodd=sumodd+i;
            }
        }
        System.out.println("Sum of all natural even numbers between 1 to "+n+" is "+ sumodd);
    }


}