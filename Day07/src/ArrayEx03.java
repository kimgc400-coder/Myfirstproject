/*
 * 1차원 배열원소값 중에서 최대값을 구해본다.
 * 
 */
public class ArrayEx03 {
	public static void main(String[] args) {
		
		double data [] = {10.5,20.5,100.0,95.0,80.0};//배열 크기가 5인 date[]배열을 생성하면서 원소값 초기화
		double max = data[0];//배열 원소 최대값으로 data[] 첫번째 배열 원소값으로 초기화
		
		for (int i = 1; i < data.length ;i++) {
			if(data[i] > max) {//배열 원소값이 최대값보다 크면 실행
				max = data[i];//data[0] = 10.5 니까 [1]번부터 실행하고 2에서 100이니까 max보다 큰게 없다 그래서 if문 종료 하고 마지막 값이 printf에 보이는 것이다.
				System.out.println(max);}
			//if
		//for
	
	}System.out.printf("data[] 배열원소 값 중에서 최대값은 얼마인가? %f \n", max);
	// %f는 10진수 실수 숫자 출력형태 지시자이다. 기본적으로 소수점 이하 6자리 까지만 표현하고, 7자리에서 반올림 한다.

}
}