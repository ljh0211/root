package day_1123;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String Ŭ����(java.lang) : charAt() �޼���
		//���ڿ��� �ϳ��� �ܾ� ������ ���
		
		String word = "1T2LLOVE6YOU";
		
		//���ڿ����� ���ڸ� ã�� ���� �ϰ� ���ڸ� ���
		String text = "";
		
		//length() ���ڿ� ���̸� ��ȯ �ش� ���ڿ��� ���̴� ��ȯ�ϴ� �޼��带 ���ؼ� word:11 ���ڿ�)
		for (int i=0 ; i< word.length(); i++) {
			
			//charAt (index) : String char[] ���ڰ� �ϳ� ���� ĳ���� �ϳ��� ���ڷ� ��ȯ
		char ch =  word.charAt(i);
		//System.out.println(ch);
		
		int asciNum = ch; //���ڸ� �ƽ�Ű �ڵ忡 ���ؼ� 10������ ��ȯ
		
		//System.out.println(asciNum);
		//�ƽ�Ű�ڵ� ��ȣǥ�� �̿��ؼ� ���ڸ��������� �ʰ� ���ڸ� ���ս�Ų��
		
		// �ҹ��� a-z  97-122 / �빮�� A-Z 65-90
		if((asciNum >= 65 && asciNum <=90) || (asciNum >= 97 && asciNum <=122)) {
			//���ڿ� ��� 
			text += ch;
		}else {
			text += " ";
		}
		
		}
		System.out.println(text);
	
		//indexOf() �޼��� : ���ڿ��� ���Ե� �ܾ� �Ǵ� ���ڿ��� ��ġ�� �˻������� 
		//��ġ�� index ���� ��ȯ
		String strindex = "HelloWorld_MyWorld";
	
		//world ó�� �ε��� ��ȣ�� ��� ���۵Ǿ������� �˰�;
		System.out.println(strindex.indexOf("World"));
		
		//world ó�� �ε��� ��ȣ�� ��� ���۵Ǿ������� �˰�;
		System.out.println(strindex.indexOf("World",10));
				
		//replaceAll(������, �����Ҵܾ�) :  �������� �����Ҵܾ�� ��� �ٲ��ش�
		String str = "�ڹ� ���α׷����� ������� �ڹٸ� ������ ����־��";
		String newstr= str.replaceAll("�ڹ�", "java");
				
				System.out.println(str);
				System.out.println(newstr);
		
				//subString(�����ϴ� �ε��� . ������ �ε���) : ���ϴ� ��ġ�� ���ڿ��� �߶� ����ϴ� �޼����̴�
			
				String subStr = "1234-5678";
				String subStr_ = subStr.substring(5);
				System.out.println(subStr_);
				
				String rangeStr = subStr.substring(0, 4);
				System.out.println(rangeStr);
				//split() : ���ڸ� �迭�� �����ؼ� �߶��ش�
				String subStr2 = "1234-5678";
				String[] phone = subStr2.split("-");
				System.out.println(phone[0]);
				System.out.println(phone[1]);//�ֹε�� , ��ȭ��ȣ
	
				//Stringbuffer / StringBullder
				StringBuilder buil_str = new StringBuilder("Hello");
				buil_str.append("World");
				System.out.println(buil_str);
				System.out.println(buil_str.length());
				
				//���ڿ� ���� delete
				buil_str.delete(0, 5);
				System.out.println(buil_str);
				
				//���ڿ� �߰� insert
				buil_str.insert(0, "Hello");
				System.out.println(buil_str);
				
				//���ڿ��� ����ȿ��reverse()
				buil_str.reverse();
				System.out.println(buil_str);
	}

}
