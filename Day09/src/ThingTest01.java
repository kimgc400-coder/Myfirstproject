/* 11장.클래스와 객체.pdf No.13 1번 문제)
 * 
 * 다음은 하나의속성(변수 x)을 갖는 Thing10 클래스입니다. 다음 예제에서 문제점을 발견하고 이를 수정해봅시다. 가장 올바른 자바 oop코드로 변경해야
합니다.

 class Thing10{
  private int x;
 } 
public class ThingTest01 {
 public static void main(String[] args) { 
   Thing10 thing01; 
   thing01=new Thing10();
   thing01.x=10; 
   System.out.println(thing1.x);
 } 
}
 */
class Thing10{
	private int x;//x속성(멤버변수)은 private 접근 권한 제어자로 선언되어 있어서 Thing10 클래스 외부에서 접근 못함
	
	//변경 추가 코드
    public void setX(int new_x) {
    	x = new_x;
    }//setter() 값 저장 메서드
    
    public int getX() {
    	return x;
    }//getter() 값 반환 메서드
}

public class ThingTest01 {
	public static void main(String[] args) {
      Thing10 thing01; //객체주소가 저장 안된 참조변수
      thing01 = new Thing10();//객체주소가 저장 된 참조변수 thing01->객체명
      //thing01.x=10;
      //변경 추가코드
      thing01.setX(10);
      System.out.println(thing01.getX());
	}
}
