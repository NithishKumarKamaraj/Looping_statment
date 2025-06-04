// Write a program to print tables

import java.util.Scanner;

public class Tables {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Starting number");
    int sn = sc.nextInt();
    System.out.println("Enter Ending number");
    int en = sc.nextInt();
    System.out.println("Enter the tables number");
    int tn = sc.nextInt();
    while(sn<=en){
        System.out.println(sn+"*"+tn+"="+sn*tn);
        sn++;
    }
  }
}
