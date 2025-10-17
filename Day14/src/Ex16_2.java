/* 16장.상속.pdf No.20 1번문제(과제물))
 * 강의 교안 소스중에서 접근 권한이 잘못된 번호를 기술하고 보다 더 합리적인 자바 OOP로 변경해 보자(불필요한 코드 제거).
 */
class Parent02{//extends Object이 생략됨.
	
   private int a;
           int b;
   protected int c;           
   public int d;
}

class Child02 extends Parent02{
	public Child02(int a,int b,int c,int d) {
		this.a=a; //[1] 정답: 부모 Parent02에서 private으로 정의된 멤버변수 a는 같은 패키지의 자손클래스에서 못가져온다.
		this.b=b; //[2]
		this.c=c; //[3]
		this.d=d; //[4]
	}//전달인자 개수가 다른 생성자 오버로딩
	
	public void pr() {
		System.out.println(a); //[5] 정답 -> 부모클래스에서 private으로 정의된 인스턴스 변수 a는 같은 패키지의 다른 클래스 즉 자손에서
		//접근 못함.
		System.out.println(this.b);//[6] this.은 생략가능
		System.out.println(c);//[7]
		System.out.println(d);//[8]
	}//pr()사용자 정의 메서드
}//자손클래스 Child02

public class Ex16_2 {
   	public static void main(String[] args) {
       Child02 one = new Child02(100,200,300,400);//전달인자 4개짜리 오버로딩 된 생성자를 호출
       one.pr();
	}
}



