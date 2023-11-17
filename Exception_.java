package day1117;

public class Exception_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.NULLPointerException : 객체를 선언하면 인스턴스 주소가
		//가지게 되는데 객체는 정의 되는데 실제 메모리가 없ㄱ는상태
		System.out.println("#######NullpointerException########");
		
		String[]strArray = null;
		System.out.println("strArray[0]:"+strArray[0]);
		//2. NumberFormateExcption :  잘못된 숫자로 형변황이
		//발생하거나 숫자의 형태의 문자열은 정수타입으로 가능하나
		//실수형은 문자형으로 변환할때 오류가 생김
		System.out.println("#######NumberFormateException########");
		String str01 = "11";
		int num01 = Interger.porseInt(str01);
		System.out.println("String int"+num01);
		//int num02 = Integer.porseInt(str02);
		//.3. ArrayIndexOutofVoundsExcption :  배열에서 인덱스
		//범위에서 초과할대 발생하는 오류이다
		System.out.println("#######ArrayIndexOutofBoundsException########");
		int[] arr = {1,6,7,9,10};
		System.out.println(arr[6]);
	}

}
