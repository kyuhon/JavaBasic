package kr.co.kh.bomb;

public class BombMain {

	public static void main(String[] args) {
	/*	Bomb[] bombArray = new Bomb[] {new Car(10), new Building(100), new Tree(2), new House(20)};
		
		for(int i=0;i<bombArray.length;i++) {
			bombArray[i].bombBlast();
		}*/
		
		//부, 자 관계
		Bomb bom = null;				//부모객체참조변수
		Car car = new Car(10);	//자식객체참조변수 = 자식객체
		bom = car;				//부=(자동:업캐스팅)자
		bom.bombBlast();
		
		//자, 부 관계(호환되는 관계)
		Car car2 = null;		//자식객체참조변수
		//car2 = bom; <- 자식객체로 확장시켜야한다
		car2 =(Car)bom;
		
		//자, 부 관계(안되는 관계)
		Car car3 = null;		//자식객체참조변수
		//car3 = new bomb(10); 안됨
		car3 = (Car)(new Bomb(10));
		car3.bombBlast();
		
	}

}
