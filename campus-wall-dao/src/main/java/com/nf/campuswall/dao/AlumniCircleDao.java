package com.nf.campuswall.dao;

import com.nf.campuswall.entity.AlumniCircleEntity;
import com.nf.campuswall.entity.CommentEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlumniCircleDao {

    List<AlumniCircleEntity> getAllAlu(@Param("pageNo") int pageNo,@Param("pageSize") int pageSize);//所有动态

    List<CommentEntity> getAllCommentByBeCommentedUuid(@Param("pageNo") int pageNo, @Param("pageSize") int pageSize, @Param("beCommentedUuid") String beCommentedUuid);//所有评论

    int addAlumniCircle(@Param("Alumn") AlumniCircleEntity alumniCircleEntity);//发表动态

    int getAlumniCircleByIsReportState(@Param("aluUuid") String aluUuid);//举报

    int updateAlumniCircle(@Param("aluUuid") String aluUuid);//删帖

    int addThumb(@Param("modelUuid") String modelUuid,@Param("userId") int userId);//点赞

    int addComment(@Param("comment") CommentEntity comment);//添加评论
}
