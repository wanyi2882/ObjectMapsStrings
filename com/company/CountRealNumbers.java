package com.company;
import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        TreeMap<Integer, Integer>counts = new TreeMap<>();

        for(int num : numbers){
            // does not exist in count yet, create key num with 0 occurrence
            if(!counts.containsKey(num)){
                counts.put(num, 0);
            }

            // add one count of occurrence for the specified num
            counts.put(num, counts.get(num) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
