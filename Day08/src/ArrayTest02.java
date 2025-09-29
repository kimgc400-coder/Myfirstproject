/*
 * 2차원 배열 score 배열원소값을 초기화 한 다음 이를 일반 이중 for 반복문을 사용해서 출력함.
 * 그리고 자바 5에서 추가된 향상된 확장 for 반복문을 사용해서 2차원배열 원소값을 1차원 배열로 변환하고 다시 일반변수로 가져와서 누적합을 구함
 */

public class ArrayTest02 {
	public static void main(String[] args) {
		
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};//4행*3열의 총 12개 배열원소값을 저장해서 초기화 한 2차원 배열 score 생성
		
		int sum = 0;//배열원소 누적함
		
		//일반 이중 for 반복문으로 score 2차원 배열 원소값을 출력
		for(int i=0;i<score.length;i++) {//score.length 는 행의 길이를 반환 ->4
			for(int j= 0;j<score[i].length;j++) {
				//score[i].length는 각 행의 열의 길이 3을 반환
				System.out.printf("score[%d][%d] : %d\n",i,j,score[i][j]);
			}
		}//outer for
		
		System.out.println("\n=======================\n");
		
		for(int[]arr:score) {//2차원 배열을 1차원 배열로 변환
			for(int k:arr) {//1차원 배열을 일반 변수로
				sum+= k;//배열원소 누적합을 구하는 것임
				
			}
		}//outer for
		
		System.out.printf("score 배열원소 누적합 = %d \n", sum);

	}

}
