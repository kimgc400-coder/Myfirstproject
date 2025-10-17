/*
 * 16장 상속.pdf No.28 5번 문제)
 *  문제는 강의교안을 참조하고 이 소스는 컴파일 에러가 발생한다. 에러가 나는 이유에 대해서 주석문 처리한다.
 */
class TestSuper {//extends Object이 생략됨
	int i;//클래스 소속의 멤버변수 중 인스턴스 변수 i선언함. 초기 기본값 0으로 초기화
	
	TestSuper(int i){
		this.i=i;
	}//생성자가 오버로딩 되면 자바는 더 이상 매개변수가 없는 기본생성자를 묵시적 제공 안함.	
}

class TestSub extends TestSuper{
	/* 답안: 에러가 나는 이유는 부모클래스 생성자가 오버로딩이 되었기 때문에 자바는 더 이상 부모의 기본생성자를 묵시적 제공을 하지 않는다. 그런대 
	 * 자손에서 부모의 기본생성자를 호출할려다가 컴파일 에러가 나는 것이다.
	 */
	
	//자손의 기본생성자가 묵시적 생략됨
}//자손 클래스 TestSub

public class Ex16_6 {
	public static void main(String[] args) {
		new TestSub();
	}
}
