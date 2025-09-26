
public class BreakEx04 {

	public static void main(String[] args) {
		
		
		
		int i = 1;
		while(true) {
			System.out.print(i+"번째 Java");
			
			if(++i == 10) {
				break;
			}
			
		}
		
		
		System.out.println("\n======================\n");
		
		i=1;
		for(;;) {
			System.out.print(i+"번 oracle!");
			
			if(i++ == 5) {
				
				break;
				
			}
		}
		
		

	}

}
