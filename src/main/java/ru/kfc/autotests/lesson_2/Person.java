package ru.kfc.autotests.lesson_2;

public class Person {
    private String fullName;
    private int age;
    private int id;
    private static int quantity = 0;

    public Person(){
        this.id = quantity++;
    }

    public Person(String fullName, int age){
        this();
        this.fullName = fullName;
        this.age = age;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void talk(){
        if (fullName != null & age != 0){
            if (id == 2){
                System.out.println("Привет я, " + fullName + ", избранный!");
            }else{
                System.out.println("Привет я " + fullName + " и мне " + age + " лет");
            }
        }
    }

    public static void count(){
        System.out.println("Количество объектов: " + quantity);
    }
}
