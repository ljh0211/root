package day1117;

public class Button {

	public static interface clickListener{//��ø �������̽�
		void onclick();
	}
	// ��ü ������ ������
	ClickListener clickListener;
	
	// ��ü ���� : ���(okl) /���(cancle)
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	//��ư Ŭ���ϴ� �޼���
	public void click() {
		this.clickListener.onclick();
	}
	
}
