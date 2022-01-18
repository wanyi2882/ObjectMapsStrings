package com.company;
import java.util.*;

public class CaesarCipher {

    public static String encrypted(String string){
        String encryptedWord = "";

        for(int i = 0; i < string.length(); i++){
            int character = string.charAt(i) + 3;
            char ch = (char) character;
            encryptedWord += ch;
        }

        return encryptedWord;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String encrypted = encrypted(text);

        System.out.println(encrypted);
    }
}
