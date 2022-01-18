package com.company;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
