package polymorphism3;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 생성");
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 생성");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker,int price) {
		System.out.println("===> SamsungTV(2) 생성");
		this.speaker = speaker;
		this.price = price;
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
