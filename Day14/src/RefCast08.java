/*
 *  1. 부모와 자손에서 동일 멤버변수명이 정의된 경우는 호출되는 변수 결정은 참조변수 타입에 의해서 결정된다.
 *  2. 업캐스팅 이후 오버라이딩 한 메서드 호출 -> 메서드가 오버라이딩 된 경우는 참조변수가 실제 가리키는 객체 타입에 의해서 호출되는 메서드가 결정된다.
 */
class Mother08 extends Object{
	int x = 100;
	
	public void methodPrint() {
		System.out.println("부모클래스 메서드 methodPrint()");
	}
}

class Son08 extends Mother08{
	int x = 200;

	@Override
	public void methodPrint() {
        System.out.println("오버라이딩 한 메서드 methodPrint()");		
	}	
}

public class RefCast08 {
	public static void main(String[] args) {

		Mother08 m = new Son08();//업캐스팅
		
		System.out.println("m.x = "+m.x);//100 -> 부모와 자손에서 동일 멤버변수명이 정의된 경우는 호출되는 변수 결정은 참조변수 타입에 의해
		//서 결정된다.
		m.methodPrint();//업캐스팅 이후 오버라이딩 한 메서드 호출은 참조변수가 실제 가리키는 인스턴스 객체타입에 의해서 결정된다.
		
		Mother08 m2=new Mother08();
		System.out.println("m2.x = "+m2.x);//100
		m2.methodPrint();
	}
}
