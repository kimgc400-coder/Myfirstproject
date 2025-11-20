import net.daum.model01.ShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

public class AbsEx05 {
	public static void main(String[] args) {

		Circ c=new Circ();
		Rect r=new Rect();
		Tria t=new Tria();
		
		c.draw();//오버라이딩 한 메서드 호출
		r.draw();
		t.draw();
		
		System.out.println("\n======================>\n");
		
		ShapeClass ref;//부모 추상클래스 타입으로 참조변수 선언 -> 객체주소가 저장 안된 참조변수
		
		ref = new Circ();//업캐스팅
		ref.draw();//업캐스팅 이후 오버라이딩 한 메서드 호출
		
		ref = new Rect();//업캐스팅
		ref.draw();
		
		ref = new Tria();
		ref.draw();
		
		System.out.println("\n ========================= \n");
		
		ShapeClass[] arr = new ShapeClass[3];//배열 크기가 3인 arr 객체 배열 생성
		arr[0] = new Circ();//업캐스팅
		arr[1] = new Rect();
		arr[2] = new Tria();
		
		for(int i=0;i<arr.length;i++) {
			arr[i].draw();//업캐스팅 이후 오버라이딩 한 메서드 호출
		}
		System.out.println("\n ======================== \n");
		
		/* 문제) 자바 5에서 추가돤 향상된 확장 for 반복문을 사용해서 배열값을 읽어온 다음 오버라이딩 한 메서드를 호출 해 보자. 
		 */
		for(ShapeClass sh:arr) {
			sh.draw();
		}
	}
}







