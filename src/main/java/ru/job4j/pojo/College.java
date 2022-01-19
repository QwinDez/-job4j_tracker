package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        String ln = System.lineSeparator();
        student.setFio("Иванов Иван Иванович");
        student.setGroup("ЭВМ");
        student.setReceipt(new Date());
        System.out.println("Студент : " + student.getFio() + ln
                + "Обучается в группе : " + student.getGroup() + ln
                + "Дата поступления : " + student.getReceipt());
    }
}
