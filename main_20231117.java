package day1117;

public class main_20231117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//OK 버튼 객체생성
		Button btnOK =  new Button();
		
		class OkListener implements Button.ClickListener{
			
			@Overrride
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("OK 버튼을 클릭했습니다");
			}
		}
		
		//버튼 객체에 ClickListener 객체 주입 인스턴스 메서드를 호출
		 btnOK.setClickListener(new Button.clickListener() {
			
			@Override
			public void onclick() {
				// TODO Auto-generated method stub
				System.out.println("OK버튼을 클릭했습니다")
			}
		});
		 
		// 버튼 객체 있는 실제로 버튼이 출력되는 이벤트 메서르를 클릭
		 btnOK.click();
		 
		 //버튼 객체를 하나 더생성한다
		 Button btnCancle =  new Button();
		 
		 //객체에 주입하는취소클래스를 만든다 
		 class CancleListener implement Button.ClickListener{
			
			 @Overrride
				public void onClick() {
					// TODO Auto-generated method stub
					System.out.println("취소 버튼을 클릭했습니다");
				}
			 
		 }
		 //객체를 주입한다
		 btnCancle.setClicksistener(new Button.ClickListener());
		 
		 //버튼은 클릭한다
		 btnCancle.click();
		 
		 
		 
		 //자동차객체를 더 생성하자
		 Car car = new Car();
		 //자동차 객체 인스턴스 메서드인 run1 () 호출하자
		 car.run1();
		 // 자동차 객체 인스턴스 메서드  run2 () 호출하자
		 car.run2();
		 
		 //익명 자식 객체가 대입된 매개변수를 사용
		 //method > run3() 메소드를 만들어서 익명자식객체를 메인 재정의
		 //car.method(Tire tire(roll(){System.out.println(익명3)}
		  car.run3(new Tire() {
			  public void roll() {
				  System.out.println("익명자식 객체3가 굴러갑니다");
			  }
		  });
		  
		  
		  //homi 인스턴스 생성
		  Homi homi = new Homi();
		  //호미.use1 호출
		  homi.use1();
		  //호미. use2 호출
		  homi.use2();
	}

}
