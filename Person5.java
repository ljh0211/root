package day1201;

public class Person5 {

	String a = "홍길동";
	String b = "김길동";
	
	//인스턴스 메소드 --> comparable.compare()추상메소드를 묶어서 구현방법을 만든다
	public void ordering(Comparable comparable) {
		String a = "홍길동";
		String b = "김길동";
		
		int result = comparable.compara(a, b);//인터페이스를 호출한다
		
		if(result<0) {
			System.out.println(a+"은"+b+"보다 앞에 옵니다");
		}else if(result==0) {
			System.out.println(a+"은"+b+"는 같습니다 ");
		}else {
			System.out.println(a+"은"+b+"보다 뒤에 옵니다");
		}
	}
}
