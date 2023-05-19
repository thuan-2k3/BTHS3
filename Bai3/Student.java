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
public class Student {
     private String code;
    private String fullName;
    private int birthYear;

    public Student(String code, String fullName, int birthYear) {
        this.code = code;
        this.fullName = fullName;
        this.birthYear = birthYear;
    }

    public String getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    void setBirthYear(int newBirthYear) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

