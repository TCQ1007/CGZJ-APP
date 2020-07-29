package com.course.domain;

/*
 *@author by java开发-曾
 *2020/7/29 11:24
 *文件说明：
 */
public class CourseProgress {
    //本表的id
    private Integer cpid;
    //用户id
    private Integer userId;
    //课程id
    private Integer courseId;
    //章节id
    private Integer chapterId;
    //是否完成id
    private Integer isFinished;

    public CourseProgress() {
    }

    public CourseProgress(Integer cpid, Integer userId, Integer courseId, Integer chapterId, Integer isFinished) {
        this.cpid = cpid;
        this.userId = userId;
        this.courseId = courseId;
        this.chapterId = chapterId;
        this.isFinished = isFinished;
    }

    public Integer getCpid() {
        return cpid;
    }

    public void setCpid(Integer cpid) {
        this.cpid = cpid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Integer isFinished) {
        this.isFinished = isFinished;
    }

    @Override
    public String toString() {
        return "CourseProgress{" +
                "cpid=" + cpid +
                ", userId=" + userId +
                ", courseId=" + courseId +
                ", chapterId=" + chapterId +
                ", isFinished=" + isFinished +
                '}';
    }
}
