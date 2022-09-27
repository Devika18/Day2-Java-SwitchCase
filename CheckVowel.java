//Java program for checking Vowel

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        System.out.println("Enter a Character: ");

        //Creating an object with name sc and taking input from command line
        Scanner sc = new Scanner(System.in);

        //Initializing isVowel variable as False
        boolean isVowel = false;
        char ch = sc.next().charAt(0);

        //Starting of Switch-Case
        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVowel = true;
        }
        if (isVowel == true)
        {
            System.out.println(ch + " is a Vowel");
        }
        else
        {
            //Using if else condition for checking whether given character is consonant or not
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            System.out.println(ch + " is a Consonant");
            else
                System.out.println("Input is not an Alphabet");
        }

    }

}
