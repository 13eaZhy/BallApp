package main;

//import balls.BasketBall;
//import balls.FootBall;
import balls.*;

public class BallApp {

	public static void main(String[] args) {
		FootBall foot= new FootBall ();
		BasketBall basket = new BasketBall();
		PingBall ping = new PingBall();
		RugbyBall rugby = new RugbyBall();
		
		foot.setVolume(10);
		foot.jump(30);
		basket.setVolume(12);
		ping.setVolume(0.1f);
		rugby.setVolume(2);
		
		
//		System.out.println( foot   );
//		System.out.println( basket );
//		System.out.println( ping   );
//		System.out.println( rugby  );
		System.out.println( foot.toString() + basket + ping + rugby   );

	}

}
