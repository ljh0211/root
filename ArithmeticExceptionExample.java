package day1117;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술연산자로 계산을 할 경우 산술이 잘못된 처리를 해서 에러가 발생된 경우
		int result = 0;
	
		try {
			result = 10/0;
		}catch(ArithmeticExceptionExample e) {
			//
			System.out.println("0으로 나누기를 할수 없습니다");
		}finally {
			System.out.println(" 프로그램 종료");
		}
		
	}

}
