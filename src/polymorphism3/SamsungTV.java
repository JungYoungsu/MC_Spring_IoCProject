package polymorphism3;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	
	public SamsungTV() {
		speaker = new SonySpeaker();
		System.out.println("===> SamsungTV 생성");
	}
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
