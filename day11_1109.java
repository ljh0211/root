package day11;



public class day11_1109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Ŭ������ ���� Ÿ�� ��ȯ
		
		
		//�ڽ� Ŭ���� < �θ�Ŭ���� : �ڵ�����ȯ -> �θ� ���ߴ� ���� �սǳ���
		//�������� Ÿ�� : ��Ÿ�� (�ڽ���)
		FireEngine f = new FireEngine();// �ڽİ�ü
		Car c = new Car();
		Car c2 = f;
		Car c_ = null; //�θ���Ÿ�� ��ü�� �������� �ʾҴ�.
		
		c_ = f; //�θ��� �� Ÿ���̰� �ڽ��� ��ü�� ������ ���
		f = (FireEngine)c_; //�ڽ��� ��ü�� ����ȯ
		f.drive();
		f.water();
		
		//@�Ű�����(�Լ�): Ŭ����- ��ü�� �����Ҷ�
		buyer b = new buyer(); //���̾� ��ü ����
		//��ǰ�� ��ü�� �����ؼ� ��ü�� �Ѱ��ش�
		audio a = new audio(100);
		Computer com = new Computer(200);
		Tv tv =  new Tv(100);
		//���̾ ��ǻ�͸� ���
		b.buy(com);
		//���̾ Ƽ�� ���
		b.buy(tv);
		//���̾��� ���� �������� ����Ѵ�
		System.out.println("���� ���� ���� " + b.money+"�Դϴ�");
		
		
		//�߻�Ŭ���� abatract
		//������ �߻�Ŭ����
		//Receipt cp =  new Receipt("������");//
		//�Ľ�Ÿ ������ (�ڼ�)
		PastaReceipt pr = new PastaReceipt("������");// �߻� Ŭ������ �����ϴ� �ڽ� Ŭ���� ��ü ����
		// �ڽ� ��ü�� ���� �߻� Ŭ������ �ż��嵵 ȣ���Ҽ� �յ�
		pr.info();// �ڽ� ��ü[�� ���� �߻� Ŭ������ �ν��Ͻ��޼���� ȣ���Ҽ��յ�
		pr.makeSource();// �ڽ� ��ü�� �ν��Ͻ� �ż��� ȣ��
		pr.cookingPlay();// �ڽ� ��ü���� �߻� �޼ҵ嵵 ȣ���Ѵ� �ν��Ͻ� �޼���� �ٸ��� �߻�޼���� ������ ���������������Ӥ���Ӥ���������;�����ʤ�������������;
		//������ũ ������ (�ڼ�)

		//�߻�Ŭ���� ���� 2 : �÷��̾ Ȱ���� �߻�Ŭ����
		AudioPlayer p = new AudioPlayer();
		p.play(10); //
		p.stop(); //����� 
	}

}
//�߻�Ŭ���� : player
abstract class Player {
	//�߻� �޼��� : �ø��� ��ư
	abstract void play(int pos); //pos :track
	//�߻�޼��� : ������ư
	abstract void stop();
	
}
//�÷��� :play () // ��žstop()
//�ڽ� Ŭ����  : AudioPlayer
class AudioPlayer extends Player{
	
//	@override
	void play(int pos) {
		System.out.println(pos+"��ġ���� �����մϴ�");
	}
	
	//@override
	void stop {
		System.out.println("����� ���ߺ��");
	}
}
//�������̵� �ؼ� ��ü���� ����� ���극�̷�����'�ƾ�Ϥ���������������������������


class PastaReceipt extends Receipt{
	
	PastaReceipt(String chef){
		 super(chef);
		}
	
	 
	void makeSource() {
		System.out.println("�Ľ�Ÿ�ҽ��� ���������");
	}
	
	//@override
	void cookingPlay () {
		System.out.println("�Ľ�Ÿ ���̸� �����մϴ�");
	}
}
abstract class Receipt{//�߻�Ŭ���� ����
	
	String chef;//������  �ν��Ͻ� ���� (����ʵ�)
	//�⺻������ 
	Receipt(String chef){
	 this.chef = chef;
	}
	
	abstract void cookingPlay(); // �߻�޼��� :  �丮�� ����Ȥ� �� �߻� �ޤ����� 
	
	void info () { // �ν��Ͻ��޼���
		System.out.println("�� �����Ǵ� " +chef+"�������� �������Դϴ�");
	}
	
}

//��ǰ Ŭ���� ���� (���赵) 
//product :��ǰ
class Product () {
	int price;
	int bounusPoint; 
	//�⺻������
	Product(int price){
		this.price = price;
		this.bounusPoint = (int)(price/10.0);
	}

//TV :  ��ǰ��
class Tv extends product{
	
	Tv(int price ) {
		super(100);
		//TODO Auto-generated constructor stub
	}
	public String toString() {
		return Tv();
	}
}
//Computer : ��ǰ��2
class Computer extends Product{
	
	Computer(int price){
		super(200);
		//TODO Auto-generated constructor stub
	}
}

//audio : ��ǰ�� 3
class audio extends Product{
	
	audio(int price){
		super(300);
		//TODO Auto-generated constructor stub

//Nintendo :  ��ǰ�� 4
		class Nintendo extends Product{
			
			Nintendo(int price){
				super(50);
				//TODO Auto-generated constructor stub

// �� : buyer : ���� �ܰ� ��� : money = 1000���� - �Ű����� ������ ��ǰ
				//�����ܰ� : ���� ��� (money<price:�ܾ��� �����ؼ� �Ǹ��Ҽ�����) 
				//���� ���(��ǰ�� �����Ұž�!)

class buyer{//������ ��� Ŭ���� : �����޼���
	int money = 1000; //���� �ܰ�
	int bounusPoint = 0;//���ʽ� ����Ʈ
	//���� : ������ ���
	void buy (Product p) {
		
		if(money<p.price) {
			System.out.println("�ܾ��� �����ؼ� ������ �� �����ϴ�");
		}else {
			money -= p.price; //���� �ܰ��� ��ǰ�� ������ ����
			bouusPoint += p.bounusPoint;
			System.out.println( p.toString() +"�� �����ϼ̽��ϴ�");
		}
		//p.price;//��ǰ�� ����: ���� �������ǰ�� ����
		 //p.bounusPoint;//���� ���ʽ� ���� 
	}
	
}
				
class Car{//�θ�Ŭ����
	 String color;
	 int door;
	 void drive() {
		 System.out.println("����̺� ���Դϴ�..");
	 }
}

//�ڽ� Ŭ���� : �ҹ���
class FireEngine extends Car{
	void water() {
		System.out.println("water");
	}
}


//�ڽ� Ŭ���� : ����
class Ambluance extends Car{
	
}