package com.piotrgrochowiecki;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Person person))
            return false;
        return getAge() == person.getAge()
                && getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        int result=17;
        result=31*result+age;
        result=31*result+(name!=null ? name.hashCode():0);
        return result;
    }
}