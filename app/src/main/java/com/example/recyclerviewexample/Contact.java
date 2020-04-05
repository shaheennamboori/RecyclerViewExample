package com.example.recyclerviewexample;

public class Contact {
    String name;
    String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
