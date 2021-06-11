package com.nf.campuswall.entity;

import java.time.LocalDateTime;

public class ThumbEntity {
    private Integer thumbId;                        //点赞号
    private String modelUuid;                       //uuid
    private Integer userId;                         //点赞用户账号
    private LocalDateTime thumbCreateTime;          //点赞创建时间
    private LocalDateTime gmtModified;              //修改时间

    public ThumbEntity() {
    }

    public ThumbEntity(Integer thumbId, String modelUuid, Integer userId, LocalDateTime thumbCreateTime, LocalDateTime gmtModified) {
        this.thumbId = thumbId;
        this.modelUuid = modelUuid;
        this.userId = userId;
        this.thumbCreateTime = thumbCreateTime;
        this.gmtModified = gmtModified;
    }

    public Integer getThumbId() {
        return thumbId;
    }

    public void setThumbId(Integer thumbId) {
        this.thumbId = thumbId;
    }

    public String getModelUuid() {
        return modelUuid;
    }

    public void setModelUuid(String modelUuid) {
        this.modelUuid = modelUuid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDateTime getThumbCreateTime() {
        return thumbCreateTime;
    }

    public void setThumbCreateTime(LocalDateTime thumbCreateTime) {
        this.thumbCreateTime = thumbCreateTime;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "ThumbEntity{" +
                "thumbId=" + thumbId +
                ", modelUuid='" + modelUuid + '\'' +
                ", userId=" + userId +
                ", thumbCreateTime=" + thumbCreateTime +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
