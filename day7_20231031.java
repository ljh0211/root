        package day7;

import java.util.Arrays;

public class day7_20231031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [ ] arr = new int[5];
		//�������� : �ּҸ� ����ϸ� �迭�� ��ġ�� �ּҰ����� ��µȴ�,
		
		System.out.println(arr);
		
		//�迭�� ���� �߰�
		//�� �迭�� �ε����� �����ϰ� 1-5���� ���� �־��
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//�迭�� ���� �������
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr[0]="+arr[1]);
		System.out.println("arr[0]="+arr[2]);
		System.out.println("arr[0]="+arr[3]);
		System.out.println("arr[0]="+arr[4]);
		
		//�迭�� ũ�⸦ �������
		System.out.println("�迭�� ũ��="+arr.length+"�Դϴ�");
		
		//�迭�� �ʱⰪ
		//�迭�� �ʱⰪ : ������ ������ �ڵ����� �����ȴ� �ʱⰪ�̴�
		
		int  [ ] intArray = new int [5];
		System.out.println(intArray);
		System.out.println(arr);
		String[ ] strArray = new String [5];
		System.out.println(strArray);
		
		int [ ] varArray = {1,2,3,4,5};
		
		//intArray ù��°�� �ι�°���� ����غ���
		System.out.println("intArray[0]="+intArray[0]);
		System.out.println("intArray[1]="+intArray[1]);
		//strArray ù��°�� �ι�°���� ����غ���.
		System.out.println("strArray[0]="+strArray[0]);
		System.out.println("strArray[1]="+strArray[1]);
		
		//varArray ù��°�� �ι�°���� ����غ���.
		System.out.println("varArray[0]="+varArray[0]);
		System.out.println("varArray[1]="+varArray[1]);

		//����1 : �迭���� �ܾ �����Ͽ� ����ϱ�
		//char [ ] �迭�� �����ϰ� = {'1','L','O','2','v','3','E'}
		//�ҹ��� �ƽ�Ű�ڵ��߿��� �������� ��쳪 �빮�� �ƽ�Ű�ڵ��߿��� �������϶�
		//���ڿ��� ���ؼ� ����Ұž�
		
		char[ ] card = {'1','L','O','2','v','3','E'};
		String myWord = "";
		
		//�ݺ����� �������
		for(int i=0; i<card.length; i++) {
			//System.out.println(card[i]);
			int word = card[i];
			
			//�빮�� : 65ũ��~90�۰� �ҹ��� : 97ũ�ų� ����~122 �۰ų� ����
			if((word >= 65 && word <=90) || (word >=97 && word<=122)) {
				myWord += (char)word;
			}
		}
		
		System.out.println("�ܾ� : " + myWord);
		
		
		//@Array Ŭ����
		//�迭�� ���
		
		int [ ] arrs = {1,6,2,3,10,7,4,5,8,9};
		
		//�迭�� �ִ� ���� �����ϰ� ����ؼ� ����ʹ�.
		System.out.println("�������迭 : "+Arrays.toString(arrs));
		
		//-�迭�� ���� (��������/��������)
		//�������� : ���������� ���ʴ�� �����Ѵ����
		//Arrays.sort(�迭�̸�);
		Arrays.sort(arrs);
		System.out.println("�����Ĺ迭 : "+Arrays.toString(arrs));
		
		Integer [ ] arrs2 = {1,6,2,3,10,7,4,5,8,9};
		
		System.out.println("�������迭 : "+Arrays.toString(arrs2));
		
		//�������� : ū������ ���������� ���ʴ�� �����ϴ� ���
		//Arrays.sort(arrs,comparatro.reverseOrder());
		Arrays.sort(arrs2,Comparator.reverseOrder());
		
		System.out.println("������ �������� : "+Arrays.toString(arrs2));
		
		//1.���� ����(shallow copy)
		//����� �迭�̳� ���� �迭�� ����ɶ� ���ΰ��� ���̺���ȴ�
		
		//int��[] arr01 = {1,2,3};������ ��� ���� �ִ´� = {1,2,3}
		int[] arr01= {1,2,3};
		
		//�迭�� ���������Ѵ�
		//����ǿ� �迭�� �����ϰ� arr01 �������ش�
		int[] arr02 = arr01;
		
		//�迭�� ����Ѵ� ( arr01)=Arrays.toString(�迭�̸� )
		System.out.println("arr01 �迭:"+Arrays.toString(arr01));
		
		//arr02[1] : �ι�° �ε��� ���� 10�ٲ��ش�.
		arr02[1] = 10;
		
		//arr01�� arr02���� ����غ���.
		System.out.println("arr01 �迭:"+Arrays.toString(arr01));
		System.out.println("arr02 �迭:"+Arrays.toString(arr02));
		
		//2. ��������(deep copy)
		//����� �迭�̳� �����迭�� ����ɴ� ���ΰ��� ���� �ٲ����ʴ´�
		//-������ �迭�� ����
		
		int [ ] card01 = {1,6,4,5,3,2};
		int [ ] card02 =  new int[card01.length];
		
		//���ο� �迭�� ���� �迭���� insert(�߰�)
		for (int i=0; i<card01.length; i++) {
			card02[i] = card01[i];
		}
		//���� ������ �迭�� ù��° �迭�� ���� �����Ѵ�
		card02[0] = 100;
		
		//����غ���
		System.out.println("card01 �迭:"+Arrays.toString(card01));
		System.out.println("card02 �迭:"+Arrays.toString(card02));
		
		//int [ ] card03 = Arrays.copyof(�����迭, �����迭ũ��)
		int [ ] card03 = Arrays.copyOf(card01, card01.lehgth);
		
		//card03[1] = 200�ٲ��
		card03[1] = 200;
		//����غ���
		System.out.println("card01 �迭:"+Arrays.toString(card01));
		System.out.println("card03 �迭:"+Arrays.toString(card03));
		
		//System.out.println(����,0,���纻,0,�迭ũ��)
		//�κ����̴� �������⤿�����ä����朗���ƤӤø���[����
		
		int[] card04 = new int[card01.length-2]; ///ũ��Z �Ǥ�����ŭ�� ���ϵ���ؤ���(=����_)
		System.arraycopy(card01,0,card,0,card01.length-2);
		
		//card04 [2] =300
		card04[2] = 300;
		
		//����⤿���o�ߤ�
		System.out.println("card01 �迭:"+Arrays.toString(card01));
		System.out.println("card04 �迭:"+Arrays.toString(card04));
		
		
		//2���� �迭 ����
		
		int [][] arrys = new int[3] [] ; // ���� ũ�⸦ �����ϰ� ���� ���������ʾ���
		
		//����ڰ� ���Ǵ�� ���� ������ ũ��������Ҽ����ִ�
		arrys[0]= new int [2];
		arrys[1]= new int [3];
		arrys[2]= new int [1];
		
		//2�����迭�� ��I�������� �������� ����ũ�⸦ ����¤� ������
		int [][] arrys02 =new int [2][3];
		
		//2���� �迭�� ��2��3 ����,�� ���������
		//ù��° ���� 3���� ���� ���� �����ѿ���
		arrys02[0][0] = 1;
		arrys02[0][1] = 2;
		arrys02[0][2] = 3;
		
		//ù��° ���� 3���� ���� ���� �����ѿ���
				arrys02[1][0] = 11;
				arrys02[1][1] = 22;
				arrys02[1][2] = 13;
				
				//2���� �迭�ּ� �� ���
				 System.out.println("2�����迭:"+arrys02);
				
				 //2�����迭 ù��° ���� �ּҰ��� �������
				 System.out.println("2���� �迭�� 1��:"+arrys02[0]);
				 //2���� �迭 �ι�° ���� �ּҰ��� ����غ�
				 System.out.println("2���� �迭�� 1��:"+arrys02[1]);
		
		
	}

}
