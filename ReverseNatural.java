// Write a program to print all natural numbers in reverse

import java.util.Scanner;

public class ReverseNatural {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Starting number where number need to decreasing");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            System.out.println(i);
        }
    }
}