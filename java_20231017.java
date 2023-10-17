package section1;
import java.util.Scanner;

public class java_20231017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2일차 자바 공부
		
		//소수  : float /double = 기본적인 프린트
		/**
		 * 실행결과)
		 * 마라톤은 42.195km 달립니다.
		 * 하프 마라톤(=halfmarathon)은 21.0975km 달립니다.
		 */
		
		//마라톤은 변수명을 정의하고 double로 자료형을 선언하자.
		double marathon = 42.195;
		//하프 마라톤 변수명을 정의하고 float로 자료형을 선언하자.
		float halfmarathon = 21.0975f;
		
		System.out.println("마라톤은"+ marathon + "km 달립니다.");
		System.out.println("하프 마라톤은"+ halfmarathon + "km 달립니다.");
		
		//소수 : 정밀도(=표현하는 방식)
		//3.14(고정 소수점) = 3.1415952653589793
		//double / float 선언 pieDouble / pieFlaot
		
	    double piedouble = 3.1415952653589793;
	    float pieFloat = 3.1415952653589793f;
	    System.out.println(piedouble);
	    System.out.println(pieFloat);
	    
	    //char 'a';(캐릭터 한글자만 표현)
	    //char 자료형을 선언 alphabetA = 'A' 선언하고
	    //char 자료형을 선언 alpthbetB = 'B' 선언하고
	    //결과) A=65 B=66
	   int alphabetA = 'A';
	   int alphabetB = 'B';
	    
	   char alphabetC = 'C';
	   char alphabetD = 'D';
	   
	    System.out.println(alphabetA);
	    System.out.println(alphabetB);
	    
	    System.out.println(alphabetC);
	    System.out.println(alphabetD);
	
	    //기본논리형 boolean = 1byte = true /false
	   
	    //학생(=student) 이라는 변수의 이름을 만들고 boolean 형을 선언하고
	    //출력할때 학생이 맞다(=true/false)라는 변수를 선언하자
	    //자료형 변수이름 =  값;
	    //System.out.println();
	    boolean student = true;
	    System.out.println(student);
	    
	    //자동 형 변환
	    //1.char ->short->int->long
	    //2.정수 -> 소수 
	    //int 형  num1 선언한다 14을 값을 저장하세요
	    // double num2 선언하고 num1 대입하세요.
	    // num2 변수를 프린트 하자.
	    
	    int num1 = 14;
	    double num2 = num1;
	    System.out.println(num2);
	    
	    // 강제 형 변환
	    
	    int num3 = 10;
	    byte num4 = (byte)num3;
	    System.out.println(num4); // 손실이 없다. 값의 범위 27-1 = 127
	    
	    int num5 = 1000;
	    byte num6 = (byte)num5;//8bit = 2_7승 = 128-1 = 127
	    System.out.println(num6);//손실이 있다. 자료형에 해당하는 byte (오버플로우)
	    
	    //입력 받기 : new Scanner(system.in);
	    
	    //Scanner 객체선언
	    Scanner input = new Scanner(System.in);
	    
	    //입력받기 (해당 자료형 선언 변수명 = input. 해당자료함수 )
	    //이름 주소 나이 체중을 빈칸으로 구분해서 입력받고 출력하기
	    System.out.println("이름 주소 나이 체중을 빈칸으로 구분해서 입력받고 출력하기");
	    //이름 주소 = String 
	    //나이 = int
	    // 체중 = double
	    String name, address;
	    int age;
	    double weight;
	    
	    name = input.next(); // 이름
	    address = input.next(); //주소
	    age = input.nextInt();
	    weight = input.nextDouble();
	    
	    System.out.println("당신의 이름은"+name+"입니다.");
	    System.out.println("당신의 주소" +address+"입니다.");
	    System.out.println("당신의 나이" +age+"입니다.");
	    System.out.println("당신의 체중" + weight+"입니다.");
	}

}
