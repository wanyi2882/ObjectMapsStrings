package com.company;

import java.util.*;

public class ValidUserName {
    private static boolean validate(String username){
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        for (int i = 0; i < username.length(); i++){
            char symbol = username.charAt(i);

            if (!Character.isLetterOrDigit(symbol) &&
                    symbol != '-' && symbol != '_') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String[] usernames = sc.nextLine().split(", ");

        for(int i = 0; i < usernames.length; i++){
            if(validate(usernames[i])){
                System.out.println(usernames[i]);
            }
        }
    }
}
