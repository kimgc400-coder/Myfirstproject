/*
 * 인터페이스에 오는 모든 변수는 public static final로 인식되는 정적상수만 온다.
 */
interface IColor06{
	int RED=1;//public static final이 생략된 정적상수 RED
	public static final int GREEN = 2;
	int BLUE = 3;
	
	void setColor(int c);//public abstract 가 생략된 추상메서드
	public abstract int getColor();
}

abstract class AbsColor06 implements IColor06{
	int color = GREEN;//추상클래스에는 일반변수가 올수 있다 일반 변수는 color를 말함.

	@Override
	public void setColor(int c) {
		color = c;
	}
}

class SubClass06 extends AbsColor06{//추상클래스를 상속받았기 때문에 자식에게서 구현되어 있지 않아도 부모에서 메서드를 가져올 수 있다.

	@Override
	public int getColor() {
		return color;
	}
}
public class Intex06 {

	public static void main(String[] args) {
		
		SubClass06 sub06 = new SubClass06();
		sub06.setColor(IColor06.RED);
		System.out.println(sub06.getColor());

	}

}
