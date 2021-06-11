package com.nf.campuswall.entity;

import java.time.LocalDateTime;

public class AlumniCircleEntity {
    private Integer aluId;                   //校友圈ID
    private String aluUuid;                 //校友圈唯一标识
    private String aluTitle;                //校友圈标题
    private String aluAuthor;               //校友圈作者
    private String aluContent;              //校友圈内容
    private String aluEnclosure;            //校友圈附件
    private LocalDateTime aluCreateTime;    //校友圈发表时间
    private LocalDateTime gmtModified;      //修改时间
    private Integer AluState;             //删帖状态（0代表停用，1代表启用）
    private Integer ReportState;          //举报状态（0代表未举报，1代表举报）

    public AlumniCircleEntity() {
    }

    public AlumniCircleEntity(String aluTitle, String aluAuthor, String aluContent, String aluEnclosure) {
        this.aluTitle = aluTitle;
        this.aluAuthor = aluAuthor;
        this.aluContent = aluContent;
        this.aluEnclosure = aluEnclosure;
    }

    public AlumniCircleEntity(Integer aluId, String aluUuid, String aluTitle, String aluAuthor, String aluContent, String aluEnclosure, LocalDateTime aluCreateTime, LocalDateTime gmtModified, Integer AluState, Integer ReportState) {
        this.aluId = aluId;
        this.aluUuid = aluUuid;
        this.aluTitle = aluTitle;
        this.aluAuthor = aluAuthor;
        this.aluContent = aluContent;
        this.aluEnclosure = aluEnclosure;
        this.aluCreateTime = aluCreateTime;
        this.gmtModified = gmtModified;
        this.AluState = AluState;
        this.ReportState = ReportState;
    }

    public Integer getAluId() {
        return aluId;
    }

    public void setAluId(Integer aluId) {
        this.aluId = aluId;
    }

    public String getAluUuid() {
        return aluUuid;
    }

    public void setAluUuid(String aluUuid) {
        this.aluUuid = aluUuid;
    }

    public String getAluTitle() {
        return aluTitle;
    }

    public void setAluTitle(String aluTitle) {
        this.aluTitle = aluTitle;
    }

    public String getAluAuthor() {
        return aluAuthor;
    }

    public void setAluAuthor(String aluAuthor) {
        this.aluAuthor = aluAuthor;
    }

    public String getAluContent() {
        return aluContent;
    }

    public void setAluContent(String aluContent) {
        this.aluContent = aluContent;
    }

    public String getAluEnclosure() {
        return aluEnclosure;
    }

    public void setAluEnclosure(String aluEnclosure) {
        this.aluEnclosure = aluEnclosure;
    }

    public LocalDateTime getAluCreateTime() {
        return aluCreateTime;
    }

    public void setAluCreateTime(LocalDateTime aluCreateTime) {
        this.aluCreateTime = aluCreateTime;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getAluState() {
        return AluState;
    }

    public void setAluState(Integer aluState) {
        this.AluState = aluState;
    }

    public Integer getReportState() {
        return ReportState;
    }

    public void setReportState(Integer reportState) {
        this.ReportState = reportState;
    }

    @Override
    public String toString() {
        return "AlumniCircleEntity{" +
                "aluId=" + aluId +
                ", aluUuid='" + aluUuid + '\'' +
                ", aluTitle='" + aluTitle + '\'' +
                ", aluAuthor='" + aluAuthor + '\'' +
                ", aluContent='" + aluContent + '\'' +
                ", aluEnclosure='" + aluEnclosure + '\'' +
                ", aluCreateTime=" + aluCreateTime +
                ", gmtModified=" + gmtModified +
                ", isAluState=" + AluState +
                ", isReportState=" + ReportState +
                '}';
    }
}
