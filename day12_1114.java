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
	p1.turnOn(); //���� ����Ŀ�� �������ϴ�

	Speaker s2 = new BlueSpeaker();
	Person p2= new Person(s2)
	p2.turnOn(); //�Ķ� ����Ŀ�� �������ϴ�

	//�������̽� ������ �����ϴ�
	Fighter f = new Fighter(); //�� �����ϴ� Ŭ������ ��ü�� ����
	f.move (100,200);
	
	Unit2 f2 = new Fighter();
	//f2.attack(); ����Ҽ����� ����ȯ�� �ٸ���
	Fightable f3 = new Fighter();
	f3.attack(new Fighter);
	//f3.x; �ڽ� Ŭ������ ���������� �������̽��� ���� ����ȯ�� ����ϴϱ�
	Fightable nf = f.getFighterble();//�ڽ� Ŭ���� �޼��� �θ��������̽� ����ȯ���� ���
	}

	//����ũ��
	interface Microphone(
			abstract void sing ();
			)
	//����Ŀ 
	interface speaker(
			abstract void music();
			)
	//�����������ũ
	class BlutootMic implements ����ũ����, ����Ŀ;
	}// �����������̽�
	public void sing () {
		 System.ot.println("����ũ�� ��� �뷡�� �θ��ϴ�");
	}
	public void music() {
		System.out.println("����ũ�� ������ ����Ŀ�� ���ְ� ��������");
	}
	
	//�ڽ�Ŭ���� ��ü ���� BlutootMic
	 BlutootMic bm = new 	 BlutootMic();
	//��ü�� �����Ǹ� ������ ���´� 
	 bm.music();
	 //��ü�� �����Ǹ� �뷡�� �δ����� 
	bm.sing ();

	
	
	
	//Ŭ���� unit2 : �߻�Ŭ���� abstract �޼���
abstract class Unit2{
	int x,y;
	abstract void move(int x, int y); //�߻�޼���
	void stop() {System.out.println("����ϴ�");

}
	// Ŭ���� �������̽� : Fighterable
	interFace Fightable {
		public void move (int x, int y);// move �߻�޼��� 
		public void attack(Fightable f); //attack �߻�޼���
	}
	
	// Ŭ���� Fighter : extends unit2( �߻�Ŭ����) imsdfkldfsklsdfajkl;fsadjkl;adfsj
	class Fighter extends Unit2 implements Fightable{
		public void move (int x, int y ) {
			System.out.println("{"x","y"}�� �̵�");
		}
		public void attack(Fighterable f) {
			System.out.println(f+"�� ���� ");
		}
	
		//�������̽� ����. ����ȯ���� �����ϴ�.
		//Fightable f = new Fighter();
		Fightable getFighterble() {
		//�ڽ��� �Ѹ��� �����Ѵ�.
			Fighter f = new Fighter ();
			 return f;
		}
		}
		
	class Speaker{
		String getName() {
			return"����Ŀ";
		}
	}

	class RedSpeaker extends Speaker{
	String getName() {
		return"�߰�";
	}
	}
	
	class BlueSpeaker{
		String getName() {
			return"�Ķ�";
	}
	}
	class Person{//���Ŭ����
		
		//��ü����
		Speaker speaker;

	       //�⺻������
		Person( Speaker speaker){
		this.speaker = speaker;
	}
	      //�޼��� : ����(Ŭ����: �Ű����� ������) ����Ŀ�� �������ϴ� .
		void turnOn(){
		System.out.println(Speaker.getName()+"�� �������ϴ�");
	}
	}
