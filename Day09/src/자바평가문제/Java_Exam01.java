package 자바평가문제;

public class Java_Exam01 {
	/* 자바평가문제 1) 이중 for반복문을 사용하여 다음과 같은 출력 결과물이 나오는 코드를 작성해 본다.
	 * 출력예) # # #
	 *       # # #
	 *       # # #
	 */
	public static void main(String[] args) {

		//답안코드 작성
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(" #");
			}//inner for
			System.out.println();//줄바꿈
		}//outer for
	}
}
