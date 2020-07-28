package com.cgzj.pojo;

public class Exam {
    private int eid;
    private String subject;
    private String time;
    private String note;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "eid=" + eid +
                ", subject='" + subject + '\'' +
                ", time='" + time + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
