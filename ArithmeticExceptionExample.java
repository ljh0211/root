package day1117;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������ڷ� ����� �� ��� ����� �߸��� ó���� �ؼ� ������ �߻��� ���
		int result = 0;
	
		try {
			result = 10/0;
		}catch(ArithmeticExceptionExample e) {
			//
			System.out.println("0���� �����⸦ �Ҽ� �����ϴ�");
		}finally {
			System.out.println(" ���α׷� ����");
		}
		
	}

}
