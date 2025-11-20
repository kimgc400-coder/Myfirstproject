/*
 * 18장.추상 클래스와final.pdf No.19 1번 문제)
 *  부모 추상클래스의 추상메서드는 상속받은 자손클래스에서 모두 오버라이딩을 해야 한다라는 강제성이 부여된다.  
 */
abstract class Abs07{//extends Object이 생략됨
	//abstract class 추상클래스 정의
	int a=10;
	String str="Test";
	
	public abstract int getA();//추상 메서드 정의 -> 추상메서드는 {}가 없고, 실행문장이 없고,호출이 불가능하다.
	
	public String getStr() {
		return str;
	}
}

abstract class Abs08 extends Abs07{
	int b=100;
	
	public abstract int getB();
}

class AbsMain extends Abs08{

	@Override
	public int getB() {
		return b;
	}

	@Override
	public int getA() {
		return a;
	}	
}

public class Ex18_01 {
	public static void main(String[] args) {
		AbsMain am=new AbsMain();
		System.out.println(am.getA());
		System.out.println(am.getB());
	}
}
