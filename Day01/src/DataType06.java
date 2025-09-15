/*큰 따옴표로 묶여진 "문자열"값은 자바 기본타입 8개에 포함 안된 레퍼런스 참조타입에 해당한다. 즉 내장 api string 클래스이다.
 * String은 문자열을 다룬다.
 */
public class DataType06 {

	public static void main(String[] args) {
		
		String cityName = "대전시";
		System.out.println("도시 이름 : " + cityName);
		
		String name = "홍길동";
		System.out.println("이름 : "+ name);
		
		String nickName = "호랑이선생님";
		System.out.println("닉네임 : "+nickName);
		
	    String addr = "서울시 강남구 테헤란로";
	    System.out.println("주소 : "+addr);
	    
	    String email = "hong@gmail.com";
	    System.out.println("멜주소 : "+ email);

	}

}
