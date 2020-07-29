package com.cgzj.pojo;
//判断题表
public class Judge {
    private int judgeid;
    private int homeworkid;
    private int topicordernum;
    private int topicscore;
    private String judgetitle; //题目
    private String judgeanswer;
    private String judgetype; //判断 单选 还是多选

    public int getJudgeid() {
        return judgeid;
    }

    public void setJudgeid(int judgeid) {
        this.judgeid = judgeid;
    }

    public int getHomeworkid() {
        return homeworkid;
    }

    public void setHomeworkid(int homeworkid) {
        this.homeworkid = homeworkid;
    }

    public int getTopicordernum() {
        return topicordernum;
    }

    public void setTopicordernum(int topicordernum) {
        this.topicordernum = topicordernum;
    }

    public int getTopicscore() {
        return topicscore;
    }

    public void setTopicscore(int topicscore) {
        this.topicscore = topicscore;
    }

    public String getJudgetitle() {
        return judgetitle;
    }

    public void setJudgetitle(String judgetitle) {
        this.judgetitle = judgetitle;
    }

    public String getJudgeanswer() {
        return judgeanswer;
    }

    public void setJudgeanswer(String judgeanswer) {
        this.judgeanswer = judgeanswer;
    }

    public String getJudgetype() {
        return judgetype;
    }

    public void setJudgetype(String judgetype) {
        this.judgetype = judgetype;
    }
}
