package com.company;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchNumbers {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String regex = "(^|(?<=\\s))-?\\d+(\\.\\d+)?($|(?=\\s))";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
