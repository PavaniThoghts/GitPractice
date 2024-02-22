package Interface;

public class interfaceDemo implements Demo,Demo1 {
	public static void main(String[] args) {
		Demo a = new interfaceDemo();
		a.traffic();
		a.signals();
		Demo1 a1 = new interfaceDemo();
		a1.green();
		a1.grey();
		a1.yellow();
		
		interfaceDemo a2 = new interfaceDemo();
		a2.red();
		a2.yellow();
	}

	@Override
	public void traffic() {
		// TODO Auto-generated method stub
		System.out.println("follow the traffic rules");
		
	}

	@Override
	public void signals() {
		// TODO Auto-generated method stub
		System.out.println("follow the signals");
	}

	@Override
	public void fine() {
		// TODO Auto-generated method stub
		System.out.println("pay the traffice fines");
		
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red for stop");
		
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green for go");		
	}

	@Override
	public void grey() {
		// TODO Auto-generated method stub
		System.out.println("white box and black box testing is grey box testing");
		
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("ready to move");
	}
	
	

}
