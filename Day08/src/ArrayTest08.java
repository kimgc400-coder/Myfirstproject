/*
 * 절대값을 반환할때 사용하는 키워드 : return;
 * 리턴 타입이 없는 void형(반환값이 없다.)
 */



public class ArrayTest08 {
	static int abs(int data) {
		if (data < 0) {
			data = -data;// 양의 절대치
		}
		return data;// 메서드를 호출한 곳으로 절대값을 반환
	}// 
	public static void abs2(int data) {
		if (!(data < 0)) {
			System.out.println("음의 정수 숫자만 입력하세요!");
		} else {
			if (data < 0) {
				data = -data;// 양의 절대값
			} // if

			System.out.println("절대값 =" + data);
		} // if else
	}// abs2()
	public static void main(String[] args) {

		int resultData = abs(100);
		System.out.println("-100의 절대값 =" + resultData);

		abs2(-200);

	}

}
