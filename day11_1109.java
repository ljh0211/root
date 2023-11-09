package day11;



public class day11_1109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 클래스의 강제 타입 변환
		
		
		//자식 클래스 < 부모클래스 : 자동형변환 -> 부모를 맞추다 보니 손실난다
		//강제차입 타입 : 내타입 (자식형)
		FireEngine f = new FireEngine();// 자식객체
		Car c = new Car();
		Car c2 = f;
		Car c_ = null; //부모형타입 객체는 생성하지 않았다.
		
		c_ = f; //부모의 형 타입이고 자식의 객체를 생성한 경우
		f = (FireEngine)c_; //자식의 객체로 형변환
		f.drive();
		f.water();
		
		//@매개변수(함수): 클래스- 객체를 생성할때
		buyer b = new buyer(); //바이어 객체 생성
		//제품의 객체를 생성해서 객체를 넘겨준다
		audio a = new audio(100);
		Computer com = new Computer(200);
		Tv tv =  new Tv(100);
		//바이어가 컴퓨터를 산다
		b.buy(com);
		//바이어가 티비를 산다
		b.buy(tv);
		//바이어의 현재 남은돈을 출력한다
		System.out.println("현재 남은 돈은 " + b.money+"입니다");
		
		
		//추상클래스 abatract
		//레시피 추상클래스
		//Receipt cp =  new Receipt("백종원");//
		//파스타 레시피 (자손)
		PastaReceipt pr = new PastaReceipt("백종원");// 추상 클래스를 의존하는 자식 클래스 객체 생성
		// 자식 객체를 통해 추상 클래스의 매서드도 호출할수 잇따
		pr.info();// 자식 객체[를 통해 추상 클래스의 인스턴스메서드로 호출할수잇따
		pr.makeSource();// 자식 객체의 인스턴스 매서르 호출
		pr.cookingPlay();// 자식 객체에서 추상 메소드도 호출한다 인스턴스 메서드랑 다르게 추상메서드는 강제로 오버람ㄴㅇ러ㅏㅣㄹ어나ㅣㅁㄴㅇ러ㅏ;ㅇㄻ너ㅏㅁㄴㅇ러ㅏㅣ;
		//스테이크 레시피 (자손)

		//추상클래스 문제 2 : 플레이어를 활용한 추상클래스
		AudioPlayer p = new AudioPlayer();
		p.play(10); //
		p.stop(); //멈춘다 
	}

}
//추상클래스 : player
abstract class Player {
	//추상 메서드 : 플리이 버튼
	abstract void play(int pos); //pos :track
	//추상메서드 : 정지버튼
	abstract void stop();
	
}
//플레이 :play () // 스탑stop()
//자식 클래스  : AudioPlayer
class AudioPlayer extends Player{
	
//	@override
	void play(int pos) {
		System.out.println(pos+"위치부터 실행합니다");
	}
	
	//@override
	void stop {
		System.out.println("재생을 멈추빈다");
	}
}
//오버라이딩 해서 구체적인 오디오 ㅍ흘레이렁서럭'ㅖ얼니ㅏㄷㅇㄴㄹㄴㅁㄻㄴㅇㄹㄴㅇㅁ


class PastaReceipt extends Receipt{
	
	PastaReceipt(String chef){
		 super(chef);
		}
	
	 
	void makeSource() {
		System.out.println("파스타소스를 직접만든다");
	}
	
	//@override
	void cookingPlay () {
		System.out.println("파스타 요이를 진행합니다");
	}
}
abstract class Receipt{//추상클래스 선언
	
	String chef;//셰프를  인스턴스 변수 (멤버필드)
	//기본생성자 
	Receipt(String chef){
	 this.chef = chef;
	}
	
	abstract void cookingPlay(); // 추상메서드 :  요리가 진행된ㄷ ㅏ 추상 메ㅐ서드 
	
	void info () { // 인스턴스메서드
		System.out.println("이 레시피는 " +chef+"셰프님의 레시피입니다");
	}
	
}

//제품 클래스 정의 (설계도) 
//product :제품
class Product () {
	int price;
	int bounusPoint; 
	//기본생성자
	Product(int price){
		this.price = price;
		this.bounusPoint = (int)(price/10.0);
	}

//TV :  제품들
class Tv extends product{
	
	Tv(int price ) {
		super(100);
		//TODO Auto-generated constructor stub
	}
	public String toString() {
		return Tv();
	}
}
//Computer : 제품들2
class Computer extends Product{
	
	Computer(int price){
		super(200);
		//TODO Auto-generated constructor stub
	}
}

//audio : 제품들 3
class audio extends Product{
	
	audio(int price){
		super(300);
		//TODO Auto-generated constructor stub

//Nintendo :  제품들 4
		class Nintendo extends Product{
			
			Nintendo(int price){
				super(50);
				//TODO Auto-generated constructor stub

// 고객 : buyer : 고객의 잔고를 계산 : money = 1000만원 - 매개변수 다형성 제품
				//고객의잔고 : 적을 경우 (money<price:잔액이 부족해서 판매할수없다) 
				//않을 경우(제품을 구매할거야!)

class buyer{//물건을 사는 클래스 : 행위메서드
	int money = 1000; //고객의 잔고
	int bounusPoint = 0;//보너스 포인트
	//행위 : 물건을 산다
	void buy (Product p) {
		
		if(money<p.price) {
			System.out.println("잔액이 부족해서 구매할 수 없습니다");
		}else {
			money -= p.price; //고객의 잔고에서 제품의 가격을 뺀다
			bouusPoint += p.bounusPoint;
			System.out.println( p.toString() +"을 구입하셨습니다");
		}
		//p.price;//제품의 가격: 고객이 사야할제품의 가격
		 //p.bounusPoint;//고객의 보너스 점수 
	}
	
}
				
class Car{//부모클래스
	 String color;
	 int door;
	 void drive() {
		 System.out.println("드라이브 중입니다..");
	 }
}

//자식 클래스 : 소방차
class FireEngine extends Car{
	void water() {
		System.out.println("water");
	}
}


//자식 클래스 : 엠뷸
class Ambluance extends Car{
	
}