/*
 * for 반복문을 활용한 7단 구하기와 1부터 100까지의 누적합
 */
public class LoopEx09 {

	public static void main(String[] args) {
		
		int i;
		int guguDan=7;
		
		System.out.println("<<==========" + guguDan + "단 ==========>");
		for(i=1; i<=9;i++){
			System.out.printf("%d * %d = %d \n", guguDan,i,guguDan*i);
			
		}
		System.out.println("\n=========================================\n");
		
		int sum = 0;
		
		for(i=1; i<=100;i++) {
			sum = sum +i;
		}
		System.out.println("1부터 100까지 누적합 ="+sum );
	}

}
