package com.company;

import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public Student(String firstName, String lastName, int age, String hometown){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getHometown(){
        return this.hometown;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

//     Solution for student and student 2.0
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = sc.nextLine();

        while(!"end".equals(input)){
            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String hometown = data[3];
            Student student = new Student(firstName, lastName, age, hometown);

            Student existingStudent = getExistingStudent(student, students);

            if(existingStudent != null){
                existingStudent.setAge(age);
                existingStudent.setHometown(hometown);
            } else {
                students.add(student);
            }


            input = sc.nextLine();
        }

        String hometown = sc.nextLine();

        for(Student student: students){
            if(hometown.equals(student.getHometown())){
                System.out.printf("%s %s is %d years old.%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    private static Student getExistingStudent(Student studentToAdd, List<Student> students){
        for(Student savedStudent : students){
            if(savedStudent.getFirstName().equals(studentToAdd.getFirstName()) &&
            savedStudent.getLastName().equals(studentToAdd.getLastName())){
                return savedStudent;
            }
        }
        return null;
    }
}
