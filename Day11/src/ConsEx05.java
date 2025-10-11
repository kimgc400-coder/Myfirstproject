/* 기본 생성자(디폴트 생성자) 특징)
 *  1. 기본생성자는 전달인자가 없는 생성자를 말한다. 생성자가 오버로딩이 안된 경우에는 자바 컴파일러가 묵시적인 기본생성자를 제공한다.
 */
class MyDate24{
	private int year;
	private int month;
	private int day;
	
	//기본생성자 묵시적 생략
	
	public void pr() {
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
}

public class ConsEx05 {
	public static void main(String[] args) {

		MyDate24 md = new MyDate24();//new MyDate24();에 의해서 기본생성자 호출
		md.pr();		
	}
}
