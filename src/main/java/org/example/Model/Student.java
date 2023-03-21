package org.example.Model;

import java.util.Date;
import java.util.List;

public class Student extends User{
    int groupId;
    List<Integer> grade;

    public Student(int id, Date dateBirth, String fio) {
        super(id, dateBirth, fio);
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Студент{" +
                "groupId=" + groupId +
                ", оценки=" + grade +
                ", id=" + id +
                ", День рождения=" + dateBirth +
                ", ФИО студента='" + fio + '\'' +
                '}';
    }
}
