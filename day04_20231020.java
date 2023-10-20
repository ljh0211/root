package day4;

import java.util.Scanner;

public class day04_20231020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if문 : 
		//score 변수에 값을 60을 주고
		//score 점수가 60보다 크거나 같을 경우 합격입니다. 출력
	//	int score = 60;
		//if(score >=60) {
			//System.out.println("합격입니다.");
		//
		
		//스캐너 이용 : input
		//나이를 입력하세요 라고 출력하고 입력합니다.
		//나이가 19보다 클경우는 성인입니다 라고 출력해보세요.
		
		//System.out.println("나이를 입력하세요");
		//Scanner scanner = new Scanner(System.in);
		
		//int age = scanner.nextInt(); //입력값을 정수로 받는다.
		//if(age>19) {
			//System.out.println("성인입니다. 입장하세요");
		
		
		//2 if-else : 조건식에 따라 무조건 실행해야하는 명령문이다,
		//number 변수를 선언하고 5을 정의한다.
		//5는 4보다 클경우 크다라고 출력해주고 아닐경우는 작다라고 출력한다.
		
		//int number = 3;
		//if(number>4) {
		//	System.out.println("5는 4보다 크다");
		//}else{
		//	System.out.println("5는 4보다 작다");
		//}//
		
		
		//a와 b를 비교해서 큰값일 경우 max안에 변수로 정의한다.
		//마지막에 맥스에 값에 들어가있는 변수와 max 최대값을 출력한다,
		//int a = 4;
		//int b = 10;
		//int max = 0;
	
		//기준을 a>b 을 기준을 잡아서 조건문으로만든다.
		//if(a>b) {
			//max = a;
		//} else{
		//max = b;
		//}
		//System.out.println("a:"+a+"와 b : "+b+"중에서 큰 수는 " + max +"입니다");

		// else-if : 조건식을 여러개 만들경우 사용한다.
		// 문제1: 좋아하는ㅅ ㅓㄴ택한다. = 변수에 넣는다(7) (변수도 직접 만든다)
		// 1)좋아하는 숫자가 5보다 큰경우는 "좋아하는 숫자가 5보다 큽니다"
		// 2)좋아하는 수자가 7일 경우에만  "좋아하는 숫자는 7입니다"라고 출력하자.
	 
	int fav = 3; //7을 변수에 넣는다.
	
	if(fav==7) {
		System.out.println("좋아하는 숫자가 7입니다");
	}else if(fav>5) {
		System.out.println("좋아하는 숫자는 5보다 큽니다");
	}else {
		System.out.println("좋아하는 숫자는 5보다 작습니다.");
	}
 
	
	//문제 2 : 점수를 입력한다.
	//90보다 크거나 같으면 ="A"를 출력한다.
	//80보다 크거나 같으면 = "B" 를 출력한다
	//70보다 크거나 같으면 = "C"를 출력한다
	//나머지는 "D"를 출력한다
	//Scanner input = new Scanner(System.in);
	//int score_ = input.nextInt(); //점수를 입력받는다.//
	//if-elseif사용해서 학점을 출력해보자.
	
	//if(score_ >= 90) {
		//System.out.println("A");
	//}else if(score_>=80) {
		//System.out.println("B");
	
	//else if(score_>=70) {
		//System.out.println("C");
	
	//else if(score_>=60) {
		//System.out.println("D");
		
// 출력결과 : number 7 입니다 출력하자
	//case 1 : number1입니다. / case7 : number7입니다. / default : 둘다 아니다=break
	int result = 7;
	
	switch(result) {
	case 1:
	System.out.println("number1입니다");
	break;
	case 7:
		System.out.println("number7입니다");
		break;
	default:
		System.out.println("둘다아니다");
	}
	// 문제2 :  월을 입력하고 계절을 출력하자
	//case 3월부터 쓰고 11월까지만 쓰고 계절을 만들어보자
	//ㄴㅇ가ㅓㄱ 계절별로 "현재의 계절은 000입니다"
	//3-5봄 6-8여 9-11가을 12-2 겨울
	System.out.println("현재월을 입력하세요");
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	//case 3월부터 11월까지만 쓰고 계절을 만들어보자.
	//switch = 결과값 = 입력깞 (변수)
	
	switch(month) {
	case 3:
	case 4:
	case 5:
		System.out.println("현재의 계절은 봄입니다");
		break;
	case 6:
	case 7:
	case 8:
		System.out.println("현재의 계절은 여름입니다");
		break;
	case 9:
	case 10:
	case 11:
		System.out.println("현재의 계절은 가을입니다");
		break;
		default:
	//case 12: case1 : case2 
		System.out.println("현재의 계절은 겨울입니다");
		
	}
	
	
}
 
}

	 	




