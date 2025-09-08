package baseball;

public class Gr86 implements Car,Engine{
	
	private String engine;
	private int speed;
	
	public Gr86(String engine) {
		this.engine= engine;
		
	}
	

	@Override
	public String getEngine() {
		return this.engine;
	}


	@Override
	public void start() {
		if(engine == getEngine()) {
			System.out.println("시동이 켜졌습니다. 운행을 시작해주세요.");
		}
	}

	@Override
	public void acc() {
		if(engine == getEngine())
		speed+=10;
		System.out.println("현재속도는 : "+this.speed);
	}

	@Override
	public void Break() {
		if(engine == getEngine())
		speed-=10;
		System.out.println("현재속도는 : "+this.speed);
	}

	@Override
	public void end() {
		if(speed == 0) {
			System.out.println("시동이 꺼집니다.");
		}
		
	}
	
	
	
	
	


}
