package com.scaler.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getStudentBuilder()
                .setName("KumarP")
                .setAge(38)
                .setPhoneNumber("4587854585")
                .build();
        System.out.println("DEBUG");
    }
}
