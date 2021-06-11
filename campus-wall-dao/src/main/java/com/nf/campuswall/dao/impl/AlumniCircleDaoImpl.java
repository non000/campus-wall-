package com.nf.campuswall.dao.impl;

import com.nf.campus.util.SqlSessionFactoryUtil;
import com.nf.campuswall.dao.AlumniCircleDao;
import com.nf.campuswall.entity.AlumniCircleEntity;
import com.nf.campuswall.entity.CommentEntity;
import org.apache.ibatis.session.SqlSession;
import java.util.List;


public class AlumniCircleDaoImpl implements AlumniCircleDao {

    @Override
    public List<AlumniCircleEntity> getAllAlu(int pageNo, int pageSize) {
        try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            List<AlumniCircleEntity> allAlu = mapper.getAllAlu(pageNo, pageSize);
            return allAlu;
        }
    }

    @Override
    public List<CommentEntity> getAllCommentByBeCommentedUuid(int pageNo, int pageSize, String beCommentedUuid) {
        try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            List<CommentEntity> comment = mapper.getAllCommentByBeCommentedUuid(pageNo, pageSize,beCommentedUuid);
            return comment;
        }
    }

    @Override
    public int addAlumniCircle(AlumniCircleEntity alumniCircleEntity) {
        try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int result = mapper.addAlumniCircle(alumniCircleEntity);
            return result;
        }
    }

    @Override
    public int getAlumniCircleByIsReportState(String aluUuid) {
        try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int state = mapper.getAlumniCircleByIsReportState(aluUuid);
            return state;
        }
    }

    @Override
    public int updateAlumniCircle(String aluUuid) {
        try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int result = mapper.updateAlumniCircle(aluUuid);
            return result;
        }
    }

    @Override
    public int addThumb(String modelUuid, int userId) {
        try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int result = mapper.addThumb(modelUuid, userId);
            return result;
        }
    }

    @Override
    public int addComment(CommentEntity comment) {
        try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int result = mapper.addComment(comment);
            return result;
        }
    }
}
