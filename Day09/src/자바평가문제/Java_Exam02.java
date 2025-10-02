package 자바평가문제;

public class Java_Exam02 {
    /* 자바 평가문제 2) for 반복문을 이용해서 1부터 10까지의 자연수 중에서 4의 배수를 뺀
     *  총합을 구하는 코드를 작성해 본다. 
     */
	public static void main(String[] args) {

		//답안코드 작성
		int sum = 0;//4의 배수를 뺀 누적합을 저장할 변수
		
		for(int i=1;i<=10;i++) {
			if(i % 4 == 0) {
				continue; //4의 배수일 때 아래문장 실행 안함.
			}
			sum += i;
		}//for
		
		System.out.println("4의 배수를 뺀 누적합 = "+sum);
		
		sum = 0;
		
		for(int i=1;i<=10;i++) {
			if(!(i % 4 == 0)) {//4의 배수가 아닐 때 실행
				sum += i;
			}//if
		}//for
		
		System.out.printf("4의 배수를 뺀 누적합 = %d \n", sum);
	}
}
