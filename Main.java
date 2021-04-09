package AirTransportScanner;

public class Main {

	public static void main(String[] args) {
		 AirTransport airplane = new AirTransport(); //create new object from class Phone name as vivo
		 AirTransport helicopter = new AirTransport();//create seccond object from class Phone name as huawei
		 AirTransport privatejet = new AirTransport();
		 AirTransport hotairballoon = new AirTransport();
		 
		 System.out.println("--------------------------------------------------------------------");
		 System.out.println("AIRPLANE PROPERTIES");
		 System.out.println("--------------------------------------------------------------------");
		 airplane.printProperties();
		 System.out.println();
		 airplane.calcuTravelHour();
		 airplane.calcuFuelConsump();	
		 airplane.comparison();
		 
		 System.out.println("\n");
		 System.out.println("--------------------------------------------------------------------");
		 System.out.println("HELICOPTER PROPERTIES");
		 System.out.println("--------------------------------------------------------------------");
		 helicopter.printProperties();
		 System.out.println();
		 helicopter.calcuTravelHour();
		 helicopter.calcuFuelConsump();
		 helicopter.comparison();
		 
		 System.out.println("\n");
		 System.out.println("--------------------------------------------------------------------");
		 System.out.println("PRIVATE JET PROPERTIES");
		 System.out.println("--------------------------------------------------------------------");
		 privatejet.printProperties();
		 System.out.println();
		 privatejet.calcuTravelHour();
		 privatejet.calcuFuelConsump();
		 privatejet.comparison();
		 
		 System.out.println("\n");
		 System.out.println("--------------------------------------------------------------------");
		 System.out.println("HOT AIR BALLOON PROPERTIES");
		 System.out.println("--------------------------------------------------------------------");
		 hotairballoon.printProperties();
		 System.out.println();
		 hotairballoon.calcuTravelHour();
		 hotairballoon.calcuFuelConsump();
		 hotairballoon.comparison();
	
	}
}
