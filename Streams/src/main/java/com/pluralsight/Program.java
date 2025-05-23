package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //step 1
        List<Person> peopleList = new ArrayList<>();
        Person p1 = new Person("abe", "ghani", 21);
        Person p2 = new Person("Lina", "Morris", 25);
        Person p3 = new Person("Tom", "Benson", 30);
        Person p4 = new Person("Sarah", "Kim", 22);
        Person p5 = new Person("Raj", "Singh", 27);
        Person p6 = new Person("John", "Clark", 24);
        Person p7 = new Person("John", "Doe", 28);
        Person p8 = new Person("Alice", "Johnson", 23);
        Person p9 = new Person("Michael", "Lee", 26);
        Person p10 = new Person("Grace", "Wong", 29);
        Person p11 = new Person("Noah", "Garcia", 31);


        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);
        peopleList.add(p4);
        peopleList.add(p5);
        peopleList.add(p6);
        peopleList.add(p7);
        peopleList.add(p8);
        peopleList.add(p9);
        peopleList.add(p10);
        peopleList.add(p11);


        //step 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for a person by first name: ");
        String userSearchEntry = scanner.nextLine();
        userSearchEntry = userSearchEntry.toLowerCase();

        List<Person> streamedPersonList = new ArrayList<>();

        for (Person person : peopleList){
            if (person.getFirstName().toLowerCase().contains(userSearchEntry)){
                streamedPersonList.add(person);
            }
        }


        System.out.println("==============RESULTS==============");
        for (Person person : streamedPersonList){
            System.out.println(person.getFullName());
            System.out.println("--------------------");
        }

        //step 3
        int totalAge = 0;
        for (Person person : peopleList){
            totalAge += person.getAge();
        }
        double averageAge = totalAge / peopleList.size();
        System.out.println("average age is: " + averageAge);

        int oldestAge = 0;
        Person oldestPerson = null;
        for (Person person : peopleList){
            if (person.getAge() > oldestAge){
                oldestAge = person.getAge();
                oldestPerson = person;
            }
        }

        System.out.println("The oldest person is " + oldestPerson.getFullName() +" at the age of "+ oldestAge);

        int youngestAge = Integer.MAX_VALUE;
        Person youngestPerson = null;
        for (Person person : peopleList){
            if (person.getAge() < youngestAge){
                youngestAge = person.getAge();
                youngestPerson = person;
            }
        }

        System.out.println("The youngest person is " + youngestPerson.getFullName() +" at the age of "+ youngestAge);

    }
}