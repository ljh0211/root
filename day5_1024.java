package day05;

public class day5_1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//응용문제3-3 (산술연산자로 값을 바꿔서 출력하는 예제)
		//
		
		int num = 456 ;  //number =456
		System.out.println(456/100*100);
		//실행결과 400
		//자리수 만큼을 나눠서 묶음으로 만들고 묶음에 자리수만큼을 곱해서 = 버림에대한 결과값\
		
		//응용문제3-4
		int apple = 123;
		int apple_bucket = 123/10; //사과의 남은 자루수
		System.out.println(apple_bucket);
		int bucket = apple%10; //사과의 나머지수
		if(bucket>0) {
			apple_bucket += 1;
		}
		System.out.println("필요한 바구니의 수 :"+apple_bucket);
		
		//응용문제 3-5
		int number = -5;
		//삼항연산자 -  코드가 길어져 - 간단한 조건을 물어보기 위해서는 삼항연산자를 사용
		System.out.println(number>0?"양수":(number<0?"음수":0));
		
		//반복문 =for문
		//문제 1 for문을 이용해서 1부터 5까지 출력하자
		//출력결과 :
		//1
		//2
		//3
		//4
		//5
		//12345
		
		for(int i=1; i<=5; i++) {// 1<=5 2<=5 3<=5 4<=5 5<=5
			System.out.println(i);
		}
		for(int i=1; i<=5; i++) {// 1<=5 2<=5 3<=5 4<=5 5<=5
			System.out.print(i);
		}
		System.out.println();
		System.out.println("###########");
		
		//문제 2 랜덤 :1~10 안에서 한가지 숫자가 무작위로 하나출력하는거!
		for(int i=1; i<=5; i++) {
		int value = (int)(Math.random()*10)+1;
		System.out.println(value);
		}
		//문제 3 1부터 100까지 반복하면서 짝수를 구하면 합계로 더해보자
		//두가지 방법
		//1)for문을 2개씩 증가해서 만들수 있다.
		//2)if 조건문으로 2로 나누면 나머지가 0일경우
		//짝수라고 판단
		//*합계를 구해보자 : 짝수를 담을수 있는 변수
		
		//짝수가 나올경우 합계를 구할수 있는 변수 정의
		 int sum = 0;
		 //반복문을 만들자 (초기값, 조건식, 증가식) 조건식 : 1~100까지 출력
		 //1)증가식을 2씩 증가하면서 합계를 출력해보자
		  for(int i=2; i<=100; i+=2) {
			  //System.out.print(i);
			  //sum = sum+i;
			  sum += i;
		  }
		 System.out.println(sum);
		 
		 //2) if 조건문으로 2로 나누면 나머지가 0일경우
		 //1~100까지 반복하고 변수값이 짝수가 되는경우에 조건으로 실행시킨다
		 for(int i=2; i<=100; i++) {
			
			 //짝수일경우 합계를 더하자 i%2==0 (true=짝수) 합계로 들어가요
			
			 if(i%2==0) {
			sum += i;		 
			 }
		 }
		 System.out.println(sum);
		 
		 //중첩for문 : 외부반복문을 내부 반복문 조건이 끝나야 증가한다. 외부반복문의 조건이 끝나면 
		 //모든 for문을 종료된다. 
		 
		 //문제 1 :
		 //1.  1차반복문(for문을 1개만 이용 ) 구구단 2 단을 코드로 만들어보자
		 //2*1=2
		 //2*2=4
		 //2*3=6
		 //2*4=8
		 //2*5=10
		 //2*6=12
		 //2*7=14
		 //2*8=16
		 //2*9=18
		 
		 for(int i=1; i<=9;i++) {
			 System.out.println(i);
			 
			 System.out.println("2 * "+i+"="+(2*i));
		 }
		 //문제 2
		 //1. 2차 반복문 구구단 2~9단을 코드로 만들어보자
		//외부 반복문(2~9) 내부반복문(1~9) : 2*1/2/3/4/5/6/7/8/9
		//외부 반복문(2~9) 내부반복문(1~9) : 3*1/2/3/4/5/6/7/8/9
		//외부 반복문(2~9) 내부반복문(1~9) : 4*1/2/3/4/5/6/7/8/9
		//외부 반복문(2~9) 내부반복문(1~9) : 5*1/2/3/4/5/6/7/8/9
		//외부 반복문(2~9) 내부반복문(1~9) : 6*1/2/3/4/5/6/7/8/9
		//외부 반복문(2~9) 내부반복문(1~9) : 7*1/2/3/4/5/6/7/8/9
		//외부 반복문(2~9) 내부반복문(1~9) : 8*1/2/3/4/5/6/7/8/9
		//외부 반복문(2~9) 내부반복문(1~9) : 9*1/2/3/4/5/6/7/8/9
		 System.out.println();
		 for(int i=2; i<=9; i++) {
			 
			 for(int j=1; j<=9; j++) {
				 //2*1=2 //3*1=3 //4*1=4
				 
				 System.out.print(i+"*"+j+"="+(i*j)+" ");
				 
			 }
			 System.out.println();
		 }
		 
		 //문제 3 : 별찍기
		 //1) 1차 반복문으로 별을찍자
		 //*
		 //**
		 //***
		 //****
		 //*****
		 
		 for(int i=1; i<=1; i++) {System.out.println("*");} System.out.println();
		 for(int i=1; i<=2; i++) {System.out.println("*");} System.out.println();
		 for(int i=1; i<=3; i++) {System.out.println("*");} System.out.println();
		 for(int i=1; i<=4; i++) {System.out.println("*");} System.out.println();
		 for(int i=1; i<=5; i++) {System.out.println("*");}
		 
		 //2차 반복문으로 별을 찍자(외부 for 문 1개 / 내부 for문 1개)
		 //*****
		 //*****
		 //*****
		 //*****
		 //*****
		 
		 for(int i=1; i<=5; i++) {
			 for(int j=1; j<=i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 for(int i=5; i>=1; i--) {System.out.println("*");} System.out.println();
		 for(int i=5; i>=2; i--) {System.out.println("*");} System.out.println();
		 for(int i=5; i>=3; i--) {System.out.println("*");} System.out.println();
		 for(int i=5; i>=4; i--) {System.out.println("*");} System.out.println();
		 for(int i=5; i>=5; i--) {System.out.println("*");} 
		 
		 for(int i=5; i>=1; i--) {
			 for(int j=5; 6-i>0; j--) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}

}
