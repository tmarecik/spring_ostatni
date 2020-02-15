package pl.edu.wszib.todolist.springtodolist.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    public int id;

    public String title;

    @Temporal(value = TemporalType.TIMESTAMP)
    public Date dueDate;

    public Status status;

    //konstruktor zostaje defoultowy

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
