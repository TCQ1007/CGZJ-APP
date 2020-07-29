package com.cgzj.pojo;

import java.sql.Timestamp;

public class Homework {
    private int hwid;
    private String hktype;   //考试还是试卷
    private String hwname;
    private Timestamp hwcreateTime;
    private Timestamp hwstarttime;
    private Timestamp hwendTime;
    private int hwtotalTime;
    private String hwstate;
    private int hkofcourseid;
    private int hwpaperid;

    public int getHwid() {
        return hwid;
    }

    public void setHwid(int hwid) {
        this.hwid = hwid;
    }

    public String getHktype() {
        return hktype;
    }

    public void setHktype(String hktype) {
        this.hktype = hktype;
    }

    public String getHwname() {
        return hwname;
    }

    public void setHwname(String hwname) {
        this.hwname = hwname;
    }

    public Timestamp getHwcreateTime() {
        return hwcreateTime;
    }

    public void setHwcreateTime(Timestamp hwcreateTime) {
        this.hwcreateTime = hwcreateTime;
    }

    public Timestamp getHwstarttime() {
        return hwstarttime;
    }

    public void setHwstarttime(Timestamp hwstarttime) {
        this.hwstarttime = hwstarttime;
    }

    public Timestamp getHwendTime() {
        return hwendTime;
    }

    public void setHwendTime(Timestamp hwendTime) {
        this.hwendTime = hwendTime;
    }

    public int getHwtotalTime() {
        return hwtotalTime;
    }

    public void setHwtotalTime(int hwtotalTime) {
        this.hwtotalTime = hwtotalTime;
    }

    public String getHwstate() {
        return hwstate;
    }

    public void setHwstate(String hwstate) {
        this.hwstate = hwstate;
    }

    public int getHkofcourseid() {
        return hkofcourseid;
    }

    public void setHkofcourseid(int hkofcourseid) {
        this.hkofcourseid = hkofcourseid;
    }

    public int getHwpaperid() {
        return hwpaperid;
    }

    public void setHwpaperid(int hwpaperid) {
        this.hwpaperid = hwpaperid;
    }
}
