package com.company;
import java.util.*;

public class WordFilter {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String[] words = Arrays.stream(sc.nextLine().split(" "))
                .filter(e -> e.length() % 2 == 0)
                .toArray(String[] :: new);

        for(String word : words ){
            System.out.println(word);
        }
    }
}
