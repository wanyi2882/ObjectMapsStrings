package com.company;
import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> userGrades = new HashMap<>();
        Map<String, Integer> submission = new HashMap<>();

        while(true){
            String command = sc.nextLine();
            String[] commandArray = command.split("-");


            if(command.equals("exam finished")){
                break;
            }
            else if(commandArray[1].equals("banned")){
                userGrades.remove(commandArray[0]);
            }
            else{
                if(userGrades.containsKey(commandArray[0])){
                    if(userGrades.get(commandArray[0]) < Integer.parseInt(commandArray[2])){
                        userGrades.replace(commandArray[0], Integer.parseInt(commandArray[2]));
                    }
                }
                else{
                    userGrades.put(commandArray[0], Integer.parseInt(commandArray[2]));
                }

                if(submission.containsKey(commandArray[1])){
                    submission.replace(commandArray[1], submission.get(commandArray[1]) + 1);
                }
                else{
                    submission.put(commandArray[1], 1);
                }
            }
        }

        System.out.println("Results:");
        userGrades.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue()
                .reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s | %d",entry.getKey(), entry.getValue()));
                });

        System.out.println("Submissions:");
        submission.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s - %d",entry.getKey(), entry.getValue()));
                });
    }
}