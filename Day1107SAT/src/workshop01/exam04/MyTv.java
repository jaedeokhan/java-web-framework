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
		// ������ ä���� ��� ������ ���� �� �ֳ�?
		// channel ���� ä��
		// prevChannel ���� ä��
		// ���� ä���� ���� ä�η� �����Ѵ�.
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
