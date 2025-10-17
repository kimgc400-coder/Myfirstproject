/* instanceof 형변환 유무 판단 연산자 */

class HandPhone05 extends Object{
	protected String model;//폰모델명
	protected String number;//폰번호
	
	public HandPhone05() { }//기본생성자
	
	public HandPhone05(String model,String number) {
		this.model = model;
		this.number = number;
	}//생성자 오버로딩
}//HandPhone05 부모 클래스

class DicaPhone05 extends HandPhone05{
	protected String pixel;//화소수
	
	public DicaPhone05() {}
	
	public DicaPhone05(String model, String number, String pixel) {
		super(model,number);//부모의 오버로딩 된 생성자 호출
		this.pixel = pixel;
	}
	
	public void prnHandPhone() {
		System.out.println("폰 모델명 : "+model+", 폰 번호 : "+number+", 화소수 : "+pixel);
	}
}//DicaPhone05 class

public class RefCast05 {
	public static void main(String[] args) {

		DicaPhone05 dp = new DicaPhone05("갤럭시","010-9999-9999","1024");
		dp.prnHandPhone();
		
		if(dp instanceof HandPhone05) {//dp는 HandPhone05 부모 타입으로 업캐스팅이 가능한가?true
			HandPhone05 hp=dp;//업스캐스팅
			System.out.println("업캐스팅이 가능합니다.");
		}else {
			System.out.println("업캐스팅이 불가능합니다.");
		}//if else
		
		System.out.println("\n ========================== \n");
		
		HandPhone05 hp = new HandPhone05();//사전에 업캐스팅을 안함
		if(hp instanceof DicaPhone05) {//hp가 다운캐스팅이 가능한가? false(거짓)
			DicaPhone05 dp5=(DicaPhone05)hp;//명시적인 다운캐스팅
			System.out.println("다운캐스팅이 가능합니다.");
		}else {
			System.out.println("사전에 업캐스팅을 안해서 다운캐스팅이 불가능합니다.");
		}
	}
}
