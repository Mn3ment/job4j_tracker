package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Василий Семен Семенович");
        student.setGroup("E95");
        student.setAdmission("02.07.1987");
        System.out.println("ФИО - " + student.getFullName() + System.lineSeparator() + "Группа - " + student.getGroup() + System.lineSeparator() + "Дата поступления - " + student.getAdmission());
    }
}
