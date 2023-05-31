package week3.day3;

public class Samsung extends AndroidTV  {


	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("play video");
		
	}
	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.openApp();
		s.playVideo();
		//s.listen();
		
	}

	/*public void listen() {
		// TODO Auto-generated method stub
		System.out.println("listen music");
		
	}*/

}
