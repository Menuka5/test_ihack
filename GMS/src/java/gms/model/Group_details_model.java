/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gms.model;

/**
 *
 * @author janaka
 */
public class Group_details_model {

    private int gid;
    private int gcreateMemberid;
    private String date;
    private String time;
    private String gname;
    private String gdescription;
    private String privacy;
    

    public Group_details_model(int gid, String gname, int gcreateMemberid, String date, String time, String privacy, String gdescription) {
        this.gid = gid;
        this.gcreateMemberid = gcreateMemberid;
        this.date = date;
        this.time = time;
        this.gname = gname;
        this.gdescription = gdescription;
        this.privacy = privacy;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getGcreateMemberid() {
        return gcreateMemberid;
    }

    public void setGcreateMemberid(int gcreateMemberid) {
        this.gcreateMemberid = gcreateMemberid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Group_details_model() {
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGdescription() {
        return gdescription;
    }

    public void setGdescription(String gdescription) {
        this.gdescription = gdescription;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

}
