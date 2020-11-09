package workshop01.exam04;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTv tv = new MyTv();
		tv.setChannel(10);
		System.out.println("CH : " + tv.getChannel());
		tv.setChannel(20);
		System.out.println("CH : " + tv.getChannel());
		tv.gotoPrevChannel();
		System.out.println("CH : " + tv.getChannel());
		tv.gotoPrevChannel();
		System.out.println("CH : " + tv.getChannel());
	
	
		
	}

}
