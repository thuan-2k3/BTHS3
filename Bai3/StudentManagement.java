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
public class StudentManagement {
  private ArrayList<Student> studentList;

    public StudentManagement() {
        studentList = new ArrayList<>();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(String code) {
        Student foundStudent = null;
        for (Student student : studentList) {
            if (student.getCode().equals(code)) {
                foundStudent = student;
                break;
            }
        }
        if (foundStudent != null) {
            studentList.remove(foundStudent);
        }
    }

    public void updateStudent(String code, String newFullName, int newBirthYear) {
        for (Student student : studentList) {
            if (student.getCode().equals(code)) {
                student.setFullName(newFullName);
                student.setBirthYear(newBirthYear);
                break;
            }
        }
    }

    public Student findStudentByCode(String code) {
        for (Student student : studentList) {
            if (student.getCode().equals(code)) {
                return student;
            }
        }
        return null; // Trả về null nếu không tìm thấy sinh viên có mã tương ứng
    }

    public ArrayList<Student> findStudentsByName(String name) {
        ArrayList<Student> foundStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getFullName().equals(name)) {
                foundStudents.add(student);
            }
        }
        return foundStudents;
    }

    public void sortStudentsByCode() {
        studentList.sort((s1, s2) -> s1.getCode().compareTo(s2.getCode()));
    }  
}
