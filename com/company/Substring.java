package com.company;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String key = sc.nextLine();
        String text = sc.nextLine();

        int index = text.indexOf(key);
        while(index != -1){
            text = text.replace(key, "");
            index = text.indexOf(key);
        }

        System.out.println(text);
    }
}
