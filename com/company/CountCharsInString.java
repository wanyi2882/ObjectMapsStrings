package com.company;
import java.util.*;

public class CountCharsInString {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Character, Integer> counter = new LinkedHashMap<>();

        String input = sc.nextLine();
        char[] chars = input.toCharArray();

        for(char ch : chars){
            counter.putIfAbsent(ch, 0);

            int currentCount = counter.get(ch);
            counter.put(ch, currentCount+1);
        }

        for(Map.Entry<Character, Integer> c: counter.entrySet()){
            if(!c.getKey().equals(' ')){
                System.out.println(c.getKey() + " -> " + c.getValue());
            }
        }
    }
}
