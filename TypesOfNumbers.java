// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered

import java.util.Scanner;

public class TypesOfNumbers {

    public static void main(String[] args) {
        int count = 0, positive = 0, negative = 0, zero =0;
        char choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            count++;
            if (num >0){
                positive++;
            }
            else if (num<0){
                negative++;
            }
            else {
                zero++;
                }
                System.out.println("Do you want to continue? (y/n)");
                choice = sc.next().charAt(0);
                } while (choice == 'y' || choice == 'Y');
                System.out.println("Count of positive numbers: "+positive);
                System.out.println("Count of negative numbers: "+negative);
                System.out.println("Count of zeros: "+zero);
                
    }
}
