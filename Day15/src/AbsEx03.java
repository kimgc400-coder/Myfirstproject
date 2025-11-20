/* 추상클래스 특징)
 *  1.부모 추상클래스의 추상메서드는 상속받은 자손클래스에서 반드시 일반 메서드로 오버라이딩을 해야 한다. 그래야만 자손클래스 객체 생성이 
 *  가능하다.  
 */
abstract class Abs04{//부모 추상클래스 정의
	
	abstract void pr();//추상메서드 정의
}

class Child03 extends Abs04{

	@Override
	void pr() {
	  System.out.println("추상메서드를 오버라이딩 한 일반메서드");	
	}	
}

public class AbsEx03 {
	public static void main(String[] args) {

		Abs04 abs;//추상클래스로 참조변수 abs선언
		abs = new Child03();//추상클래스로 업캐스팅도 가능함
		abs.pr();//업캐스팅 이후 오버라이딩 한 메서드 호출
	}
}
