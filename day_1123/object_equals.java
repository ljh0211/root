package day_1123;

public class object_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//��Ʈ�� �����ϴ� ���� 2��
		String str1 = "hello";
		String str2 = "hello";
		
		
		//String ��ü�� ���� ��Ƽ� �����ϴ� ���� 1��
		String str3 = new String("hello");
		
		
		//���ڿ� ���� ��
		System.out.println("str1 vs str2:"+(str1==str2));
		System.out.println("str2 vs str3:"+(str2==str3));
		System.out.println("str2 vs str3:"+(str2.equals(str3)));
	
		//�� ���ڿ� ������ ��ġ���� ���
		System.out.println("str1 �ؽ��ڵ� : "+ System.identityHashCode(str1));
		System.out.println("str2 �ؽ��ڵ� : "+ System.identityHashCode(str2));
		System.out.println("str3 �ؽ��ڵ� : "+ System.identityHashCode(str3));
		
		String str4 = new String("abc");
		String str5 = new String("abc");
		
		System.out.println("str4 vs str5 : " + (str4==str5));
		System.out.println("str4 vs str5  equals() : "+(str4.equals(str5))); //�ν��Ͻ� ���� ��(String ��ü)
		
		//hashcode �����: �������̵� �� ��ü�� �ĺ���
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());

		//identityhashcode(object obj) : �������̵� �����ʴ� ��ü�� �ּҰ�
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		
		//��ü�� �����Ѵ� (�ڵ�������)
		Car_String car = new Car_String("�ҳ�Ÿ","����");
		
		
	}

}
