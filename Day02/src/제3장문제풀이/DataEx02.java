package 제3장문제풀이;

/* 03장.자료형.pdf No.32 2번문제 */
public class DataEx02 {
	public static void main(String[] args) {
 
		byte var01 = 128; //A -> byte 형 최대값 범위를 벗어나서 오류가 발생
		short var02 = 128; //B
		int var03 = 28L; //C -> int타입 값뒤에는 접미사 L이 붙지 않는다.
		long var04 = 28L; //D
		float var05 = 123456.789123; //E -> float타입 실수숫자값뒤에는 접미사 f or F가 붙는다.
		double var06 = 123456.789123; //F
		
		//정답은 A,C,E
	}
}
