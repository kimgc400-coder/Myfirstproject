/*
 *  12장.메서드 살피기.pdf No.20 2번 문제) 문제는 강의교안을 참조한다.
 */
class Mp3{
	private String comp;//회사명
	private int size;//메모리 용량
	
	public String getComp() {//값반환 getter() 메서드
		return comp;
	}
	
	public void setComp(String new_comp) {//값 저장 setter() 메서드
		comp = new_comp;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int new_size) {
		size = new_size;
	}
}//Mp3 class

public class Ex12_02 {
	public static void main(String[] args) {

		Mp3 mp=new Mp3();
		mp.setComp("갑을회사"); mp.setSize(8);
		System.out.println("회사명 : " + mp.getComp());
		System.out.println("메모리 용량 : "+ mp.getSize() +"G");
	}
}
