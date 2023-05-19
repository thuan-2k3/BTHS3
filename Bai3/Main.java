/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth3.Bai3;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
         StudentManagement management = new StudentManagement();
         
        management.addStudent(new Student("001", "Nguyen A", 2000));
        management.addStudent(new Student("002", "Tran B", 1999));
        management.addStudent(new Student("003", "Le C", 2001));
        management.addStudent(new Student("004", "Pham D", 2002));
        management.addStudent(new Student("005", "Hoang E", 2003));
 management.addStudent(new Student("001", "Nguyen Van A", 2000));
  
 
        ArrayList<Student> students = management.getStudentList();
        for (Student student : students) {
            System.out.println(student);
        } 
    }
}
