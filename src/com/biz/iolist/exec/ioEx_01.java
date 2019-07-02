package com.biz.iolist.exec;

import org.apache.ibatis.session.SqlSession;

import com.biz.iolist.config.DBConnection;
import com.biz.iolist.dao.IolistDao;
import com.biz.iolist.model.IolistVO;


public class ioEx_01 {

	public static void main(String[] args) {
		SqlSession sqlSession = DBConnection
								.getSessionFactory()
								.openSession(true);
		
		IolistDao ioDao = (IolistDao) sqlSession.getMapper(IolistDao.class);
		IolistVO vo = new IolistVO();
		
		vo.setIo_date("2017-01-01");
		vo.setIo_inout("1");
		vo.setIo_pcode("P0001");
		vo.setIo_ccode("C0001");
		vo.setIo_price(500);
		vo.setIo_qty(100);
		vo.setIo_total(vo.getIo_price() * vo.getIo_qty());
		
		ioDao.insert(vo);
	}

	
	
	
	
	
	
			
}
