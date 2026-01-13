package com.scaler.designpatterns.prototype;

public class IntelligentStudent extends Student {
    private int IQ;

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public IntelligentStudent(){

    }

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.IQ = student.IQ;
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
