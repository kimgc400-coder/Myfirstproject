/* 17장.레퍼런스 형 변환.pdf 의 No.19 2번 문제)
 *  소스는 강의 교안을 참조하고 명시적인 다운캐스팅을 할 때 if조건문과 instanceof 연산자를 추가 코드해서 true인 경우만 안전하게 다운캐스팅을 하게
 *  변경해 보자.
 *  SubClass에 리턴타입이 없는 pr(){}메서드를 정의하고 다운캐스팅한 foo로 사용자 정의 메서드를 호출해서 멤버변수 값 i를 출력되게
 *  변경해 보자.
 */
class SubClass extends Object{
	int i=7;
	
	void pr() {
		System.out.println("i="+i);
	}
}

public class Ex17_01 {
	public static void main(String[] args) {

		Object obj = new SubClass();//업캐스팅
		
		if(obj instanceof SubClass) {//obj가 자손클래스타입 SubClass 로 다운캐스팅이 가능한가? true -> 사전에 업캐스팅 했기 때문에
			SubClass foo = (SubClass)obj;//명시적인 캐스팅 형변환 연산자를 사용해서 다운캐스팅
			foo.pr();
		}
	}
}
