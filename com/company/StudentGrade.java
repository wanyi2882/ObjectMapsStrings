package com.company;
import java.util.*;

public class StudentGrade {
    private String firstName;
    private String lastName;
    private double grade;

    public StudentGrade(String firstName, String lastName, double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<StudentGrade> studentGradeList = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());

        for( int i = 0; i < n; i++){
            String[] command = sc.nextLine().split(" ");
            String firstName = command[0];
            String lastName = command[1];
            double grade = Double.parseDouble(command[2]);

            StudentGrade eachStudent = new StudentGrade(firstName, lastName, grade);
            studentGradeList.add(eachStudent);
        }

        studentGradeList.sort(Comparator.comparing(StudentGrade::getGrade));
        Collections.reverse(studentGradeList);

        for(StudentGrade student : studentGradeList){
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
