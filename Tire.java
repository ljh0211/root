package day1117;

public class Tire {
 public void roll() {
	 System.out.println ("�Ϲ�Ÿ�̾ �������ϴ�");
 }
}


class Car{
	
	//�͸� ���� ��ü
	 private Tire tire1 = new Tire();
	 
	//�ʵ忡 �͸� �ڽ� ��ü ���Ժ��� = ��ü(){//���ӰԸ�����մ� �������}
	 private Tire tire2 = new Tire() {
		 public void roll() {
			 System.out.println("�͸� �ڽ� ��ü1�� �������ϴ�");
		 }
	 };
	 //�޼��� Ȱ���ؼ� tire 1/tire2 ��ü�� ȣ���غ���
	 public void run1() {
		 tire1.roll();
		 tire2.roll();
	 }
	 //�޼���(���ú��� �̿�)
	 public void run2() {
		 //���ú����� �͸� �ڽ� ��ü ����
	 Tire tire = new Tire() {
		public void roll() {
			System.out.println("�͸� �ڽ� ��ü2 �������ϴ�");
		}
		
	 };
	 tire.roll();
	 }
	 
	 //�޼��� run3
	 public void run3(Tire tire) {
		// TODO Auto-generated method stub
		tire.roll();
	 }
}