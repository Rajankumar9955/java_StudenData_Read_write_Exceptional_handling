package com.example.io;
import com.example.bean.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ReadStudentData {
    //create a method readData which accept a parameter fileName of type String
    // and returns an array of Student
    //create a method readData which accept a parameter fileName of type String
    // and returns an array of Student
    public Student[] readData(String fileName) throws IOException {
        Student[] studentData = null;
        // create array- size? count number of lines
        File file = new File(fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();
        int count = 0;
        while (line != null) {
            line = bufferedReader.readLine();
            count++;//1,2,3,4,5
        }

        studentData = new Student[count - 1];
        // read data from file, add objects of student to array
        bufferedReader = new BufferedReader(new FileReader(file));
        line = bufferedReader.readLine();// reading the header
        int indexOfStudentData = 0;
        while (line != null) {
            line = bufferedReader.readLine();
            if (line != null) {
                String[] split = line.split(",");
                Student student = new Student();
                student.setName(split[0]);
                student.setRollNo(Integer.parseInt(split[1]));
                student.setEmail(split[2]);
                student.setMobile(split[3]);
                student.setRank(Integer.parseInt(split[4]));

                studentData[indexOfStudentData] = student;
                indexOfStudentData++;

               /* String name = split[0];
                int rollNo = Integer.parseInt(split[1]);
                String email = split[2];
                String mobile = split[3];
                int rank = Integer.parseInt(split[4]);
                Student student1 = new Student(name, rollNo, email,mobile, rank);*/
            }
        }
        return studentData;
    }

}
