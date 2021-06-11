package com.nf.campuswall.service;

import com.nf.campuswall.dao.AlumniCircleDao;
import com.nf.campuswall.dao.impl.AlumniCircleDaoImpl;
import com.nf.campuswall.entity.AlumniCircleEntity;
import com.nf.campuswall.entity.CommentEntity;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AlumniCircleServiceImpl{

    public List<AlumniCircleEntity> getAllAlu(int pageNo, int pageSize) {
        return new AlumniCircleDaoImpl().getAllAlu(pageNo,pageSize);
    }


    public List<CommentEntity> getAllCommentByBeCommentedUuid(int pageNo, int pageSize, String beCommentedUuid) {
        return new AlumniCircleDaoImpl().getAllCommentByBeCommentedUuid(pageNo,pageSize, beCommentedUuid);
    }


    public int addAlumniCircle(AlumniCircleEntity alumniCircleEntity) {
       return new AlumniCircleDaoImpl().addAlumniCircle(alumniCircleEntity);
    }


    public int getAlumniCircleByIsReportState(String aluUuid) {
      return new AlumniCircleDaoImpl().getAlumniCircleByIsReportState(aluUuid);
    }


    public int deleteAlumniCircle(String aluUuid) {
        return new AlumniCircleDaoImpl().updateAlumniCircle(aluUuid);
    }


    public int addThumb(String modelUuid, int userId) {
        return new AlumniCircleDaoImpl().addThumb(modelUuid,userId);
    }


    public int addComment(CommentEntity comment) {
       return new AlumniCircleDaoImpl().addComment(comment);
    }
}
