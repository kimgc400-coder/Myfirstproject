/*
 * sealed 키워드로 봉인된 인터페이스 InterfaceA 정의 -> permits 키워드 다음에 오는 InterfaceB 만 자손 인터페이스로 정의 가능하다.
 */
public sealed interface InterfaceA permits InterfaceB {

	void methodA();//public abstract 이 생략된 추상메서드
}
