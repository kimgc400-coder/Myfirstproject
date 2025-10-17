/*
 * 16장 상속.pdf No.31 8번 문제)
 * 문제와 소스는 강의 교안을 참조하고 소스에서 컴파일 에러가 나는 이유에 대해서 주석문 처리한다.
 */
class A{//extends Object이 생략됨
	public A() {
		super();//최고 조상 Object클래스의 기본생성자 호출한다.물론 생략 가능함.
		System.out.println("A클래스 기본생성자");
	}
}

class B extends A{
	public B() {
		System.out.println("B자손클래스 기본생성자");
		super();
		/* 컴파일 에러가 발생하는 이유는 부모클래스 기본생상자를 호출할 때는 생성자 중괄호 {}블록내에서 항상 첫줄에 와서 가장 먼저 호출해
		 * 야 한다.
		 */
	}
}

public class Ex16_9 {
	public static void main(String[] args) {
       new B();
	}
}
