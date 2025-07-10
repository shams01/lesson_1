package ru.kfc.autotests.lesson_2;

public class Person_main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Tom", 25);
        Person person3 = new Person("Jon", 26);
        Person person4 = new Person("Rik", 27);
        person1.talk();
        person2.talk();
        person3.talk();
        person4.talk();
        Person.count();
    }
}
