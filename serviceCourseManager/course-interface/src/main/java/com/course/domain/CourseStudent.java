package com.course.domain;

/*
 *@author by java开发-曾
 *2020/7/29 11:18
 *文件说明：
 */
public class CourseStudent {
    //本表id
    private Integer id;
    //课程id
    private Integer c_id;
    //用户id
    private Integer u_id;

    public CourseStudent() {
    }

    public CourseStudent(Integer id, Integer c_id, Integer u_id) {
        this.id = id;
        this.c_id = c_id;
        this.u_id = u_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    @Override
    public String toString() {
        return "CourseStudent{" +
                "id=" + id +
                ", c_id=" + c_id +
                ", u_id=" + u_id +
                '}';
    }
}
