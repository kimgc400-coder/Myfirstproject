/*
 * 가변배열(레그드배열, 레기드 배열)이란?
 * 2차원 이상의 다차원 배열을 생성할 때 행의 길이는 고정시키고 각 행의 열의 길이는 지정하지 않고 나중에 각각 각행의 열의 길이를 가변적으로 설정해서
 * 배열을 생성함으로써 고정된 형태의 배열이 아닌 각 행의 길이가 유동적인 배열을 말한다.
 * 
 * 가변 배열 생성형식
 * int[][] score = new int[5][];-> 행의 길이는 5로 고정 시키고, 각 행의 열의 길이는 지정하지 않고 나중에 가변적으로 설정한다.
 */
public class ArrayTest03 {
	public static void main(String[] args) {
		
		
		final int MAX_ROWS = 5;//파이널로 선언된 변수는 수정할 수 없는 변수 즉 상수라고 한다.->(내가 그냥 커서 가져다 놓고 여기서 바꾸는건
		                       //되지만 아래에서 변수의 값을 변경하는 것은 안된다는 말인가?)
		                       //반드시 최초값을 저장하는 초기화 과정을 해야한다.
		
		int[][] ragged = new int[MAX_ROWS+1][];//행의 길이를 6으로 고정시키고 각 행의 열의 길이는 지정하지 않은 가변 배열 ragged생성
		System.out.println(ragged);
		for(int r=0;r<=MAX_ROWS;r++) {
			ragged[r] = new int[r+1];//각 행의 열이 길이(크기)를 구함(첫번쨰 행의 열의 길이는 1, 6번째 행의 열의 길이는 6) 
			                         //-->ragged[][] 이렇게 선어된건데 왜 for 아래에서는 ragged[r]이렇게 쓰는 경우는 무엇인가?뒤에 []를 없애도 되는건가?
			                         //여기는 일단 행을 만들어주는 것이다. new 뒤에 [r+1]로 쓰는 것은 for문 안에서 int r을 새로 0이라고 변수 초기화를 해주었기 때문에 
			                         //int[][] ragged의 행과 맞춰주는 것이다.
			System.out.println(ragged);
		}//for
		
		
		
		//일반 이중 for반복문으로 가변배열 원소값 초기화
		for(int r=0;r<ragged.length;r++) {//ragged.length는 행의 길이 6을 반환
			for(int c=0;c<ragged[r].length;c++) {//ragged.length는 각 행의 열의 길이를 반환
				ragged[r][c]=c;           //여기는 열을 만들어주는 곳이다.
			}
			
		}//for
		
		//이중 for 반복문으로 가변 배열원소값 출력
		for(int r=0; r<ragged.length;r++) {
			for(int c = 0; c<ragged[r].length;c++) {
				System.out.print(" "+ragged[r][c]);
			}//inner for
			System.out.println();//줄바꿈
		}
		
		

	}

}
