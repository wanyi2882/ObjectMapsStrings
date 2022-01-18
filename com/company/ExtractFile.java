package com.company;
import java.util.*;

public class ExtractFile {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String[] filePath = sc.nextLine().split("\\\\");

        String lastIndexElement = filePath[filePath.length - 1];

        String[] lastItem = lastIndexElement.split("\\.");

        System.out.println("File name: " + lastItem[0]);
        System.out.println("File extension: " + lastItem[1]);
    }
}
