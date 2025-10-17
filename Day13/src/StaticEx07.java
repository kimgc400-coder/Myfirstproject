/*
 *  부모클래스의 인스턴스 변수명과 동일한 변수명이 자손에서 정의된 경우 부모로 부터 상속받은 해당 변수명에 접근할 때는 super.변수명으로 하고, 자손에
 *  정의된 동일 변수명에 접근할 때는 this.변수명을 사용한다.
 */
class Parent07{//extends Object이 생략됨.
	protected int x=10;
	protected int y=20;
}

class Child07 extends Parent07{
    protected int x=40;
    protected int y=50;
    protected int z=30;
    
    public void print() {
    	System.out.println(super.x+"\t"+super.y+"\t"+this.z);//z변수명앞의 this.는 생략가능하다. -> 10 20 30
    	System.out.println(this.x+"\t"+y+"\t"+z);//40 50 30
    }
}

public class StaticEx07 {
	public static void main(String[] args) {

		Child07 ch07=new Child07();
		ch07.print();
	}
}
