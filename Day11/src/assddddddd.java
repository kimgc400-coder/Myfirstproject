class Number{
	
	public static int plus(int a, int b) {
		
		int sum = a + b;
		System.out.println(sum);
		return sum; 
	}
	
	
	public static int min(int a, int b) {
		
		int minus = a - b;
		System.out.println(minus);
		return minus;
	}
	
	
	public static int ast(int a, int b) {
		
		int ast = a * b;
		System.out.println(ast);
		return ast;
		
	}
	
	
	public static int hund(int a, int b) {
		
		int hd = a/b;
		System.out.println(hd);
		return hd;
	}
	
	
	public static int wife(int a , int b) {
		
		int wf = a%b;
		System.out.println(wf);
		return wf;
		
	}
	
	
} 

public class assddddddd {

	public static void main(String[] args) {
		//인트 타입 메서드
		
		Number num = new Number();
		
	
		
		
		num.plus(7,3);
		num.min(7,3);
		num.ast(7,3);
		num.hund(7,3);
		num.wife(7,3);
		
		
		
		
		
		
		
		

		
	}

}
