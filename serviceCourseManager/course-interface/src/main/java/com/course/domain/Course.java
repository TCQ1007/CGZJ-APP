package com.course.domain;

/*
 *@author by java开发-曾
 *2020/7/29 9:18
 *文件说明：这里的文件表示课程添加所需要的bean
 *
 */

import java.sql.Timestamp;

public class Course {

    private Integer cid;
    private String cname;
    private String csummary;
    private Integer cteacherid;
    private String cimage;
    private String cinvitcode;
    private String ctype;
    private String cliveurl;
    private Timestamp clivetime;
    private Integer cisliving;
    private Integer cisprivate;
    private String cdegree;
    private Timestamp ccreatetime;

    public Course() {
    }

    public Course(Integer cid, String cname, String csummary, Integer cteacherid, String cimage, String cinvitcode, String ctype, String cliveurl, Timestamp clivetime, Integer cisliving, Integer cisprivate, String cdegree, Timestamp ccreatetime) {
        this.cid = cid;
        this.cname = cname;
        this.csummary = csummary;
        this.cteacherid = cteacherid;
        this.cimage = cimage;
        this.cinvitcode = cinvitcode;
        this.ctype = ctype;
        this.cliveurl = cliveurl;
        this.clivetime = clivetime;
        this.cisliving = cisliving;
        this.cisprivate = cisprivate;
        this.cdegree = cdegree;
        this.ccreatetime = ccreatetime;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCsummary() {
        return csummary;
    }

    public void setCsummary(String csummary) {
        this.csummary = csummary;
    }

    public Integer getCteacherid() {
        return cteacherid;
    }

    public void setCteacherid(Integer cteacherid) {
        this.cteacherid = cteacherid;
    }

    public String getCimage() {
        return cimage;
    }

    public void setCimage(String cimage) {
        this.cimage = cimage;
    }

    public String getCinvitcode() {
        return cinvitcode;
    }

    public void setCinvitcode(String cinvitcode) {
        this.cinvitcode = cinvitcode;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public String getCliveurl() {
        return cliveurl;
    }

    public void setCliveurl(String cliveurl) {
        this.cliveurl = cliveurl;
    }

    public Timestamp getClivetime() {
        return clivetime;
    }

    public void setClivetime(Timestamp clivetime) {
        this.clivetime = clivetime;
    }

    public Integer getCisliving() {
        return cisliving;
    }

    public void setCisliving(Integer cisliving) {
        this.cisliving = cisliving;
    }

    public Integer getCisprivate() {
        return cisprivate;
    }

    public void setCisprivate(Integer cisprivate) {
        this.cisprivate = cisprivate;
    }

    public String getCdegree() {
        return cdegree;
    }

    public void setCdegree(String cdegree) {
        this.cdegree = cdegree;
    }

    public Timestamp getCcreatetime() {
        return ccreatetime;
    }

    public void setCcreatetime(Timestamp ccreatetime) {
        this.ccreatetime = ccreatetime;
    }
}
