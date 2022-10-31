package com.piotrgrochowiecki;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Piotr", 23);
        Person person2 = new Person("Piotr", 24);
        Person person3 = new Person("Piotr", 23);

        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(person1);

        System.out.println(personHashSet.contains(person2));
        System.out.println("Hash code of person1: " + person1.hashCode());
        System.out.println("Hash code of person2: " + person2.hashCode());
        System.out.println("Is person1 equal to person2: " + person1.equals(person2));
    }
}
