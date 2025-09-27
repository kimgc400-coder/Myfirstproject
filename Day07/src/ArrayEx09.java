/*배열원소 최대값과 최소값 구하기*/
public class ArrayEx09 {
	public static void main(String[] args) {

		int[] score = {100, 90, 80, 99, 98};

		int max = score[0];//첫번째 배열 원소값을 최대값으로 초기화
		int min = score[0];//첫번째 배열원소값을 최소값으로 초기화

		/*
		 * 배열의 최대값, 최소값을 구하는 나머지 자바코드를 완성한다.
		 */
		for(int i = 1; i< score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}	
		}//for end
		System.out.println(max);


		for (int o =1;o< score.length;o++){
			if(score[o]<min) {
				min = score[o];
			}
		}//for end

		System.out.println(min);



	}
	
}


