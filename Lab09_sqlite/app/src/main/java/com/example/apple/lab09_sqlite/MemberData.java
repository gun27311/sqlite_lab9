package com.example.apple.lab09_sqlite;

/**
 * Created by Apple on 11/13/2017 AD.
 */

public class MemberData {
    private int id;
    private String name;
    private String surname;
    private int age;

    public MemberData(int id , String name , String surname , int age){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
