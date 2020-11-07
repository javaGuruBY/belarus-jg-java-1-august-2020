package com.javaguru.teacher.lesson_12.map;

import java.util.Objects;

class PersonKey {

    private String name;
    private String lastName;

    public PersonKey(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonKey personKey = (PersonKey) o;
        return Objects.equals(name, personKey.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return "PersonKey{" +
                "name='" + name + '\'' +
                ", laseName='" + lastName + '\'' +
                '}';
    }
}
