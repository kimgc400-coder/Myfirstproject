/* 
 * 16장 상속.pdf No.26 4번 문제 (과제물)
 *  강의 교안의 문제와 UML 클래스 다이어 그램을 보고 클래스 설계 코드를 해보자. 
 */

class HandPhone { //extends Object 이 생략됨
	 protected String model;//폰모델
	 protected String number;//폰번호
	 
	 public HandPhone() {}//전달인자(매개변수)가 없는 기본 생성자
	 
	 public HandPhone(String model, String number) {
		 this.model = model;
		 this.number = number;
	 }//전달인자 개수가 다른 생성자 오버로딩
	 
	 public String getModel() {//값 반환 메서드 -> getter() 메서드
		return model;
	 }
	 
	 public String getNumber() {
		 return number;
	 }
}//HandPhone 부모 클래스

class DicaPhone extends HandPhone{
	protected String pixel;//화소수
	
	public DicaPhone() { }
	
	public DicaPhone(String model, String number,String pixel) {
		super(model, number);//부모클래스 전달인자 2개짜리 오버로딩 된 생성자를 호출
		this.pixel = pixel;
	}
	
	public void prnDicaPhone() {
		System.out.println("모델명 : "+model+", 폰번호 : "+number+", 화소수 : "+pixel);
	}//사용자 정의 메서드
}//DicaPhone 자손 클래스

public class Ex16_5 {
	public static void main(String[] args) {
        DicaPhone dp = new DicaPhone("아이폰","010-7777-7777","2560");
        dp.prnDicaPhone();
	}
}
