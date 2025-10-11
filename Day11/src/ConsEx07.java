/* this 키워드를 사용하는 이유)
 *  1. 생성자나 메서드 {}  중괄호 블록내에서 클래스 소속의 멤버 변수 중 인스턴스 변수와 생성자나 메서드 소속의 매개변수인 전달인자명이 같은 경우
 *  자바는 어느것이 인스턴스 변수인지 전달인자 인지를 구분 못한다. 그러므로 해당 인스턴스 변수명앞에 this.을 붙이면 클래스 소속의 인스턴스 변수라는
 *  것을 알게 된다.그러면 구분이 되어서 값을 저장할 수 있다.
 *  
 *  2.여기서는 this.을 붙이지 않아서 년도값을 저장하지 못하는 문제가 발생한다.
 */
class MyDate25{
	private int year;
	private int month;
	private int day;
	
	public MyDate25() {} //기본 생성자
	
	public MyDate25(int new_year, int new_month, int new_day) {
		year = new_year; month = new_month; day=new_day;
	}//전달인자 개수가 다른 오버로딩 된 생성자
	
	public void setYear(int year) {//값 저장 setter() 메서드
		year = year;//왼쪽의 인스턴스 변수와 오른쪽의 매개변수명이 같으면 자바는 구분 못해서 년도값 저장 못함.
	}
	
	public void setMonth(int new_month) {
		month = new_month;
	}
	
	public void pr() {
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
}

public class ConsEx07 {
	public static void main(String[] args) {
     MyDate25 md = new MyDate25(2025,7,1);//전달인자 3개짜리 오버로딩 된 생성자 호출
     md.pr();
     md.setYear(2026);//년도값 수정 못함
     md.pr();
     md.setMonth(8);//8월로 변경
     md.pr();
	}
}




