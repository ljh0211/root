package day1117;

public class main_20231117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//OK ��ư ��ü����
		Button btnOK =  new Button();
		
		class OkListener implements Button.ClickListener{
			
			@Overrride
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("OK ��ư�� Ŭ���߽��ϴ�");
			}
		}
		
		//��ư ��ü�� ClickListener ��ü ���� �ν��Ͻ� �޼��带 ȣ��
		 btnOK.setClickListener(new Button.clickListener() {
			
			@Override
			public void onclick() {
				// TODO Auto-generated method stub
				System.out.println("OK��ư�� Ŭ���߽��ϴ�")
			}
		});
		 
		// ��ư ��ü �ִ� ������ ��ư�� ��µǴ� �̺�Ʈ �޼����� Ŭ��
		 btnOK.click();
		 
		 //��ư ��ü�� �ϳ� �������Ѵ�
		 Button btnCancle =  new Button();
		 
		 //��ü�� �����ϴ����Ŭ������ ����� 
		 class CancleListener implement Button.ClickListener{
			
			 @Overrride
				public void onClick() {
					// TODO Auto-generated method stub
					System.out.println("��� ��ư�� Ŭ���߽��ϴ�");
				}
			 
		 }
		 //��ü�� �����Ѵ�
		 btnCancle.setClicksistener(new Button.ClickListener());
		 
		 //��ư�� Ŭ���Ѵ�
		 btnCancle.click();
		 
		 
		 
		 //�ڵ�����ü�� �� ��������
		 Car car = new Car();
		 //�ڵ��� ��ü �ν��Ͻ� �޼����� run1 () ȣ������
		 car.run1();
		 // �ڵ��� ��ü �ν��Ͻ� �޼���  run2 () ȣ������
		 car.run2();
		 
		 //�͸� �ڽ� ��ü�� ���Ե� �Ű������� ���
		 //method > run3() �޼ҵ带 ���� �͸��ڽİ�ü�� ���� ������
		 //car.method(Tire tire(roll(){System.out.println(�͸�3)}
		  car.run3(new Tire() {
			  public void roll() {
				  System.out.println("�͸��ڽ� ��ü3�� �������ϴ�");
			  }
		  });
		  
		  
		  //homi �ν��Ͻ� ����
		  Homi homi = new Homi();
		  //ȣ��.use1 ȣ��
		  homi.use1();
		  //ȣ��. use2 ȣ��
		  homi.use2();
	}

}
