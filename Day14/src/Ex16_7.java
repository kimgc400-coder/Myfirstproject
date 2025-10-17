/*
 * 16장 상속.pdf No.29 6번 문제)
 *  문제와 자바 소스는 강의교안을 참조하고 이 소스의 실행 결과를 주석문으로 처리해서 보일 수 있게 한다.
 */

class Base{
	
	Base(){
		//super();이 생략됨 ->최상위 부모클래스 Object의 기본생성자를 호출하면서 생성자 호출은 끝이 난다.
		System.out.print("Base");
	}//기본 생성자 정의
}

class Alpha extends Base{
	
	//기본생성자 묵시적 생략
}

public class Ex16_7 {
	public static void main(String[] args) {

		new Alpha();//자손클래스 기본생성자 호출 ->Base
		new Base();//부모클래스 기본생성자 호출 -> Base
		/*
		 * 답안 출력물) BaseBase
		 */
	}
}
