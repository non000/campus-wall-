package com.nf.campuswall.entity;

import java.time.LocalDateTime;


public class CommentEntity {
    private Integer commentId;                  //评论ID
    private String beCommentedUuid;             //uuid
    private String commentContent;              //评论内容
    private Integer commentLike;                //评论点赞数
    private LocalDateTime commentTime;          //评论发表时间
    private Integer parentId;                   //父级评论
    private Integer childId;                    //当前用户ID
    private LocalDateTime commentCreateTime;    //注册时间
    private LocalDateTime gmtModified;          //修改时间
    private Integer CommentState;             //删帖状态
    private Integer ReportState;              //举报状态

    public CommentEntity() {
    }

    public CommentEntity(String commentContent, Integer commentLike, Integer parentId, Integer childId) {
        this.commentContent = commentContent;
        this.commentLike = commentLike;
        this.parentId = parentId;
        this.childId = childId;
    }

    public CommentEntity(Integer commentId, String beCommentedUuid, String commentContent, Integer commentLike, LocalDateTime commentTime, Integer parentId, Integer childId, LocalDateTime commentCreateTime, LocalDateTime gmtModified, Integer CommentState, Integer ReportState) {
        this.commentId = commentId;
        this.beCommentedUuid = beCommentedUuid;
        this.commentContent = commentContent;
        this.commentLike = commentLike;
        this.commentTime = commentTime;
        this.parentId = parentId;
        this.childId = childId;
        this.commentCreateTime = commentCreateTime;
        this.gmtModified = gmtModified;
        this.CommentState = CommentState;
        this.ReportState = ReportState;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getBeCommentedUuid() {
        return beCommentedUuid;
    }

    public void setBeCommentedUuid(String beCommentedUuid) {
        this.beCommentedUuid = beCommentedUuid;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getCommentLike() {
        return commentLike;
    }

    public void setCommentLike(Integer commentLike) {
        this.commentLike = commentLike;
    }

    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(LocalDateTime commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public LocalDateTime getCommentCreateTime() {
        return commentCreateTime;
    }

    public void setCommentCreateTime(LocalDateTime commentCreateTime) {
        this.commentCreateTime = commentCreateTime;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getCommentState() {
        return CommentState;
    }

    public void setCommentState(Integer commentState) {
        this.CommentState = commentState;
    }

    public Integer getReportState() {
        return ReportState;
    }

    public void setReportState(Integer reportState) {
        this.ReportState = reportState;
    }

    @Override
    public String toString() {
        return "CommentEntity{" +
                "commentId=" + commentId +
                ", beCommentedUuid='" + beCommentedUuid + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", commentLike=" + commentLike +
                ", commentTime=" + commentTime +
                ", parentId=" + parentId +
                ", childId=" + childId +
                ", commentCreateTime=" + commentCreateTime +
                ", gmtModified=" + gmtModified +
                ", isCommentState=" + CommentState +
                ", isReportState=" + ReportState +
                '}';
    }
}
