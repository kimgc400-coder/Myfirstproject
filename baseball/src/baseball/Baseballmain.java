package baseball;

import java.util.Scanner;

public class Baseballmain {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;

		System.out.println("야구게임을 시작합니다.");
		System.out.print("날아올 공을 선택해 주세요. \n" + a + "번:직구, " + b + "번:커브, " + c + "번:슬라이더\n첫번째 타석을 시작합니다.\n");

		int strikecount = 0;
		int outcount = 0;
		int hitcount = 0;
		int score = 0;

		for (;;) {
			Scanner scan = new Scanner(System.in);
			int kindball = (int) (Math.random() * 3) + 1;

			int choice = Integer.parseInt(scan.nextLine());

			if (kindball == choice) {
				System.out.println("안타입니다.");
				hitcount++;

			} else if (kindball == choice) {
				System.out.println("안타입니다.");
				hitcount++;

			} else if (kindball == choice) {
				System.out.println("안타입니다.");
				hitcount++;

			} else {
				System.out.println("스투~~~~~라잌!!!");
				strikecount++;

			}

			if (kindball == choice) {
				strikecount = 0;
			}

			if (strikecount == 3) {
				outcount++;
				System.out.println(outcount + "아웃입니다\t total :" + " " + outcount);
				if (outcount != 3) {
					System.out.println((outcount + 1) + "타석을 시작합니다.");

				} 

			}

			if (outcount == 3) {
				outcount++;
				System.out.println("쓰리아웃입니다");
				break;
			}

			if (hitcount == 4) {
				hitcount = 0;
				score++;
				System.out.println("스코어는" + score + "입니다.");
			}

		}
	}
}
