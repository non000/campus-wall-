package com.nf.campuswall.dao.impl;

import com.nf.campuswall.dao.AlumniCircleDao;
import com.nf.campuswall.entity.AlumniCircleEntity;
import com.nf.campuswall.entity.CommentEntity;
import com.nf.campuswall.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AlumniCircleDaoImplTest {

    @Test
    public void getAllAlu() {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            List<AlumniCircleEntity> allAlu = mapper.getAllAlu(1, 1);
            System.out.println(allAlu);
        }
    }

    @Test
    public void getAllComment() {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            List<CommentEntity> allComment = mapper.getAllComment(1, 1);
            System.out.println(allComment);
        }
    }

    @Test
    public void addAlumniCircle() {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            AlumniCircleEntity alumniCircleEntity = new AlumniCircleEntity("陈大妹","X","如何有钱","从v");
            int i = mapper.addAlumniCircle(alumniCircleEntity);
            System.out.println(i);
        }
    }


    @Test
    public void getAlumniCircleByIsReportState() {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int state = mapper.getAlumniCircleByIsReportState("a8e294c4c9b711ebafcbd8c497f13448");
            System.out.println(state);
        }
    }

    @Test
    public void deleteAlumniCircle() {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int i = mapper.deleteAlumniCircle("172808b2c9b911ebafcbd8c497f13448");
            System.out.println(i);
        }
    }

    @Test
    public void addThumb() {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            int i = mapper.addThumb("172808b2c9b911ebafcbd8c497f13448", 2);
            System.out.println(i);
        }
    }

    @Test
    public void addComment() {
        try (SqlSession session = SqlSessionFactoryUtil.getSession()) {
            AlumniCircleDao mapper = session.getMapper(AlumniCircleDao.class);
            CommentEntity commentEntity = new CommentEntity("如何变富婆",3,1,2);
            int i = mapper.addComment(commentEntity);
            System.out.println(i);
        }
    }
}