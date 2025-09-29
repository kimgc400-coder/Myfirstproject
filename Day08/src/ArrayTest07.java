/*
 * return 값;
 * 원래 메서드는 호출한 곳으로 return키워드에 의해서 값을 반환한다.
 */



public class ArrayTest07 {
	
	static int getTotal(int count) {// get접두어로 시작하는 메서드는 일반적으로 값을 반환한다.
		int sum = 0;

		for (int i = 1; i <= count; i++) {
			sum += i;
		}
		
		return sum;

	}
	
	public static void main(String[] args) {
		int resultTotal = getTotal(8);
		System.out.println("1부터 8까지의 누적합 =" + resultTotal);
	}

}
