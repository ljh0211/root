package day1117;

public class homi {
//method 1 use1
	public void use1() {//객체 대입 변수를 이용 >  익명 자식 객체를 만든다
	//티비를 켭니다 > 익명 자식 객체를 통해서 메서드: turnOn();
		//티비를 끕니다 > 익명 자식객체 메서드 ㅣturnOff();
		
	}
	//method 2 use2
	public void use2() {
		//자체 변수를 만들어서 익명객체를 선안한다
		RemoteControl rc = new RemoteControl{
			@override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("에어컨을 켭니다");
			}
			
			@override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("에어컨을 끕니다");
			}
		};
		
		//에어컨을 켭니다
		
		//에어컨을 끕니다
		
		//객체변수를 호출
		rc.turnOn();
		rc.turnOn();
	}
}

interface RemoteControl{
	void turnOn(); //끈다
	void turnOff(); //켠다
}