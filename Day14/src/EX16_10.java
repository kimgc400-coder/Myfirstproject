/*
 * 16장 상속.pdf No.32 9번 문제)
 * 문제와 소스는 강의 교안을 참조하고 주어진 소스는 자바 oop 객체 지향 프로그래밍 코드에서 약간 미흡한 부분이 있다. 좀 더 완벽한 OOP코드로
 * 변경해 본다.
 */

class A2 extends Object{//extends Object 은 생략가능함
	
	@Override //오버라이딩 한 메서드
	public String toString() {
		return "4";
	}
}

class B2 extends A2{
	
	@Override //오버라이딩 한 메서드에서는 @Override 애너테이션을 추가한다.
	public String toString() {
		return super.toString()+"3";//"43"이 반환
	}
}

public class EX16_10 {
	public static void main(String[] args) {

      B2 b01=new B2();
      System.out.println(b01.toString());//.toString() 메서드는 생략가능함
      System.out.println(b01);
      
      System.out.println(new B2().toString());
      System.out.println(new B2());//.toString()메서드 생략
      System.out.println(new A2().toString());//"4"      
      
	}
}





