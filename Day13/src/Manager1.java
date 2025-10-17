/*
 * 비봉인 자손 클래스 manager1로 정의했기 때문에 또 다른 자손 클래스 생성이 가능하다.
 */
public non-sealed class Manager1 extends Person {

	@Override
	public void work() {
		
		System.out.println("생산 관리를 합니다.");
		
	}

}
