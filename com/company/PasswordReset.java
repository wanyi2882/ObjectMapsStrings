package com.company;
import java.util.*;

public class PasswordReset {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        while(true){
            String command = sc.nextLine();

            if(command.equals("Done")){
                System.out.println("Your password is: " + password);
                break;
            }
            else{
                if(command.equals("TakeOdd")){
                    StringBuilder sb = new StringBuilder();

                    for(int i = 1; i < password.length(); i+=2){
                        char ch = password.charAt(i);
                        sb.append(ch);
                    }

                    password = sb.toString();
                    System.out.println(password);
                }
                else if(command.startsWith("Cut")){
                    String[] commandArray = command.split(" ");
                    password = password.substring(0, Integer.parseInt(commandArray[1]))
                            + password.substring(Integer.parseInt(commandArray[1]) + Integer.parseInt(commandArray[2]));

                    System.out.println(password);
                }
                else if(command.startsWith("Substitute")){
                    String[] commandArray = command.split(" ");
                    if(password.contains(commandArray[1])){
                        password = password.replace(commandArray[1], commandArray[2]);
                        System.out.println(password);
                    }
                    else {
                        System.out.println("Nothing to replace!");
                        System.out.println("Your password is: " + password);
                        break;
                    }
                }
            }
        }
    }
}
