/* 부모와 자손에서 동일한 멤버변수명이 정의된 경우와 자손에서 메서드가 오버라이딩이 된 경우 각각 호출되는 변수와 메서드에 관한 실습이다.
 * 또한 동일한 멤버변수명이 부모와 자손에서 각각 정의된 경우 부모로 부터 상속받은 동일 멤버변수명에 접근할 때는 super.변수명으로 하고 자손에서 정의된
 * 동일 멤버변수명에 접근할 때는 this.변수명 또는 this.은 생략하고 변수명으로 접근한다.
 */
class Mother09{
	int a= 100;
	
	void m() {
		System.out.println("부모에서 정의한 메서드 m()");
	}
}

class Child09 extends Mother09{
	int a = 200;
	
	@Override
	void m() {
		System.out.println("a="+a);//자손에서 정의한 동일 멤버변수명 a에 접근한다. this.은 생략
		System.out.println("this.a="+this.a);//200, this.은 생략가능함
		System.out.println("super.a="+super.a);//부모로 부터 상속받은 동일 멤버변수명에 접근한다. -> 100
	}
}

public class RefCast09 {
	public static void main(String[] args) {

	   Mother09 m09 = new Child09();//업캐스팅
	   
	   System.out.println("m09.a = "+m09.a);//100
	   m09.m();//업캐스팅 이후 오버라이딩 한 메서드 m() 호출
	}
}



