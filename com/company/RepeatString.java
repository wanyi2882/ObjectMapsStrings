package com.company;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String[] stringArray = sc.nextLine().split(" ");

        String newString = "";

        for(int i = 0; i < stringArray.length; i++){
            for(int j = 0; j < stringArray[i].length();j ++){
                newString +=stringArray[i];
            }
        }

        System.out.println(newString);
    }
}
