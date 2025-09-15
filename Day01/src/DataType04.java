/*자바의 실수 숫자 자료형(타입) 종류 :
 *  float -> 크기는 4바이트이고, 저장되는 정밀도는 7자리이다. 값 뒤에 접미사 f/F가 붙는다. 접미사는 생략 불가
 *  double -> 크기는 8바이트이고, 저장되는 정밀도는 15자리이다. 값 뒤에 접미사 d/D가 붙는다. 자바의 기본 실수숫자 타입에 해당된다.
 *  그러므로 접미사는 생략가능하다.
*/
public class DataType04 {

	public static void main(String[] args) {
		
		float a = 10.3f;
		float b = 100.3F;
		double c = 50.3d;
		double d = 100.5d;
		double e = 10.2;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("e = "+e);

	}

}
