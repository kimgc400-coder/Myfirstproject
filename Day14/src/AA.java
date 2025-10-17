class Animal{

	protected String kind;
	protected int leg;

	public Animal() {//기본생성자

	}//기본생성자

	public Animal(String kind, int leg) {//오버로딩된 생성자

		this.kind = kind;
		this.leg = leg;

	}//오버로딩된 생성자


}//부모끝

class Dog extends Animal{//개시작

	

	public Dog() {//기본생성자

	}

	public Dog(String Kind, int leg) {//오버로딩 된 생성자

		super.kind = kind;
		super.leg = leg;
	}

	public void getKind(String kind) {

		if(super.kind.equals(kind)) {
			System.out.println(kind);
		}else {System.out.println(kind);}

	}

	public void walk(int a) {
		if (a==2) {
			System.out.println("사람은 2발로 걷는다.");
		}else if(a==4) {
			System.out.println("강아지는 4발로 걷는다.");
		}

	}
}//개 끝 

class Human22 extends Animal{

	public Human22() {//기본생성자

	}

	public Human22(String Kind, int leg) {//오버로딩 된 생성자

		super.kind = kind;
		super.leg = leg;

	}

	public void getKind(String kind) {

		if(super.kind.equals(kind)) {
			System.out.println(kind);
		}else {System.out.println(kind);}

	}

	public void walk(int a) {
		if (a==2) {
			System.out.println("사람은 2발로 걷는다.");
		}else if(a==4) {
			System.out.println("강아지는 4발로 걷는다.");
		}

	}


}
public class AA {

	public static void main(String[] args) {
		
		Animal a = new Animal("사람",2);
		Dog d = new Dog("개",4);
		Human22 h = new Human22("사람",2);



		h.getKind("사람");
		

	}

}
