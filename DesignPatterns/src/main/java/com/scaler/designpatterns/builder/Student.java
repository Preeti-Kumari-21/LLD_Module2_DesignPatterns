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

    public static StudentBuilder getStudentBuilder(){
        return new StudentBuilder();
    }

    private Student(StudentBuilder studentBuilder) {


        this.name = studentBuilder.getName();
        this.age = studentBuilder.getAge();
        this.univName = studentBuilder.getUnivName();
        this.psp = studentBuilder.getPsp();
        this.batch = studentBuilder.getBatch();
        this.gradYear = studentBuilder.getGradYear();
        this.phoneNumber = studentBuilder.getPhoneNumber();
        this.email = studentBuilder.getEmail();

    }

    public static class StudentBuilder {
        String name;
        int age;
        String univName;
        double psp;
        String batch;
        int gradYear;
        String phoneNumber;
        String email;

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public StudentBuilder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public StudentBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Student build(){
            //Validation starts
            if(this.getAge() < 20){
                throw new RuntimeException("Age must be greater than 20");
            }
            if(this.getGradYear() > 2023){
                throw new RuntimeException("GradYear must be less than 2023");
            }
            //Validation ends

            return new Student(this);
        }
    }
}
