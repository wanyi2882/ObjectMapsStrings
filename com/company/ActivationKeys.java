package com.company;
import java.util.*;

public class ActivationKeys {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String activationKey = sc.nextLine();

        while(true){
            String command = sc.nextLine();

            if(command.equals("Generate")){
                System.out.println("Your activation key is: " + activationKey);
                break;
            }
            else{
                String[] commandArray = command.split(">>>");

                if(commandArray[0].equals("Contains")){
                    if (activationKey.contains(commandArray[1])) {
                        System.out.printf("%s contains %s%n", activationKey, commandArray[1]);
                    }
                    else{
                        System.out.println("Substring not found!");
                    }
                }
                else if(commandArray[0].equals("Flip")){
                    String subString = activationKey.substring(Integer.parseInt(commandArray[2]), Integer.parseInt(commandArray[3]));
                    if(commandArray[1].equals("Upper")){
                        subString = subString.toUpperCase();
                    }
                    else if(commandArray[1].equals("Lower")){
                        subString = subString.toLowerCase();
                    }
                    activationKey = activationKey.substring(0, Integer.parseInt(commandArray[2]))
                            + subString
                            + activationKey.substring(Integer.parseInt(commandArray[3]));

                    System.out.println(activationKey);
                }
                else if(commandArray[0].equals("Slice")){
                    activationKey = activationKey.substring(0, Integer.parseInt(commandArray[1]))
                            + activationKey.substring(Integer.parseInt(commandArray[2]));

                    System.out.println(activationKey);
                }
            }
        }
    }
}
