package org.example.Model;

import java.util.Date;

public abstract class User {
    int id;
    Date dateBirth;
    String fio;

    public User(int id, Date dateBirth, String fio) {
        this.id = id;
        this.dateBirth = dateBirth;
        this.fio = fio;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", dateBirth=" + dateBirth +
                ", fio='" + fio + '\'' +
                '}';
    }
}
