package com.company;
import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, List<String>> synonyms = new LinkedHashMap<>();

        for(int i = 0; i < n; i++){
            String word = sc.nextLine();
            String synonym = sc.nextLine();

            synonyms.putIfAbsent(word, new ArrayList<>());
            synonyms.get(word).add(synonym);
        }

        for(Map.Entry<String, List<String>> entry : synonyms.entrySet()){
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
