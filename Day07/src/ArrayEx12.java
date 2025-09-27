/*
 * String 문자열 배열에 관한 소스)
 */
public class ArrayEx12 {
	public static void main(String[] args) {
		
		String[] names = {"kim","park","yi"};
		
		//일반 for 반복문으로 names[] 문자열 배열원소값 출력
		for(int i = 0; i<names.length;i++) {
			System.out.println("names["+i+"] :"+names[i]);
		}
		System.out.println("\n======================================\n");
		
		//향상된 학장 for 반복문으로 names배열원소값 출력
		for(String name: names) {
			System.out.print(" "+ name);
		}
		
		System.out.println("\n============================================\n");
		
		String tmp = names[2];
		System.out.printf("tmp = %s \n", tmp);
		
		names[0] = "Choe";//첫번째 배열 원소값 수정 변경
		
		for(String editName:names) {
			System.out.println(editName+"\t");//\t는 탭키만큼 수평으로 띄움
		}

	}

}
