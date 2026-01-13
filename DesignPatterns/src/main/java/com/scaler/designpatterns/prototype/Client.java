package com.scaler.designpatterns.prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student ScalerMorningBatchSep2024 = new Student();
        ScalerMorningBatchSep2024.setBatch("ScalerMorningBatchSep2024Batch");
        ScalerMorningBatchSep2024.setAvgBatchPsp(80.9);
        studentRegistry.register("ScalerMorningBatchSep2024Batch",ScalerMorningBatchSep2024);

        Student ScalerMorningBatchSep2025 = new Student();
        ScalerMorningBatchSep2025.setBatch("ScalerMorningBatchSep2025");
        ScalerMorningBatchSep2025.setAvgBatchPsp(90.9);
        studentRegistry.register("ScalerMorningBatchSep2025",ScalerMorningBatchSep2025);

        IntelligentStudent ScalerMorningBatchSep2024Preeti = new IntelligentStudent();
        ScalerMorningBatchSep2024Preeti.setBatch("ScalerMorningBatchSep2024Batch");
        ScalerMorningBatchSep2024Preeti.setAvgBatchPsp(99.9);
        ScalerMorningBatchSep2024Preeti.setIQ(200);
        studentRegistry.register("ScalerMorningBatchSep2024BatchIS",ScalerMorningBatchSep2024Preeti);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);


        Student preeti = studentRegistry.get("ScalerMorningBatchSep2024").clone();
        preeti.setName("Preeti Kumari");
        preeti.setAge(33);
        preeti.setPsp(98.9);

        Student KP = studentRegistry.get("ScalerMorningBatchSep2025").clone();
        KP.setName("Kumar Prashant");
        KP.setAge(38);

        Student Vasu = studentRegistry.get("ScalerMorningBatchSep2024BatchIS").clone();
        KP.setName("Vasu");
        KP.setAge(4);
        System.out.println("DEBUG");
    }
}
