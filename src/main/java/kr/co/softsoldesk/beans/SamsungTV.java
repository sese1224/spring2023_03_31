package kr.co.softsoldesk.beans;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("samsungtv 객체생성");
	}

	@Override
	public void powerOn() {
		System.out.println("samsungtv 전원켜기");
		
	}

	@Override
	public void powerOff() {
		System.out.println("samsungtv 전원닫기");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("==> samsungtv볼륨업");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("==> samsungtv볼륨다운");
		
	}
	
}
