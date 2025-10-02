/* 클래스와 객체 지향에 관한 소스 => 객체 지향 프로그래밍(OOP) 
 */

class Animal02{//class 키워드로 Animal02 클래스명 정의
	String name;
	int age; //클래스 소속의 속성 2개인 name,age 정의. 이 속성을 클래스 소속 멤버변수라고 한다. 멤버변수 중 객체 생성해서 접근하는 인스턴스 변수
}//Animal02 class

class Thing{
	
	int x;//x속성 정의
	
}//Thing class

public class ObjectEx02 {
	public static void main(String[] args) {

		Animal02 a;//객체 주소가 저장 안된 참조변수
		a=new Animal02();//new 키워드로 새로운 객체를 생성하면 객체 주소가 저장 된 참조변수 a -> 객체명
		
		a.name = "홍길동";//객체명.속성으로 접근
		a.age = 26;
		
		System.out.println("이름 : "+a.name+",나이 : "+a.age);
		
		/* 11장.클래스와 객체.pdf No.10의 1번 문제)
		 *  b객체를 하나 더 생성하여 b로 접근하도록 하고 이름은 펭귄, 나이는 12를 저장한 후 출력하는 자바 코드를 만들어 보자.
		 */
		Animal02 b;
		b = new Animal02();
		
		b.name = "펭귄";
		b.age = 12;
		System.out.println("이름 : "+b.name+", 나이 : "+b.age);
		
		/* 11장.클래스와 객체.pdf No.10의 2번 문제)
		 * 하나의 속성(int형 변수 x)을 갖는 Thing 클래스 설계한 후,객체 thing을 생성한 후 속성x에 값10을 지정한 후,속성 x의 값을 출력해 봅시다.
		 */
		
		Thing thing = new Thing();//thing객체 생성
		thing.x = 10;
		System.out.println("thing.x = "+ thing.x);
	}
}
