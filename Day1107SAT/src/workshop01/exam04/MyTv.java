package workshop01.exam04;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int prevChannel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void gotoPrevChannel() {
		// 이전에 채널을 어떻게 가지고 있을 수 있나?
		// channel 현재 채널
		// prevChannel 이전 채널
		// 현재 채널을 이전 채널로 변경한다.
		setChannel(prevChannel);
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		prevChannel = this.channel;
		this.channel = channel;
	}

}
