// Write a program to convert a binary number into a decimal number without using array, function and while loop

import java.util.Scanner;

public class BinaryToDecimal{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a binary number");
        int binary = sc.nextInt(); 
        int decimal = 0,i=1; 
        int base = 1, d; 
        for(int j=binary; j>0;j=j/10 ){
            d=j%10;
            if(i==1){
                base=base*1;
            }
            else{
                base=base*2;
            }
            decimal=decimal+base*d;
            i++;
            }
        
        
            System.out.println("Decimal equivalent of binary number " + binary + " is " + decimal);

    }
}