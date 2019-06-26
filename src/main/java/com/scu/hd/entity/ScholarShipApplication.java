package com.scu.hd.entity;


import java.util.Date;

/**
 * @author zhong songzhi
 * @create 2019-06-26-17:36
 */

public class ScholarShipApplication {
    Integer schoAppId;

    Integer stuId;

    String schoPersonnalStmt;

    Integer schoApprove;

    Date schoApprovetime;

    Date schoSubmittime;

    public Integer getSchoAppId() {
        return schoAppId;
    }

    public void setSchoAppId(Integer schoAppId) {
        this.schoAppId = schoAppId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getSchoPersonnalStmt() {
        return schoPersonnalStmt;
    }

    public void setSchoPersonnalStmt(String schoPersonnalStmt) {
        this.schoPersonnalStmt = schoPersonnalStmt;
    }

    public Integer getSchoApprove() {
        return schoApprove;
    }

    public void setSchoApprove(Integer schoApprove) {
        this.schoApprove = schoApprove;
    }

    public Date getSchoApprovetime() {
        return schoApprovetime;
    }

    public void setSchoApprovetime(Date schoApprovetime) {
        this.schoApprovetime = schoApprovetime;
    }

    public Date getSchoSubmittime() {
        return schoSubmittime;
    }

    public void setSchoSubmittime(Date schoSubmittime) {
        this.schoSubmittime = schoSubmittime;
    }

    public ScholarShipApplication() {
    }

    public ScholarShipApplication(Integer schoAppId, Integer stuId, String schoPersonnalStmt, Integer schoApprove, Date schoApprovetime, Date schoSubmittime) {
        this.schoAppId = schoAppId;
        this.stuId = stuId;
        this.schoPersonnalStmt = schoPersonnalStmt;
        this.schoApprove = schoApprove;
        this.schoApprovetime = schoApprovetime;
        this.schoSubmittime = schoSubmittime;
    }

    @Override
    public String toString() {
        return "ScholarShipApplication{" +
                "schoAppId=" + schoAppId +
                ", stuId=" + stuId +
                ", schoPersonnalStmt='" + schoPersonnalStmt + '\'' +
                ", schoApprove=" + schoApprove +
                ", schoApprovetime=" + schoApprovetime +
                ", schoSubmittime=" + schoSubmittime +
                '}';
    }
}
