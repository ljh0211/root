package day08;


//����� Ŭ���� :main �޼��带 ������ Ŭ���� ������ �����ϸ� ���������
//			  ���α׷� ������ �ð��ִ� Ŭ�����̴�
public class day08_1102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ŭ���� ����
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		// Ŭ���� �߰� (Tree��� Ŭ������ �� �ä����ϰ� ��ü���� tree ��������)
		Tree tr1 = new Tree();
		tr1.leaf = "red";
		Tree tr2 = new Tree();
		
		//��ü : �ν��Ͻ�ȭ 
		Tv tv1 = new Tv(); //Tv1 ��ü�� ����Ѵ�.
		Tv tv2 = new Tv(); //Tv2 ��ü�� ����Ѵ�.
		
		tv1.channel = 7;
		tv1.channelDown(); //�Ҹ��� 6���� �پ���.
		
		//ä���� ���� ����غ���
		System.out.println("t1 ���� ������"+tv1.channel+"�Դϴ�.");
		System.out.println("t2 ���� ������"+tv2.channel+"�Դϴ�.");

		//tv1�� ��ü�� �ּҰ��� tv2�� �ּҰ����� �ٲ��ش�.
		tv2=  tv1; //x200 --> x100( tv1 ���� �ּ��� �޸𸮸� �����Ѵ�.)
		//ä���� ���� ����غ���
		System.out.println("t1 ���� ������"+tv1.channel+"�Դϴ�.");
		System.out.println("t2 ���� ������"+tv2.channel+"�Դϴ�.");
		
		//�ܺ����� class ���赵�� �̿��� ��ü ����
		Car_option car_= new Car_option();
		car_.wheel_gold = 2;
		System.out.println("�ڵ����� ����"+ car.wheel_gold+"�Դϴ�");
		car_.ride();
		car_.ride();
		car_.ride();
		car_.ride();
		
		//���� ����� static (�ν��Ͻ� / ����/ ����) ������ �����Ѵ�.
		System.out.println("Card.width="+Card.width);
		System.out.println("Card.width="+Card.height);
		
		Card ca1 = new Card(); //��ü ����
		ca1.kind = "Heart";
		ca1.number = 7;
		
		Card ca2 = new Card(); //������ ���赵�� ����Ѵ� ��ü 2����
		ca2.kind = "spade";
		ca2.number = 4;
		
		//ī���� ũ��� �׸��� �Ӽ��� ����غ���
		//ī��1�� ���� ��ü���� ���
		System.out.println("ca1��"+ca1.kind+"," + ca1.number+"�̸�" + ca1.width+"," + ca1.height);
		// ī�� 2�� ���� ��ü�� ���
		System.out.println("ca2��"+ca2.kind+"," + ca2.number+"�̸�" + ca2.width+"," + ca2.height);
		ca1.width =50;
		ca1.height= 80;
		//ī��1�� ���� ��ü���� ���
		System.out.println("ca1��"+ca1.kind+"," + ca1.number+"�̸�" + ca1.width+"," + ca1.height);
		// ī�� 2�� ���� ��ü�� ���
		System.out.println("ca2��"+ca2.kind+"," + ca2.number+"�̸�" + ca2.width+"," + ca2.height);

		//�޸𸮰� ����ɶ����� ����ִ� !
		printHello(); // ��ü�� �ƴϰ� Ŭ������ ȣ��ɶ� ������ ������ ����
		
		//�޼ҵ� ���� : ����޼ҵ� 
		//1. ������ ��ü�� �����Ѵ� 
		jogger jo = new jogger(); 
		//2. ������ �̸�(������� =)�� ���̸����� �����Ѵ�
		jo.name = "�����񿡽�";
		//3. ���Ÿ� �޸����Ѵ�.
		jo.run();
		//4. ������ �̸��� ���ϰ� �Ѵ�
		jo.sayName();
		
		// �޼ҵ幮�� : static �޼ҵ�
		// ��ȯ�� ���� �޼ҵ带 printgoodbye ��� ����� �߰���� �̾߱��ϴ� ����� �����غ���
		
	}

	
	static void printHello() {// ���� �޼��� (Ŭ������ ����ɶ� �޸𸮿� �޼ҵ尡 �ö󰣴� )
	System.out.println("������");
	System.out.println("�����ϰ��ֱ���");
	}
	
	
	static void printgoodbye() {
		System.out.println("�߰� �ȳ�");
	}
}




//���̺귯�� Ŭ���� : ����� Ŭ������ �׻� 1�� �̸鼭 ������ ������� Ŭ����
class jogger {
	String name;
	void run() {
		System.out.println("�޸����ִ� ������ ");
	}
	//��ü�� �����ؼ� ����Ҽ� �ִ� �޼��� : ��� �Լ� / ��� �޼ҵ� --> heap ����
	void sayName() {
		System.out.println("���̸���  "+name+"�Դϴ�");
	}
}
class Card {
	
	String kind; // ���
	int number; //ī���ȣ
	static int width = 100; //����
	static int height = 250; //����
}

class Tv{
	String color;
	boolean power;
	int channel;
	void power() { power = !power; } //�������
	void channelUp () { ++channel;} //�Ҹ��� Ŀ����
	void channelDown () { --channel;} //�Ҹ��� �۾�����
}


class Car{
	
}

class Tree{
	 String leaf = "green";
}