package ru.job4j.tracker;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdFormat='" + createdFormat + '\'' +
                '}';
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
       LocalDateTime created = LocalDateTime.now();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
       String createdFormat = created.format(formatter);
       public String getCreated() {
           return createdFormat;
        }

}
