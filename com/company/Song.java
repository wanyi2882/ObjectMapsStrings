package com.company;

import java.util.*;

public class Song {
    private String typeList;
    private String name;
    private String time;

    public Song(String typeList, String name, String time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public String getTypeList(){
        return this.typeList;
    }

    public String getName(){
        return this.name;
    }

    public String getTime(){
        return this.time;
    }

    // solution for Songs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Song> songs = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++){
            String input = sc.nextLine();

            String[] data = input.split("_");
            String typeList = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song(typeList, name, time);

            songs.add(song);
        }

        String finalCommand = sc.nextLine();

        if(finalCommand.equals("all")){
            for(Song song : songs){
                System.out.println(song.getName());
            }
        }
        else{
            for(Song song : songs){
                if(song.getTypeList().equals(finalCommand)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
