/*배열 총합과 평균을 구하는 예제 소스
 * 
 */

public class ArrayEx08 {
	public static void main(String[] args) {
		
		int sum = 0;//배열 원소 누적합
		double average = 0.0;//평균
		
		int[] javaScore = {100, 88, 100, 100, 90};
		
		/*
		 * 문제) 자바 5(jdk1.5)버전에서 추가된 향상된 확장 for 반복문을 사용해서 자바 점수 총합을 구하고 원소값도 출력해 본다.
		 * 그리고 sum을 (double)타입으로 캐스팅해서 평균도 구해보자.
		 */
		
		for(int i : javaScore) {
			sum += i;//배열원소값은 읽기만 하고 배열변수에는 저장하지는 못한다 BUT 일반 정수변수에는 값을 저장할 수 있다. 
			System.out.print(" "+i);
		}
		
		System.out.println("\n==================================\n");
		average = sum/javaScore.length;
		System.out.printf("자바 점수 총합 = %d \n", sum);
		System.out.println("자바 평균 = "+average);
		
		
	
	}

}
