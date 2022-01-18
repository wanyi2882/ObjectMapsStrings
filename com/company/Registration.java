package com.company;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int successfulRegistration = 0;

        for(int i = 0; i < n; i++){
            String userPassword = sc.nextLine();

            String regex = "U\\$(?<user>[A-Z]{1}[a-z]{2,})U\\$P@\\$(?<password>[A-Za-z]{5,}[0-9]+)P@\\$";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(userPassword);

            if(matcher.find()){
                successfulRegistration++;
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n", matcher.group("user"), matcher.group("password"));
            }
            else{
                System.out.println("Invalid username or password");
            }
        }
        System.out.println("Successful registrations: " + successfulRegistration);
    }
}
