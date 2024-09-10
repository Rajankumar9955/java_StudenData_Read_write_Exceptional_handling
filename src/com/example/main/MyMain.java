package com.example.main;

import com.example.bean.Student;
import com.example.io.ReadStudentData;

import java.io.IOException;
public class MyMain {
    public static void main(String[] args) {
        ReadStudentData readStudentData = new ReadStudentData();
        String fileName = "resources/studentdata.csv";
        try {
            Student[] students = readStudentData.readData(fileName);
            for (Student element : students) {
                if (element.getName().startsWith("M")) {
                    System.out.println(element);
                }
                if (element.getRank() == 1) {
                    System.out.println(element);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
