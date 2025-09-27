/*
 * 배열 원소값을 직접 초기화 즉 저장하면서 배열 생성 -> 배열원소값의 총합과 평균을 구한다.
 */
public class ArrayEx02 {
	public static void main(String[] args) {
		
		int[] score = {100,90,100,100,100};//5개의 int 타입 배열원소값을 직접 저장하면서 초기화 함. ->score 배열 생성
		int sum = 0;//배열원소 총합을 저장할 변수 선언과 초기화
		double average = 0.0;//평균을 저장할 변수 선언과 초기화
		
		for(int i = 0; i<score.length;i++) {
			sum += score[i];//배열원소 총합
		}
		
		average = (double)sum/score.length;//double/int는 자동산술법에 의해서 double/double이 된다. 결국 평균은 몫과 나머지를 함께
		//구한다. 자바에서 실수 숫자를 나눗셈 하면 몫과 나머지를 같이 구하고 정수 숫자를 나눈셈 하면 몫만 구하고 나머지는 안 구한다.
		
		System.out.printf("총점=%d\n", sum);
		System.out.printf("평균="+average);
	}

}
//일반 변수는 1개의 값만 저장할 수 있다.
//새로들어온 두번째 값이 있다면 앞의 값은 사라진다.
//그렇다면 while문으로 숫자를 담는게 아니라 담겼고 그걸 프린트하고 다시 다음번 숫자가 들어온걸 출력한 것인가?