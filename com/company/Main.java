package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Solution for student and student 2.0
//    public static void main(String[] args) {
//	// write your code here
//        Scanner sc = new Scanner(System.in);
//
//        List<Student> students = new ArrayList<>();
//
//        String input = sc.nextLine();
//
//        while(!"end".equals(input)){
//            String[] data = input.split(" ");
//            String firstName = data[0];
//            String lastName = data[1];
//            int age = Integer.parseInt(data[2]);
//            String hometown = data[3];
//            Student student = new Student(firstName, lastName, age, hometown);
//
//            Student existingStudent = getExistingStudent(student, students);
//
//            if(existingStudent != null){
//                existingStudent.setAge(age);
//                existingStudent.setHometown(hometown);
//            } else {
//                students.add(student);
//            }
//
//
//            input = sc.nextLine();
//        }
//
//        String hometown = sc.nextLine();
//
//        for(Student student: students){
//            if(hometown.equals(student.getHometown())){
//                System.out.printf("%s %s is %d years old.%n", student.getFirstName(), student.getLastName(), student.getAge());
//            }
//        }
//    }
//
//    private static Student getExistingStudent(Student studentToAdd, List<Student> students){
//        for(Student savedStudent : students){
//            if(savedStudent.getFirstName().equals(studentToAdd.getFirstName()) &&
//            savedStudent.getLastName().equals(studentToAdd.getLastName())){
//                return savedStudent;
//            }
//        }
//        return null;
//    }

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
