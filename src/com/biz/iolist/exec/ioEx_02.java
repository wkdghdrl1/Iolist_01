package com.biz.iolist.exec;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.biz.iolist.config.DBConnection;
import com.biz.iolist.dao.IolistDao;
import com.biz.iolist.model.IolistVO;

public class ioEx_02 {
	public static void main(String[] args) {

		SqlSession sqlSession = DBConnection.getSessionFactory().openSession(true);

		IolistDao ioDao = (IolistDao) sqlSession.getMapper(IolistDao.class);
		
		List<IolistVO> ioList = ioDao.selectAll();
		for(IolistVO vo : ioList) {
			System.out.println(vo);
		}

	}

}
