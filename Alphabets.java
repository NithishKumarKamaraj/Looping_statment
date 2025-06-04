// Write a program to print all alphabets from a to z
//  Write a program to print reverse alphabets from Z to A
public class Alphabets {

    public static void main(String[] args) {
        char ch;
        for(ch='a'; ch<='z';ch++){
            System.out.println(ch);
        }
        for (ch='Z';ch>='A';ch--){
            System.out.println(ch);
        }
    }
}