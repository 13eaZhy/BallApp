package balls;

public class PingBall extends BallBase{
	
	public void setVolume( float volume){
		if ( volume >= 0.1 && volume <= 0.15 ){
//		 this.volume = volume;
		 super.setVolume(volume);
		} else {
			System.err.println("Danger!! The ball will crack!");
		}
	}
	
	public String toString(){
		return super.toString() + "\t=== PINGBALL ===\n";
	}
}
