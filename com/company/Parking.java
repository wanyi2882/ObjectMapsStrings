package com.company;
import java.util.*;

public class Parking {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, String> carParkLot = new LinkedHashMap<>();

        for(int i = 0; i < n; i++){
            String[] inputArray = sc.nextLine().split(" ");

            if(inputArray[0].equals("register")){
                if(carParkLot.containsKey(inputArray[1])){
                    System.out.println("ERROR: already registered with plate number " + inputArray[2]);
                }
                else{
                    carParkLot.putIfAbsent(inputArray[1], inputArray[2]);
                    System.out.println(inputArray[1] + " registered " + inputArray[2] + " successfully");
                }
            }
            else if(inputArray[0].equals("unregister")){
                if(!carParkLot.containsKey(inputArray[1])){
                    System.out.println("ERROR: user " + inputArray[1] + " not found");
                }
                else{
                    carParkLot.remove(inputArray[1]);
                    System.out.println(inputArray[1] + " unregistered successfully");
                }
            }
        }

        for(Map.Entry<String, String> pair : carParkLot.entrySet()){
            System.out.println(pair.getKey() + " => " + pair.getValue());
        }
    }
}
