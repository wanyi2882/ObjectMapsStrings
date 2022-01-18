package com.company;

import java.util.Scanner;

public class TextFilter {

    public static String repeatStr(String string, int length){
        String replacement = "";

        for(int i = 0; i < length; i++){
            replacement += string;
        }

        return replacement;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String[] bannedWords = sc.nextLine().split(", ");

        String text = sc.nextLine();

        for(String banWord : bannedWords){
            if(text.contains(banWord)){
                String replacement = repeatStr("*", banWord.length());
                text = text.replace(banWord, replacement);
            }
        }

        System.out.println(text);
    }
}
