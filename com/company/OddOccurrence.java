package com.company;
import java.util.*;

public class OddOccurrence {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Integer> counter = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> oddCounter = new LinkedHashMap<>();

        String[] input = sc.nextLine().toLowerCase().split(" ");


        for(int i = 0; i < input.length; i++){
            counter.putIfAbsent(input[i], 0);

            int currentCount = counter.get(input[i]);
            counter.put(input[i], currentCount+1);
        }

        for(Map.Entry<String, Integer> entry : counter.entrySet()){
            if(entry.getValue() % 2 != 0){
                oddCounter.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.print(String.join(", ", oddCounter.keySet()));

    }
}
