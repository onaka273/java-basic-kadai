package kadai_015;

public class Car_Chapter15 {
	private int gear  = 1 ;
	private int speed = 10;

	
	public void changeGear(int afterGear) {
		
		if (afterGear >= 1  &&  afterGear <= 5 ) {
			gear = afterGear ;
			speed = afterGear * 10 ;
		}
		else {
			gear = afterGear ;
			speed = 10 ;
		}
	}
	
	public void run() {
		
		 System.out.println( "現在のギアは" + gear + "、" );
		 System.out.println( "速度は時速" + speed + "kmです" );
	}
}
