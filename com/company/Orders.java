package com.company;
import java.util.*;

public class Orders {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Double> namePrice = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> nameQuantity = new LinkedHashMap<>();
        LinkedHashMap<String, Double> nameTotal = new LinkedHashMap<>();

        while (true){
            String input = sc.nextLine();

            if(input.equals("buy")){

                for(Map.Entry<String, Double> each : nameTotal.entrySet()){
                    System.out.printf("%s -> %.2f%n", each.getKey(), each.getValue());
                }

                break;
            }
            else{
                String[] inputArray = input.split(" ");

                namePrice.putIfAbsent(inputArray[0], 0.0);
                nameQuantity.putIfAbsent(inputArray[0], 0);
                nameTotal.putIfAbsent(inputArray[0], 0.0);

                namePrice.replace(inputArray[0], Double.parseDouble(inputArray[1]));
                nameQuantity.put(inputArray[0], nameQuantity.get(inputArray[0]) + Integer.parseInt(inputArray[2]));
                nameTotal.replace(inputArray[0], namePrice.get(inputArray[0]) * nameQuantity.get(inputArray[0]));
            }
        }
    }
}
