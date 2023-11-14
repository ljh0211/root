package day12_1114;

public class day12_1114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		public class Test{
			public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Video());
		buyer.buy(new Audio());
	}
}
class Buyer{
	void buy(Product p) {
			System.out.println(p); 
	}
}

class Product { }
class Video extends Product { }
public String toString () {
	return "Video;"

			class Audio extends Product { }
public String toString () {
		return "Audio;"
}
	}

}

	
	

	public class PRAcTICE_03{

	public static void main(String[] args){
	
		Speaker s1 = new RedSpeaker();
	Person p1 = new Person(s1)
	p1.turnOn(); //빨간 스피커가 켜졌습니다

	Speaker s2 = new BlueSpeaker();
	Person p2= new Person(s2)
	p2.turnOn(); //파란 스피커가 켜졌습니다

	//인터페이스 다형성 가능하다
	Fighter f = new Fighter(); //ㅇ ㅢ존하는 클래스를 객체로 생성
	f.move (100,200);
	
	Unit2 f2 = new Fighter();
	//f2.attack(); 사용할수없다 형변환이 다르다
	Fightable f3 = new Fighter();
	f3.attack(new Fighter);
	//f3.x; 자식 클래스로 생성했지만 인터페이스에 대한 형변환만 사용하니까
	Fightable nf = f.getFighterble();//자식 클래스 메서드 부모인터페이스 형변환리턴 출력
	}

	//마이크폰
	interface Microphone(
			abstract void sing ();
			)
	//스피커 
	interface speaker(
			abstract void music();
			)
	//블루투스마이크
	class BlutootMic implements 마이크로폰, 스피커;
	}// 다중인터페이스
	public void sing () {
		 System.ot.println("마이크에 대고 노래를 부릅니다");
	}
	public void music() {
		System.out.println("마이크에 장착된 스피커로 반주가 나옵지다");
	}
	
	//자식클래스 객체 생성 BlutootMic
	 BlutootMic bm = new 	 BlutootMic();
	//객체가 생성되면 음악이 나온다 
	 bm.music();
	 //객체가 생성되면 노래를 부느으아 
	bm.sing ();

	
	
	
	//클래스 unit2 : 추상클래스 abstract 메서드
abstract class Unit2{
	int x,y;
	abstract void move(int x, int y); //추상메서드
	void stop() {System.out.println("멈춥니다");

}
	// 클래스 인터페이스 : Fighterable
	interFace Fightable {
		public void move (int x, int y);// move 추상메서드 
		public void attack(Fightable f); //attack 추상메서드
	}
	
	// 클래스 Fighter : extends unit2( 추상클래스) imsdfkldfsklsdfajkl;fsadjkl;adfsj
	class Fighter extends Unit2 implements Fightable{
		public void move (int x, int y ) {
			System.out.println("{"x","y"}로 이동");
		}
		public void attack(Fighterable f) {
			System.out.println(f+"를 공격 ");
		}
	
		//인테페이스 리턴. 형변환으로 가능하다.
		//Fightable f = new Fighter();
		Fightable getFighterble() {
		//자식이 한마리 구현한다.
			Fighter f = new Fighter ();
			 return f;
		}
		}
		
	class Speaker{
		String getName() {
			return"스피커";
		}
	}

	class RedSpeaker extends Speaker{
	String getName() {
		return"발간";
	}
	}
	
	class BlueSpeaker{
		String getName() {
			return"파란";
	}
	}
	class Person{//사람클래스
		
		//객체변수
		Speaker speaker;

	       //기본생성자
		Person( Speaker speaker){
		this.speaker = speaker;
	}
	      //메서드 : 색깔(클래스: 매개변수 다형성) 스피커가 켜졌습니다 .
		void turnOn(){
		System.out.println(Speaker.getName()+"이 켜졌습니다");
	}
	}
