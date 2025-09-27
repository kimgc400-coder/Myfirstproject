/*
 * 배열 주소 인덱스 번호 범위를 벗어나서 발생하는 예외 오류 ArrayIndexOutOfBoundsException에 관한 소스예
 */
public class ArrayEx05 {
	public static void main(String[] args) {
		
		int[] score = new int[5];
		int k =1;
		
		score[0] = 100;
		score[1] = 90;
		score[k+1] = 95;
		score[3] = 99;
		score[4] = 100;
		
		int tmp = score[k+2]+score[4];
		System.out.printf("tmp = %d \n", tmp);
		
		//일반 for 반복문으로 score 일차원 배열원소 값 일괄적으로 출력
		for(int i = 0; i<score.length;i++) {
			System.out.printf("score[%d] : %d \n", i, score[i]);
			
		}
		
		System.out.printf("score[%d] : %d \n", 7, score[7]);

	}

}
