package com.company;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String regex = "@\\#+(?<barcode>([A-Z]{1}+[A-Za-z0-9]{4,}?[A-Z]))@\\#+";

        for(int i = 0; i < n; i++){
            String barcode = sc.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(barcode);

            if(matcher.find()){
                String validBarcode = matcher.group("barcode");

                String numberOnly = validBarcode.replaceAll("[^0-9]", "");

                if(numberOnly.equals("")){
                    System.out.println("Product group: 00");
                }
                else{
                    System.out.println("Product group: " + numberOnly);
                }
            }
            else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
