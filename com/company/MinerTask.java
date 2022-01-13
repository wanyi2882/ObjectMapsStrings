package com.company;
import java.util.*;

public class MinerTask {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Integer> tasks = new LinkedHashMap<>();

        while (true){
            String resource = sc.nextLine();

            if(resource.equals("stop")){
                for(Map.Entry<String, Integer> each : tasks.entrySet()){
                    System.out.println(each.getKey() + " -> " + each.getValue());
                }
                break;
            }
            else{
                int quantity = Integer.parseInt(sc.nextLine());

                tasks.putIfAbsent(resource, 0);

                tasks.put(resource, tasks.get(resource) + quantity);
            }
        }
    }
}
