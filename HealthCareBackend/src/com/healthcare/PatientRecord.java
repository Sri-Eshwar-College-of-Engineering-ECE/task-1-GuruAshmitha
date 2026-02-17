package com.healthcare;

public class PatientRecord {

    private int id;
    private String name;
    private int age;

    public PatientRecord(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Patient ID: " + id +
               ", Name: " + name +
               ", Age: " + age;
    }
}
