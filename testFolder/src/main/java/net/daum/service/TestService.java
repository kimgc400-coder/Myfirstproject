package net.daum.service;

import org.apache.ibatis.session.SqlSession;

import net.daum.config.SessionFactory;
import net.daum.dto.TestDTO;
import net.daum.model.TestDAO;


public class TestService {

	TestDAO dao;

	public TestService() {
		dao = new TestDAO();
	}

	public Boolean loginCheck(TestDTO dto) {//TestDTO dto에는 클라이언트의 id가 들어있다.
		SqlSession session = SessionFactory.getSqlSession();
		TestDTO idFromDb = dao.getFind_Dbid(dto, session);
		return idFromDb != null;
	}
	
	public void insertWrite(TestDTO dto) {//게시판 작성
		SqlSession session = SessionFactory.getSqlSession();
		try {
			dao.insert_Write_To_Db(dto, session);
		}finally {
			session.close();
		}
		
	}

}