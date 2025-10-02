package 자바평가문제;

public class Java_Exam03 {

	/* 자바 평가문제 3) while 반복문을 사용해서 7단 구구단을 출력되게 해 보자. 또한 같은 반복문을 사용해서 1부터 100까지의 누적합을 
	 * 구하는 자바코드를 만들어 본다.
     */
	
	public static void main(String[] args) {

		//답안 코드 작성
		
		//7단 구구단
		int i=1;
		int dan = 7;
		
		System.out.println(">>>>> "+dan+"단 <<<<<<");
		System.out.println("======================");
		while(i<=9) {
			System.out.printf("%d x %d = %d \n", dan,i,dan*i);
			i++;
		}//while
		
		System.out.println("\n ======================= \n");
		
		//1부터 100 까지 누적합
		int sum = 0;//누적합
		i=1;
		while(i<=100) {
			sum += i;
			i++;
		}//while
		
		System.out.println("1부터 100까지 누적합 = "+sum);
	}
}
