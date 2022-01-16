package com.company;
import java.util.*;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++){
            String[] input = sc.nextLine().split(" ");

            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person onePerson = new Person(name, age);

            persons.add(onePerson);
        }

        persons.sort(Comparator.comparing(Person::getName));

        for(Person person : persons){
            if(person.getAge() > 30){
                System.out.println(person.getName() + " - " + person.getAge());
            }
        }
    }
}
