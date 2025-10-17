/* 상속에서 부모클래스의 생성자가 오버로딩 되면 기본생성자가 묵시적으로 제공되지 않아서 자손에서 부모의 기본생성자를 호출할려다가 에러가 난다. 이를 방지
 * 하는 합리적 방법)
 *  1. 부모의 기본생성자 명시적 코드를 한다.
 *  2. 자손에서 부모의 오버로딩 된 생성자를 호출한다.
 */
class Parent10{
	protected int a=100;
	protected int b=200;
	
	/*public Parent10(){ } //기본 생성자 명시적 코드 
	 */
	
	public Parent10(int a,int b) {
		this.a=a;
		this.b=b;
	}//부모의 오버로딩 된 생성자
}

class Child10 extends Parent10{
	protected int c=300;
	
	public Child10() {
		super(1000,2000);//부모의 오버로딩 된 생성자 호출
	}
	
	public Child10(int a,int b,int c) {
		super(a,b);
		this.c=c;
	}//전달인자 개수가 다른 생성자 오버로딩
	
	public void print() {
		System.out.println("a="+a+"\t b="+b+"\t c="+c);
	}
}

public class ExtendsEx10 {
	public static void main(String[] args) {
       Child10 child01=new Child10();
       child01.print();//1000 2000 300
       
       Child10 child02=new Child10(10,20,30);//자손의 전달인자 3개짜리 오버로딩 된 생성자를 호출
       child02.print();//10 20 30
	}
}
