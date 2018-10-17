package balls;

public class BallBase {
	
	float volume = 2f; // L
	
	public void jump (int height){
		System.out.println("JUMPING TO " +  height + " m ");
	}
	
	public float getVolume(){
		return volume;
	}
	
	public void setVolume( float volume){
		this.volume = volume;
	}
	
	public String toString(){
		return "*** BALL *** \n"
				+ "VOL: " + volume + "L\n";
	}
	
}
