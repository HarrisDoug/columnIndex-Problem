package com.example.harris.school;

import io.realm.RealmObject;

/**
 * Created by Harris on 2/6/2016.
 */
public class dbItem extends RealmObject {
    private String subject;
    private String details;
    private String date;

    public dbItem() {}

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
