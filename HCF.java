// Write a program to calculate HCF of Two given number

import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend number");
        int divined = sc.nextInt();
        System.out.println("Enter divisor number");
        int divisor = sc.nextInt();
        int rem,hcf=0;
        do{
            rem= divined%divisor;
            if(rem==0){
                hcf= divisor;
            }
            else{
                divined= divisor;
                divisor= rem;
            }
        }
        while(rem!=0);
        
        System.out.println("HCF of is"+ hcf);

    }
}