package day1201;

public interface Calculable {

	void calculate(int x, int y);

	}
interface workble
void work();

}

class Person3{
	public void action(workble workble) {
		workble.work();
	}
}

class Person4{
	
	public void action(Calculable calculable) {
		double result = calculable.calculate(10,4);
		System.out.println(result);
	}
}

class Computer2{
	//클래스 : 인스턴스/클래스 메소드를 사용한느방법으로만든다
	
	//인스턴스메소드
	public double instacestaticMethod(double x, double y ) {
		return x+y;
	}
	
	//클래스메소드
	public static double staticMethod(double x, double y) {
		return x+y;
	}
}