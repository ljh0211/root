package day1117;

public class Exception_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.NULLPointerException : ��ü�� �����ϸ� �ν��Ͻ� �ּҰ�
		//������ �Ǵµ� ��ü�� ���� �Ǵµ� ���� �޸𸮰� �����»���
		System.out.println("#######NullpointerException########");
		
		String[]strArray = null;
		System.out.println("strArray[0]:"+strArray[0]);
		//2. NumberFormateExcption :  �߸��� ���ڷ� ����Ȳ��
		//�߻��ϰų� ������ ������ ���ڿ��� ����Ÿ������ �����ϳ�
		//�Ǽ����� ���������� ��ȯ�Ҷ� ������ ����
		System.out.println("#######NumberFormateException########");
		String str01 = "11";
		int num01 = Interger.porseInt(str01);
		System.out.println("String int"+num01);
		//int num02 = Integer.porseInt(str02);
		//.3. ArrayIndexOutofVoundsExcption :  �迭���� �ε���
		//�������� �ʰ��Ҵ� �߻��ϴ� �����̴�
		System.out.println("#######ArrayIndexOutofBoundsException########");
		int[] arr = {1,6,7,9,10};
		System.out.println(arr[6]);
	}

}
