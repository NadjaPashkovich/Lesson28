package by.itstep.pashka.controller;

import by.itstep.pashka.model.entity.Student;

public class Main {
    Student student = new Student();
    try{
        student.setAge(-10);
    }catch (Exception exception){
        System.out.println("data error. User input was invalid.");
    }
    student.setAge(10);
}
