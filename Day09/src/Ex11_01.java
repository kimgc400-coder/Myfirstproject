/*
 * 11장 클래스와 객체. pdf No14 2번 문제
 */


class Product{
	private String name;
	private int price;
	
	
	public void setName(String a) {
		name = a;
	}
	
	
	
	public String getname() {
			return  name;
			
	}
	
	public void setPrice(int a) {
		price = a;
		//void를 사용해도 값을 멤버변수에 대입하는 것이 가능하다.--->이것은 틀린 설명이다.
		//메서드의 기본의미를 생각해야한다.
		//자바에서 메서드의 반환타입을 설정하고 반환타입이 있다는 말은 호출자에게 값을 반환한다는 말이다.->이 말은 메서드의 기능은 작동하고 값을 호출자에게 줄지 말지를 결정한다는 말이다.
		//여기서도 값을 저장하는 기능이 이 setPrice메서드의 기능이다. 값만 반환하지 않는 것이다. 전달받은 값을 price에 저장하는 것이 이 메서드의 기능이기 때문에 멤버변수에 값을 대입시킬수
		//있는 것이다.
		
		
	}
	
	
	
	public int getName() {
		return price;
	}
	
	
	

	
}




public class Ex11_01 {
	public static void main(String[] args) {
		
		Product a = new Product();
		a.setName("커피");
		a.setPrice(150);
		
		

	}

}
