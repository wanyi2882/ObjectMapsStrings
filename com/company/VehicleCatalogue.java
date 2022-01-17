package com.company;

import java.util.*;

public class VehicleCatalogue {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public VehicleCatalogue(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s\n" +
                        "Model: %s\n" +
                        "Color: %s\n" +
                        "Horsepower: %d",
                getType().toUpperCase().charAt(0) +
                        this.getType().substring(1),
                getModel(),
                getColor(),
                getHorsepower());
    }

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        List<VehicleCatalogue> vehicleCatalogueList = new ArrayList<>();
//        int truckCount = 0;
//        int carCount = 0;
//        double truckHorsepower = 0;
//        double carHorsepower = 0;
//
//        while(true){
//            String command = sc.nextLine();
//
//            if(command.equals("End")){
//                break;
//            }
//            else{
//                String[] commandArray = command.split(" ");
//
//                String type = commandArray[0].substring(0, 1).toUpperCase() + commandArray[0].substring(1);
//
//                VehicleCatalogue eachCar = new VehicleCatalogue(type, commandArray[1], commandArray[2], Integer.parseInt(commandArray[3]));
//
//                vehicleCatalogueList.add(eachCar);
//
//                if(commandArray[0].equals("truck")){
//                    truckCount++;
//                    truckHorsepower += Double.parseDouble(commandArray[3]);
//                }
//                else if(commandArray[0].equals("car")){
//                    carCount++;
//                    carHorsepower += Double.parseDouble(commandArray[3]);
//                }
//            }
//        }
//
//        while(true){
//            String secondCommand = sc.nextLine();
//
//            if (secondCommand.equals("Close the Catalogue")){
//                System.out.printf("Cars have an average horsepower of: %.2f.%n", carHorsepower/carCount );
//
//                System.out.printf("Trucks have an average horsepower of: %.2f.%n", truckHorsepower/truckCount );
//
//                break;
//
//            }
//            else{
//                for(VehicleCatalogue eachCar : vehicleCatalogueList){
//                    if(eachCar.getModel().equals(secondCommand)){
//                        System.out.println(eachCar);
//                    }
//                }
//            }
//        }
//    }
}
