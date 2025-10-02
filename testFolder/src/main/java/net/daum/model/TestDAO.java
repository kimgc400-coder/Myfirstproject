package net.daum.model;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.apache.ibatis.session.SqlSession;

import net.daum.dto.TestDTO;
//여기서 굳이 session을 만들필요없이 서비스에서 만들면 된다.
//DAO가 마음대로 세션을 만들고 닫아버리면 트랜잭션을 여러 DAO메서드가 공유할 수가 없다.
//한 DAO 실행마다 매번 세션이 끊겨버림



public class TestDAO {
	
	public TestDTO getFind_Dbid(TestDTO dto, SqlSession session) {
		
		return session.selectOne("Mapper.test_user_id",dto);
		
	}
	
	public void insert_Write_To_Db(TestDTO dto, SqlSession session) {
		
		session.insert("test_write",dto);
		
	}
	
}
