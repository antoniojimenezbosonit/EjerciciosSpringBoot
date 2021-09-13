package com.bosonit.formacion.miPrimeraAplicacion;

public class Person {

    String Name;
    Integer Age;
    String Poblation;

    public Person() {
    }

    public Person(String name, Integer age, String poblation) {
        Name = name;
        Age = age;
        Poblation = poblation;
    }

    public String getPoblation() {
        return Poblation;
    }

    public void setPoblation(String poblation) {
        Poblation = poblation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}
