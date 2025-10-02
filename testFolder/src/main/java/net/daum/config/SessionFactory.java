/*
 * 항상 경로수정및 클래스명 수정할 것
 * 여기서의 세션은 DB와 상호작용할 때 사용하는 객체-->HttpSession과 같이 세션이라고 불리는 이유는
 * 									  -->일정시간 동안 유지되는 연결/상태라는 공통점 때문에 세션이라는 용어를 쓴다.
 * 하나의 SqlSession은 DB커넥션을 감싸고 있음--> 알아볼것
 */

package net.daum.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {
	
	
	static SqlSessionFactory sqlSessionFactory;
	
	static {//스태틱 초기화 블록
		String resource = "net/daum/mapper/Configuration.xml";//새로운 프로젝트를 시작한다명 항상 경로명을 바꿔줘야한다.
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource); 
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); 
							//-->build() 메서드가 InputStream을 받아서, 내부적으로 XML을 파싱 → 환경설정 객체 생성 → SqlSessionFactory 반환.
							//클래스 초기화블럭에 대해서 공부할것
							//세션팩토리의 역할과 기능에 대해서 알것
							//빌더가 무슨 역할을 하고 기능이 무엇인지 build란 메서드가 무슨 기능을 하는지
							//이 클래스에서 파싱이 어디에서 이루어지는 파싱에 대해서 알아야한다.
	}
	
	public static SqlSession getSqlSession() { 
		SqlSession session = sqlSessionFactory.openSession(); 
		return session;
		
	}
}
