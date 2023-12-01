package day1201;

//Runnable
class WhiteFlag implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("백기올려");
		}
	}
}

class MyTask extends Thread implements Runnable{
	public MyTask() {
		setName("my-Task-1");
	}
	
	public void run() {
		String threadName = Thread.currentThread().getName();
		while(true) {
			System.out.println(threadName);
		}
	}
}

public class thread_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Runnable 이용해 스레드 만들기
		Thread write = new Thread(new WhiteFlag());
		write.start();//스레드가 시작된다
		
		//2. 익명 클래스를 람다식 표현
		Runnable bluewrite = ()->{
			while(true) {
				System.out.println("청기올려");
			}
		};
		
		
		Thread whiteFlag = new Thread(bluewrite);
		//whiteFlag.start();
		
		
		//3.스레드 이름을 부여한 멀티 스레드 만들기
		Thread MyTask = new Thread (new MyTask());
		
		//1스레드 동기화처리
	}

}
