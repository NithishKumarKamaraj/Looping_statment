// Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        Scanner sc= new Scanner(System.in);
        char choice;
        do{
            System.out.print("Enter a number: ");
            num =sc.nextInt();
            if(num >max){
                max = num;
            }
            if(num<max){
                min = num;
            }
            System.out.print("Do you want to enter more numbers? (y/n): ");
             choice = sc.next().charAt(0);
          }  while (choice=='y' || choice=='Y');
           System.out.println("Largest number "+ max);
           System.out.println("Smallest number "+ min);
    }
}