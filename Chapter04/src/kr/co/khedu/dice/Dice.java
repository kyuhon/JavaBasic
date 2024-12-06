package kr.co.khedu.dice;

public class Dice {

		private int face;

		public Dice(int face) {
			super();
			this.face = face;
		}

		public int getFace() {
			return face;
		}

		public void setFace(int face) {
			this.face = face;
		}

		@Override
		public String toString() {
			return "Dice [face=" + face + "]";
		}
		
		public void roll() {
			face = (int)(Math.random()*6)+1;
		}
}
