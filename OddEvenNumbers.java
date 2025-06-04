// Write a program to print all even numbers between 1 to 100
// Write a program to print all odd number between 1 to 100

import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    for (int i=0; i<=100;i++){
        if (i%2==0) {
            System.out.println(i);
        }
    }
    for (int i=0; i<=100;i++){
        if (i%2!=0) {
            System.out.println(i);

        }
     }
  }
}