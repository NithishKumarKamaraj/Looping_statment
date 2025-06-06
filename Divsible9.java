// Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9



public class Divsible9 {

    public static void main(String[] args) {
        int sum =0;
        System.out.println("Number of integers between 100 and 200,divisible by 9 are");
        for (int i = 101; i <=200; i++){
            if (i % 9 == 0) {
                sum += i;
             System.out.println(i);
            }
        }
    }
}