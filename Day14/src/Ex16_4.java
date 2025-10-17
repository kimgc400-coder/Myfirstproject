/*
 *  16장.상속.pdf No.23 3번 문제)
 *  문제는 강의교안을 참조한다.
 */
class Animal04{
	protected String kind;
	protected int leg;
	
	public Animal04() {}
	
	public Animal04(String kind,int leg) {
		this.kind = kind;
		this.leg = leg;
	}//부모클래스 생성자 오버로딩
	
	public void printKind() {
		if(kind.equals("소녀")) {//String 문자열 내장 클래스의 equals()메서드를 사용하면 객체주소를 비교하지 않고 오로지 문자열 내용값만 비교
			//해서 같으면 참 즉 true를 반환한다.
			System.out.println(kind+"는 사람이다.");
		}
	}
	
	public void walk() {
		if(leg == 2) {
			System.out.println("사람은 "+leg+"발로 걷는다.");
		}
	}
}//부모클래스 Animal04

class Dog04 extends Animal04{
	public Dog04() {}
	
	public Dog04(String kind, int leg) {
		super(kind,leg);//부모클래스 오버로딩 된 생성자를 호출하면서 멤버변수 중 인스턴스 변수 초기화
	}
	
	@Override //오버라이딩 한 메서드
	public void printKind() {		
		if(kind.equals("강아지")) {
		  System.out.println(kind+"는 동물이다");
		}
	}
	
	@Override
	public void walk() {
		if(leg == 4) {
			System.out.println("강아지는 "+leg+"발로 걷는다.");
		}
	}
}//첫번째 자손클래스 Dog04

class Human04 extends Animal04{
	
	public Human04() { }
	
	public Human04(String kind,int leg) {
		super(kind,leg);
	}
}//두번째 자손클래스 Human04

public class Ex16_4 {
	public static void main(String[] args) {
       Dog04 d=new Dog04("강아지",4);
       d.printKind();
       d.walk();
       
       Human04 h=new Human04("소녀",2);
       h.printKind();//상속받아서 호출
       h.walk();//상속받아서 호출
	}
}
