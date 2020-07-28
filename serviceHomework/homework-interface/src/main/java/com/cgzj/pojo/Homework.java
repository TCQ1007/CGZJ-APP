package com.cgzj.pojo;

import java.sql.Timestamp;

public class Homework {
    private int hid;
    private String type;   //考试还是试卷
    private String hname;
    private Timestamp createTime;
    private Timestamp starttime;
    private Timestamp endTime;
    private int totalTime;
    private String state;
    private int cid;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getPaperid() {
        return paperid;
    }

    public void setPaperid(int paperid) {
        this.paperid = paperid;
    }

    private int paperid;

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }



    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "Homework{" +
                "hid=" + hid +
                ", type='" + type + '\'' +
                ", hname='" + hname + '\'' +
                ", createTime=" + createTime +
                ", starttime=" + starttime +
                ", endTime=" + endTime +
                ", totalTime=" + totalTime +
                ", state='" + state + '\'' +
                ", cid=" + cid +
                ", paperid=" + paperid +
                '}';
    }


}
