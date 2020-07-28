package pojo;

/**
 * Created with IntelliJ IDEA.
 * User: Chen Xueni
 * Date: 2020/07/28
 * Description:
 * Version: V1.0（版本）
 */
public class Course {
    private int id;
    private String cname;
    private String cimg;
    private String cstate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg;
    }

    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }

    public Course(int id, String cname, String cimg, String cstate) {
        this.id = id;
        this.cname = cname;
        this.cimg = cimg;
        this.cstate = cstate;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", cimg='" + cimg + '\'' +
                ", cstate='" + cstate + '\'' +
                '}';
    }
}
