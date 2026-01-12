package com.scaler.designpatterns.builder;

public class Student {
    String name;
    int age;
    String univName;
    double psp;
    String batch;
    int gradYear;
    String phoneNumber;
    String email;

    public Student(StudentBuilder studentBuilder) {
        //Validation starts
        if(studentBuilder.getAge() < 20){
            throw new RuntimeException("Age must be greater than 20");
        }

        if(studentBuilder.getGradYear() > 2023){
            throw new RuntimeException("GradYear must be less than 2023");
        }
        //Validation ends

        this.name = studentBuilder.getName();
        this.age = studentBuilder.getAge();
        this.univName = studentBuilder.getUnivName();
        this.psp = studentBuilder.getPsp();
        this.batch = studentBuilder.getBatch();
        this.gradYear = studentBuilder.getGradYear();
        this.phoneNumber = studentBuilder.getPhoneNumber();
        this.email = studentBuilder.getEmail();

    }
}
