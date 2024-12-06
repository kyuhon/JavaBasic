package kr.co.khedu.dice;

public class DiceTest {

	public static void main(String[] args) {

		Dice dice1 = new Dice(0);
		Dice dice2 = new Dice(0);
		int i = 0;
		for(;true;) {
			i++;
			dice1.roll();
			dice2.roll();
			System.out.print(dice1.getFace()+" ");
			System.out.println(dice2.getFace());
			if(dice1.getFace() == 1 && dice2.getFace() == 1 ) {
				System.out.println(""+i+"번째입니다");
				break;
			}
		}
	}

}
