/*배열이란? 동일한 타입(자료형)의 하나 이상의 복수개의 원소값을 고정된 크기로 한꺼번에 저장하기 위해서 사용하는 자료형을 말한다.
 * 첫번째 배열생성법)
 * new 키워드를 사용한다.
 * 타입[] 배열명 = new 타입[배열크기];
 */
public class ArrayEx01 {
	public static void main(String[] args) {
		
		int[] score = new int[5];//배열크기가 5인 int 타입 배열 score 생성
		score[0] = 100;//첫번째 배열원소값 저장. 배열 주소 인덱스 번호는 0부터 시작한다.
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		score[4] = 60;
		
		System.out.printf("배열 원소 개수(배열크기) = %d \n", score.length);//score.length인 배열명.length는 배열크기 즉 배열원소개수를 반환한다.
																 	 //배열크기는 1부터 카운터 한다.
		
		System.out.println("\n score 5개의 배열원소값 출력");
		//일반 for 반복문을 사용해서 score 배열 원소값을 읽어온다.
		for(int i=0;i<score.length;i++) {//반복문 제어변수 i값을 0부터 시작한 이유는 해당 배열주소 인덱스 번호가 0부터 시작하기 때문이다.
										 //조건식에서 i<score.length에서 '작다'연산을 사용한 이유는 배열주소 인덱스 번호는 0부터 시작하고 score.length에 반환되는
										 //배열크기는 1부터 카운트해서 5로 반환되어서 마지막 배열주소 인덱스번호가 4로 끝나기 때문이다.
			
			System.out.printf("score[%d] : %d\n", i,score[i]);
			
		}
		
	}

}
