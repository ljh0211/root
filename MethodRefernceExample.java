package day1201;

public class MethodRefernceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//(a,b)->a.comprareIgnoreCase(b)
		Person5 person= new Person5();
		
		//Ŭ���� �ȿ� �ν��Ͻ��� ȣ���ؼ� �������̽� �������� �޴´�
		//���ٽ����� ����
		person.ordering((a,b)->{
		return a.compareToIgnoreCase(b);
		});
		
		//������ ���� ���ٽ� : ���๮�� �Ѱ��� ��� return
		person.ordering((a,b)->a.compareToIgnoreCase(b));
		
		//�������̽� �Ű����� a�� ���������� �ۼ��Ѵ�
		person.ordering(String::compareToIgnoreCase);

		//�������̽� ��ü ����� ���ٽ��� �̿��� �Լ��� �����ϴ� ���
		CompareNumber compare = 
				(num01,num02)->{return num01>num02?1:num01<num02?-1:0;};
				
		int num01 = 10;
		int num02 = 20;
		
		int result = compare.compareTo(num01,num02);
		if(result>0) {
			System.out.println("num01�� num02���� ũ��");
		}else if(result<0) {
			System.out.println("num01�� num02���� �۴� ");
		}else {
			System.out.println("num01�� num02�� �����ϴ�");
		}
	}

}
