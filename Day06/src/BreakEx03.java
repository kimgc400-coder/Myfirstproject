/*continue
 * 반복문 내에서 continue 문을 만나면 그 아래 문장을 실행하지 않고, 다음 반복을 위해서 반복문 처음으로 돌아가 다음 반복을 계속한다.
 */
public class BreakEx03 {
	public static void main(String[] args) {
		
		//1부터 10까지 반복하는데 4의 배수만 빼고 반복한다.
		for(int i=1;i<=10;i++) {
			if(i%4 == 0) {
				continue;
			}
			System.out.print(" "+ i);
		}
		
		

	}

}
