package ch06.sec14;

public class Car {

		//필드선언
		private int speed;
		private boolean stop;
		
		
//		getter
		public int getSpeed() {
			return speed;
		}
//		setter
		public void setSpeed(int speed) {
			if( speed < 0 ) {
				this.speed = 0;
				return;
			}else {
				this.speed = speed;
			}
			}
		
		public boolean isStop() {
				return stop;
		
		}
			public void setStop(boolean stop) {
				this.stop = stop;
				if(stop == true) this.speed = 0;
			}

		
}
