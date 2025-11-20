/* 17장.레퍼런스 형 변환.pdf 의 No.20 3번 문제)
 * 상속 관계에서 업캐스팅 이후 오버라이딩 한 메서드 호출에 관한 문제이다. 출력 결과물을 주석문 처리해서 보여주고 어떤 부분만 추가해서 보다 더 나은
 * 자바 OOP인 객체지향 프로그래밍 코드로 변경해 본다.
 */
class Super{
	public int getNumber(int a) {
		return a + 1;
	}
}

class CastingEx03 extends Super{

	@Override
	public int getNumber(int a) {//오버라이딩 한 메서드
		return a +2 ;
	}	
}

public class Ex17_02 {
	public static void main(String[] args) {

		Super s = new CastingEx03();//업캐스팅
		System.out.println(s.getNumber(0));//업캐스팅 이후 오버라이딩 한 메서드 호출 -> 2ㅙ무ㅡㅕㅜ@&#
	}
}
