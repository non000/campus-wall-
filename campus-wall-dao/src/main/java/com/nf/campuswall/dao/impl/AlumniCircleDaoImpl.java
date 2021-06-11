package com.nf.campuswall.dao.impl;

import com.nf.campuswall.dao.AlumniCircleDao;
import com.nf.campuswall.entity.AlumniCircleEntity;
import com.nf.campuswall.entity.CommentEntity;
import com.nf.campuswall.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AlumniCircleDaoImpl implements AlumniCircleDao {

    @Override
    public List<AlumniCircleEntity> getAllAlu(int pageNo, int pageSize) {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            List<AlumniCircleEntity> list = mapper.getAllAlu(pageNo, pageSize);
            return list;
        }
    }

    @Override
    public List<CommentEntity> getAllComment(int pageNo, int pageSize) {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            List<CommentEntity> list = mapper.getAllComment(pageNo, pageSize);
            return list;
        }
    }

    @Override
    public int addAlumniCircle(AlumniCircleEntity alumniCircleEntity) {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int i = mapper.addAlumniCircle(alumniCircleEntity);
            return i;
        }
    }

    @Override
    public int getAlumniCircleByIsReportState(String aluUuid) {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int state = mapper.getAlumniCircleByIsReportState(aluUuid);
            return state;
        }
    }

    @Override
    public int deleteAlumniCircle(String aluUuid) {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int i = mapper.deleteAlumniCircle(aluUuid);
            return i;
        }
    }

    @Override
    public int addThumb(String modelUuid, int userId) {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int i = mapper.addThumb(modelUuid, userId);
            return i;
        }
    }

    @Override
    public int addComment(CommentEntity comment) {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int i = mapper.addComment(comment);
            return i;
        }
    }
}
