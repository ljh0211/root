package day10;
import day08.mouse;

public class day10_20231107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오버라이딩 : 부모와 자식에게 있는 메서드이다 
		//자식은 부모와 다르게 메서드를 구현해서 새로운 방법으로 사용한다
		
		//삼송 컴퓨터 객체 생성 =  오버라이딩
		 Samsong s = new Samsong();
		 s.powerOn();
		 s.powerOff();
		//컴퓨터 객체 생성 =  오버라이딩(X)
		 computer_ c = new computer_();
		 c.powerOn();
		 c.powerOff();
		 //c.comname;
		System.out.println("컴퓨터의 이름은 "+c.getName());
		
		mouse_ m = new mouse_();
		// 다른패키지가 포함될경우는 접근이 제한된다
		mouse m2 = new mouse();
		m2.getName();
		
		//final 클래스와 메서드
		Comic co = new Comic("주머니 괴물", "미상", true);
		co.info_title();
		co.info_author();
		co.info_color();
		
		//@ 다형성 : 다양한 형태로 변화된다는 것이다 (상속: 조상에게 자식이 형타입을 맞춘다)
		DeskCalendar dc = new DeskCalendar("보라색,6");
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println(); //한줄뛰기
		Calendar dc2 = new DeskCalendar("보라색",6);
		dc2.info();
		dc2.hanging();
		//dhfb qnahdml wkf7ugodifspodfsipo
		
		Car c1 = new SchoolBus();
		
		Bus b1 = new Bus(); //자동 형변환 가능
		Bus b2 = new SchoolBus(); // 자동 형변환 가능
		
		Car c2 = new OpenCar(); // r 자동 현 앚러디ㅏ
		OpenCar oc = new sportsCar(); //자동현ㅇ자벼나호낙ㅇ
	//	Bus b3 = new OpenCar(); // 자동형변환 가능 하지 않아 
	//	Bus b4 = new sportsCar(); //자동형변환가능하지않다
		
		//졷상이 같더라도 부모가 다르면 자동형변환이 불가능하다
	}
}
//부모클래스 : Book

//쿠ㅡㄹ1
class Car{}
class Bus extends Car{}
class SchoolBus extends Bus{}
//ㅜㅜㅜㅠㅜㅠㅜㅠㅜㅜㅠㅜㅠㅜㅠㅜㅠ

//클2
class OpenCar extends Car{}
class sportsCar extends OpenCar{}



//부모클래스 : Calenddar (달력)
class Calendar{
	String color;
	int months;
	Calendar(String color, int months){
		this.color = color;
		this.months = months;
	}
	
	void info() {//달력의 정보
		System.out.println(color+"달력은 "+months+"월까지 있습니다 ");
	}
	
	void hanging() {//벽걸이 정보 
		System.out.println(color+"달력은 벽에 걸수잇습니다 ");
	}
	
}


//자식 클래스 : DeskCalendar (책상에 올려 놓는 달력)
class DeskCalendar extends Calender{
	
	DeskCalendar(String color, int months){
		super(color, months);
		// TODO auto-generated constructor stub
	}
@override 
void hanging() {
	System.out.println(color+"달력을 벽에 걸기 위해 고리가 추가로 필요합니다");
}
void onTheDesk() {
	System.out.println(color+"달력은 책상에 세울 수 있습니다 ");
}
}

class Book { 
	String title ;
	String author;
	
	//기본생성자 : 객체 생성시 초기화
	 Book(String title, String author){
		 this.title = title;
		 this.author = author;
	 }
	 
	 //final 메서드 만든다
	 final void info_title() {
		 System.out.println("책의 제목은"+title+"입니다");
	 }
	 
	 // 멤버메: 객체가생성될때 사용하늗 메소드(힙영역)
	 void info_author() {
		 System.out.println("책의 저자는"+ author +"입니다");
	 }
}
//자식클래스 : Comic
class Comic extends Book{
	boolean isColor;
	Comic(String title, String author,boolean isColor){
		super(title, author); //부모 생성자
		// TODO Auto-generated constructor stub
		this.isColor = isColor; //색깔구분
	}
	
	//@override
	//파이널 메서드 오버라이딩
	//void info_title() {
		// System.out.println("책의 제목은"+title+"입니다");
		 
	void info_author() {
		 System.out.println("이만화책은 저자는"+ author +"입니다");
	 }
 
	void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러야");
			}else {
				System.out.println("이 만화책은 흑백이야");
			}
	}

   }

//클래스 1 : 컴퓨터
class computer_{
	private String comname;
	void powerOn() {
		System.out.println("삑삑삑 컴퓨터가 켜졌습니다");
	}
	
	String getName () {
		this.comname = "부모컴퓨터";
		return.this.comname;
	}
	void powerOff() {
	System.out.println("삑삑삑 컴퓨터가 꺼졌습니다");
	}
	
}

//클래스 2 : 삼성
class Samsong extends computer_{
	
	@Override
	void powerOn() {
	System.out.println("아이러브 삼송"+ "삑삑삑 컴퓨터가 켜졌습니다");
	}
		
	
	
}
