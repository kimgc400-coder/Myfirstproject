/*
 * do~while 반복문 형식
 * do{
 * 조건식이 참일동안 만 반복실행;
 * 증감식;
 * }while(조건식);
 * 나중에 조건식을 검사하기 때문에 조건식이 거짓이라도 무조건 한 번은 반복실행한다는 단점이 있다.
 * 
 * 
 *
 */
//dowhile 과 while의 비교
public class LoopEx11 {

	public static void main(String[] args) {
		
		int i = 0;
		do {
			System.out.println(i);
			i++;
			
		}while(i<0);//나중에 조건을 검사해서 거짓이라도 한번은 반복 수행
		
		i=0;
		while(i<0) {//먼저 조건을 검사하기 때문에 거짓이면 반복 수행하지 않는다.
			System.out.println(i);
			i++;
			
		}

	}

}
