package day1201;

public class LamdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ٽ� > Ŭ���� �޼ҵ� -> action()
		//�̸��� ���� �Լ�
		action((x,y)->{
			int result = x+y;
			System.out.println("result:"+result);
		});
		
		action((x,y)->{
			int result = x-y;
			System.out.println("result:"+result);
		});
		//Ŭ���� �޼ҵ� > �������̽� Ŭ���� : �޼ҵ� ���� ȣ�� 
		
		
		//�Ű������� ���� ���ٽ� > Ŭ���� �ν��Ͻ� �޼ҵ带 ȣ�� (�������̽�) -> ���ٽ��� �����Ѵ�
		
		//���Ŭ����
		Person3 person = new Person3();
		//���๮�� �ΰ����� �ִ°��
		person.action(()->{
			System.out.println("����� �մϴ�");
			System.out.println("���α׷����� �մϴ�");
		});
		
		//���๮�� �Ѱ��ϰ�� : �߰�ȣ�� ����
		person.action(()->System.out.println("����� �մϴ�"));
	
		//������ �ִ� ���ٽ�
		Person4 person2 = new Person4();
		
		
		//���ٽĿ��� ó���� �Ҷ�  -->return ---> Ŭ���� ��ȯ�޴� ������� ����Ѵ�
		person2.action((x,y)->{
			double result = x + y;
			return result;
		});
		
		// ������ �ִ� ���ٽ� : ���๮�� �ϳ��ϰ�� ������ �����Ҽ��ִ� �����ϴ�
		person2.action((x,y)->(x+y));
		
		//������ �ִ� ���ٽ�: ���๮�� �ϳ��ΰ�� ������ ó������� -> Ŭ���� �޼ҵ带 ���ؼ� �ذ�
		person2.action((x,y)->sum(x,y));
		
		//�޼ҵ� ����(���� �޼ҵ�/ �ν��Ͻ� �޼ҵ� )
		person2.action((x,y)->Computer2.staticMethod(x,y)); 
		
		//�޼ҵ����� (�ν��Ͻ� �޼ҵ� )
		//Person2.action(Computer2::instaceMethod);
	
		Computer2 com = new Computer2();
		person2.action((x,y)->com.instaceMethod(x,y));
		person2.action(com::instaceMethod);
	
	}
	
	public static void action(Calculable calculable) {//�������̽� �������� �Ű������� �޾ƾ� Ŭ���� �޼���
	
	int x = 10;
	int y = 4;
	
	calculable.calculate(x,y); // x,y �����
}

	public static double sum(double x, double y) {
		return(x+y);
	}
	
}
