/*이중 for반복문 안에서 if~else 조건문을 넣는 실습*/
public class ForEx03 {
	public static void main(String[] args) {
		
		
		int i,j;
		for(i=1; i<=5; i++) {
			for(j=1;j<=5;j++) {
				if(i ==j) {
					System.out.printf("[%d,%d]", i,j);//여기서 다섯자리이다. 쌍따옴표안이
				}else {
					System.out.printf("%5c", ' ');//%5c 출력형태 지시자는 총 5자리 단일문자로 표현하고 오른쪽 정렬을 기본으로 한다.
				}
			}//inner for
			System.out.println();//outer for문이 한번 끝나고 나서 줄바꿈이 일어난다.
		}//outer for
		
		
		
		
		

	}

}
