/* 생성자의 특징)
 *  1.생성자 이름은 클래스 이름과 같게 정의한다. new 클래스명();에 의해서 생성자를 호출한다.
 *  2.생성자의 주된 기능은 클래스 소속의 멤버변수 중 객체 생성해서 접근하는 인스턴스 변수 초기화 기능이다.
 *  3.생성자 명 앞에 리턴타입을 기술하지 않는다.
 */
class MyDate23{
	private int year;//년도값
	private int month;//월값
	private int day;//일값, 3개의 속성 정의(클래스 소속의 멤버변수 중 인스턴스 변수)
	
	public MyDate23() {//전달인자가 없는 기본생성자
		year = 2025; //생성자의 주된 기능인 인스턴스 변수 초기화
		month = 8;
		day = 28;
		System.out.println("기본 생성자 호출");
	}
	
	public void print() {//사용자 정의 메서드
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
}//MyDate23 class

public class ClassEx03 {
	public static void main(String[] args) {
      MyDate23 d=new MyDate23();//new MyDate23();에 의해서 기본생성자를 호출
      d.print();
      new MyDate23();//생성자를 호출
	}
}
