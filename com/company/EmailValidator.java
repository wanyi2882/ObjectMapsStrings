package com.company;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String email = sc.nextLine();
        String regex= "[A-Za-z0-9]+[@][A-Za-z]+[.][a-z]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.find()){
            System.out.print("Valid Email");
        }
        else{
            System.out.print("Invalid Email");
        }
    }
}
