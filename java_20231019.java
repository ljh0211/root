package day3;

public class java_20231019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���׿�����_ ��ȣ������
		//x��� ������ 100�̰� ���� �ϳ��� ����� �������
		int x =100;
		int result_plus = +x;
		int result_minus = -x;
		
		System.out.println(result_plus);
		System.out.println(result_minus);
		
		//���׿�����_����������(--/++)
		//��������ڸ� �����ϰ� ó���Ҷ� ����Ѵ�.
		//������ ������ : num++;
		//������ �Ŀ��� : ++num;
		//��°�� :10 / 11
		int num = 10;
		System.out.println(num++);
		System.out.println(num);
		
		//���� int�� x�ϴ� ������ �����մϴ�. =>1;
		//��°�� ;
		//1 ������������
		//2
		//3 ������ �Ŀ���
		
		int y = 1;
		System.out.println(y++);
		System.out.println(y);
		System.out.println(++y);
		
		//�ƽ�Ű�ڵ� 'A'=65 / 'B' =66
	    char alphabet = 'X';
		//������ : ���������ڸ� �ѹ� ����ؼ� X Y 
		//X ��� 
	    System.out.println(alphabet++);//y
		//Y ���
	    System.out.println(alphabet);
	    
		//���׿����� (�ǿ�����+�ǿ�����)
	    //��������� : ����+���� => ó���Ȱ��
	    int num_x = 100;
	    int num_y = 200;
	    //��°��
	    System.out.println(num_x+num_y);
	    //��°�� :20000
	    System.out.println(num_x*num_y);
	    //��°�� : 0 
	    System.out.println(num_x/num_y);
	    //��°�� ��: 100
	    System.out.println(num_x%num_y); //100/200 % =100 ������ X
	    
	   // 2)���׿����� _ ���մ��Կ����� y=y+1
	    		
	    int numbery = 5;
	    //numbery = numbery + 1;
	    //numbery += 1;
	    //numbery = numbery * 2 //10
	    //numbery *= 2; //10	
	    //numbery = numbery - 2; //3
	    //numbery -= 2;
	    
	    //3)���迬���� : ũ�� �۴� ���� ���ų� �۴� ���ų� ũ��
	    // ������� ������ �Ǵ��̴�.(true/false)
	    int a = 10;
	    int b = 20;
	    // a�� b���� ũ��
	    // a�� b���� �۰ų� ����.
	    // a�� b�� ����
	    // a�� b�� �����ʴ�
	    
	    System.out.println(a>b);
	    System.out.println(a<=b);
	    System.out.println(a==b);
	    System.out.println(a!=b);
	    
	   // 4)���׿����� _ �������� (��Ʈ������ )
	    
	    		//1(&&,&)and = ���� = A(1) && B(1) true
	    		//2(ll,l)or =���� = A(1) && B(0) ; true 
	    		//3(^) XOR = ��Ÿ�� ���� = A(1) ^ 
	    		//4(!) NOT
	    
	    //boolean : 1byte :8bit ���ǥ�� : true(1)/false(0)
	    boolean b1 = true;
	    boolean b2 = false;
	    boolean b3 = true;
	    boolean b4 = false;
	    
	    System.out.println("###����(AND) :�Ѵ� true = 1##");
	    //false (0==0/ 1==0/0==1) b1�� b2�� �̿��ؼ� false
	    System.out.println(b1 && b2);
	    //true (1==1)
	    System.out.println(b1 && b3);
	    //false (0==0/ 1==0/0==1) b2�� b4�� �̿��ؼ� false
	    System.out.println(b2 && b4);
	    
	    System.out.println("###����(OR) : ���� �ϳ���  true=1###");
	    //true
	    System.out.println(b1||b4); //true(1) || false(0) =1 (true)
	    //true
	    System.out.println(b1||b3); //true(1) || true(1) = 1(true)
	    //false
	    System.out.println(b2||b4); //false(0) || false(0) =0(false)
	    
	    System.out.println("###��Ÿ�� ����(XOR) : �ٸ��� true(1) ������  false(0)");
	    //true (b1 t 2f 3t 4f)
	    System.out.println(b1^b2);
	    //false
	    System.out.println(b2^b4);
	    
	    ///4)���׿����� _������������(NOT)
	    System.out.println("������������(NOT)");
	    boolean not_ = false;
	    System.out.println(!not_);
	   
	    //3���׿����� �ǿ����ڰ� 3���� ���� ������̴�.
	    //���ǽ�(�ǿ���1)?��(�ǿ���2):����(�ǿ�����3)
	    int number = (7>1)?1:2;
	    System.out.println(number);
	}

}
