package day10;
import day08.mouse;

public class day10_20231107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������̵� : �θ�� �ڽĿ��� �ִ� �޼����̴� 
		//�ڽ��� �θ�� �ٸ��� �޼��带 �����ؼ� ���ο� ������� ����Ѵ�
		
		//��� ��ǻ�� ��ü ���� =  �������̵�
		 Samsong s = new Samsong();
		 s.powerOn();
		 s.powerOff();
		//��ǻ�� ��ü ���� =  �������̵�(X)
		 computer_ c = new computer_();
		 c.powerOn();
		 c.powerOff();
		 //c.comname;
		System.out.println("��ǻ���� �̸��� "+c.getName());
		
		mouse_ m = new mouse_();
		// �ٸ���Ű���� ���Եɰ��� ������ ���ѵȴ�
		mouse m2 = new mouse();
		m2.getName();
		
		//final Ŭ������ �޼���
		Comic co = new Comic("�ָӴ� ����", "�̻�", true);
		co.info_title();
		co.info_author();
		co.info_color();
		
		//@ ������ : �پ��� ���·� ��ȭ�ȴٴ� ���̴� (���: ���󿡰� �ڽ��� ��Ÿ���� �����)
		DeskCalendar dc = new DeskCalendar("�����,6");
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println(); //���ٶٱ�
		Calendar dc2 = new DeskCalendar("�����",6);
		dc2.info();
		dc2.hanging();
		//dhfb qnahdml wkf7ugodifspodfsipo
		
		Car c1 = new SchoolBus();
		
		Bus b1 = new Bus(); //�ڵ� ����ȯ ����
		Bus b2 = new SchoolBus(); // �ڵ� ����ȯ ����
		
		Car c2 = new OpenCar(); // r �ڵ� �� �ط���
		OpenCar oc = new sportsCar(); //�ڵ������ں���ȣ����
	//	Bus b3 = new OpenCar(); // �ڵ�����ȯ ���� ���� �ʾ� 
	//	Bus b4 = new sportsCar(); //�ڵ�����ȯ���������ʴ�
		
		//����� ������ �θ� �ٸ��� �ڵ�����ȯ�� �Ұ����ϴ�
	}
}
//�θ�Ŭ���� : Book

//��Ѥ�1
class Car{}
class Bus extends Car{}
class SchoolBus extends Bus{}
//�̤̤̤Ф̤Ф̤Ф̤̤Ф̤Ф̤Ф̤�

//Ŭ2
class OpenCar extends Car{}
class sportsCar extends OpenCar{}



//�θ�Ŭ���� : Calenddar (�޷�)
class Calendar{
	String color;
	int months;
	Calendar(String color, int months){
		this.color = color;
		this.months = months;
	}
	
	void info() {//�޷��� ����
		System.out.println(color+"�޷��� "+months+"������ �ֽ��ϴ� ");
	}
	
	void hanging() {//������ ���� 
		System.out.println(color+"�޷��� ���� �ɼ��ս��ϴ� ");
	}
	
}


//�ڽ� Ŭ���� : DeskCalendar (å�� �÷� ���� �޷�)
class DeskCalendar extends Calender{
	
	DeskCalendar(String color, int months){
		super(color, months);
		// TODO auto-generated constructor stub
	}
@override 
void hanging() {
	System.out.println(color+"�޷��� ���� �ɱ� ���� ���� �߰��� �ʿ��մϴ�");
}
void onTheDesk() {
	System.out.println(color+"�޷��� å�� ���� �� �ֽ��ϴ� ");
}
}

class Book { 
	String title ;
	String author;
	
	//�⺻������ : ��ü ������ �ʱ�ȭ
	 Book(String title, String author){
		 this.title = title;
		 this.author = author;
	 }
	 
	 //final �޼��� �����
	 final void info_title() {
		 System.out.println("å�� ������"+title+"�Դϴ�");
	 }
	 
	 // �����: ��ü�������ɶ� ����ψf �޼ҵ�(������)
	 void info_author() {
		 System.out.println("å�� ���ڴ�"+ author +"�Դϴ�");
	 }
}
//�ڽ�Ŭ���� : Comic
class Comic extends Book{
	boolean isColor;
	Comic(String title, String author,boolean isColor){
		super(title, author); //�θ� ������
		// TODO Auto-generated constructor stub
		this.isColor = isColor; //���򱸺�
	}
	
	//@override
	//���̳� �޼��� �������̵�
	//void info_title() {
		// System.out.println("å�� ������"+title+"�Դϴ�");
		 
	void info_author() {
		 System.out.println("�̸�ȭå�� ���ڴ�"+ author +"�Դϴ�");
	 }
 
	void info_color() {
		if(isColor) {
			System.out.println("�� ��ȭå�� �÷���");
			}else {
				System.out.println("�� ��ȭå�� ����̾�");
			}
	}

   }

//Ŭ���� 1 : ��ǻ��
class computer_{
	private String comname;
	void powerOn() {
		System.out.println("���� ��ǻ�Ͱ� �������ϴ�");
	}
	
	String getName () {
		this.comname = "�θ���ǻ��";
		return.this.comname;
	}
	void powerOff() {
	System.out.println("���� ��ǻ�Ͱ� �������ϴ�");
	}
	
}

//Ŭ���� 2 : �Ｚ
class Samsong extends computer_{
	
	@Override
	void powerOn() {
	System.out.println("���̷��� ���"+ "���� ��ǻ�Ͱ� �������ϴ�");
	}
		
	
	
}
