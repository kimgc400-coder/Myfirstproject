/*
 * 반복문 내에서 break문을 만나면 해당 문을 중단(종료)한다.
 */
public class BreakEx01 {

	public static void main(String[] args) {
		
		
		int i;
		
	//1부터 10까지 반고
		
		for(i=1;i<=10;i++) {
			System.out.print(" "+i);
		}
		System.out.println("\n========================\n");
		
		
		//4의 배수일 때 중다.ㄴ
		for(i=1;i<=10;i++) {
			if(i%4 == 0) {
				break;
			}
			
		}
		System.out.print(" "+i);

	}

}
