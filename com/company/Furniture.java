package com.company;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {

    private String furniture;
    private String price;
    private String quantity;

    public Furniture(String furniture, String price, String quantity){
        this.furniture = furniture;
        this.price = price;
        this.quantity = quantity;
    }


    public String getFurniture() {
        return furniture;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        List<Furniture> furnitureList = new ArrayList<>();

        while(true){
            String furniture = sc.nextLine();
            String regex = "[\\>][\\>](?<item>[A-Za-z]+)[\\<][\\<](?<price>\\d+(\\.\\d+)?)[\\!](?<quantity>\\d)";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(furniture);

            if(furniture.equals("Purchase")){
                double sum = 0;

                System.out.println("Bought furniture:");

                for(Furniture eachItem : furnitureList){
                    System.out.println(eachItem.getFurniture());

                    sum += Double.parseDouble(eachItem.getPrice()) * Integer.parseInt(eachItem.getQuantity());
                }

                System.out.printf("Total money spent: %.2f", sum);

                break;
            }
            else{
                if(matcher.find()){
                    Furniture newFurniture = new Furniture(matcher.group("item"),
                            matcher.group("price"),
                            matcher.group("quantity"));

                    furnitureList.add(newFurniture);
                }
            }
        }
    }
}
