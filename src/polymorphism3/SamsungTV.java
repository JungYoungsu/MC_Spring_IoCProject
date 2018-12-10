package polymorphism3;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	
	public SamsungTV() {
		speaker = new SonySpeaker();
		System.out.println("===> SamsungTV ����");
	}
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
