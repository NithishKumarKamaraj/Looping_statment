// Write a program to print all natural numbers from 1 to n

import java.util.Scanner;

public class NaturalNumbers {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the ending number of the natural number");
    int n = sc.nextInt();
    for (int i = 1; i <=n ; i++){
        System.out.println(i);
    }
    }
}