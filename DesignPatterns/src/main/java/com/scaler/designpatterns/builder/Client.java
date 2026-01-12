package com.scaler.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setName("Preeti");
        studentBuilder.setAge(33);
        studentBuilder.setUnivName("VTU");
        studentBuilder.setPsp(988.9);
        studentBuilder.setBatch("Morning Batch MWF");
        studentBuilder.setGradYear(2014);
        studentBuilder.setEmail("preeti.kuma@gmail.com");
        studentBuilder.setPhoneNumber("1234567890");

        Student student = new Student(studentBuilder);
        System.out.println("DEBUG");
    }
}
