package day1201;

public class thread_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String threadname = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름"+ threadname);
	}

}
