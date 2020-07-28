package com.cgzj.pojo;

public class Homework {
    private int hid;
    private String course;
    private String title;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String time;

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "hid=" + hid +
                ", course='" + course + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
