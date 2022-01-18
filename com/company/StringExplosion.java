package com.company;
import java.util.*;

public class StringExplosion {

    public static String newString(String string){
        String newString = "";
        int power = 0;

        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if(ch != '>' && power == 0){
                newString += ch;
            }
            else if(ch == '>'){
                newString += ch;
                power += Integer.parseInt(String.valueOf(string.charAt(i)));
                i++;
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        String newString = newString(string);

        System.out.println(newString);

    }
}
