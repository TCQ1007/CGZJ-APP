package com.cgzj.pojo;

public class Detail {
    private int msgid;
    private int userid;
    private int homeworkid;
    private int jtopicid; //判断题id
    private int ctopicid; //选择题id
    private int courseid;
    private String useranswer;
    private String topictype;

    public int getMsgid() {
        return msgid;
    }

    public void setMsgid(int msgid) {
        this.msgid = msgid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getHomeworkid() {
        return homeworkid;
    }

    public void setHomeworkid(int homeworkid) {
        this.homeworkid = homeworkid;
    }

    public int getJtopicid() {
        return jtopicid;
    }

    public void setJtopicid(int jtopicid) {
        this.jtopicid = jtopicid;
    }

    public int getCtopicid() {
        return ctopicid;
    }

    public void setCtopicid(int ctopicid) {
        this.ctopicid = ctopicid;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getUseranswer() {
        return useranswer;
    }

    public void setUseranswer(String useranswer) {
        this.useranswer = useranswer;
    }

    public String getTopictype() {
        return topictype;
    }

    public void setTopictype(String topictype) {
        this.topictype = topictype;
    }
}
