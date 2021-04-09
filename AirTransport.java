package AirTransportScanner;

import java.util.*; //import util package that including Scanner class

public class AirTransport {
	Scanner s = new Scanner(System.in);
	
	void printProperties() {
		System.out.print("Enter airline brand\t: ");
		String ab = s.nextLine(); 
		System.out.print("Enter manufactored\t: ");
		String mf = s.nextLine();
		System.out.print("Enter model\t\t: ");
		String m = s.nextLine();
		System.out.print("Enter capacity\t\t: ");
		int c = s.nextInt();
		System.out.print("Are this air transport still in service (Y/N): ");
		char yn = s.next().charAt(0);
		System.out.print("Is this air transport able to move backward? (True/False): ");
		boolean b = s.nextBoolean();
	}
	
	void calcuTravelHour() {
		System.out.print("Enter the speed of the air transport (km/h): ");
		double a = s.nextDouble();
		System.out.print("Enter the flying range of the air transport (km): ");
		double r = s.nextDouble();
		
		double TravelHour= r/a;
		System.out.printf("Total travel hours : %.1fh\n" , TravelHour);
	}

	void calcuFuelConsump() {	
		System.out.print("Enter the fuel consumption (litre/h): ");
		double fc = s.nextDouble();
		System.out.print("Enter the travel hours: ");
		double h = s.nextDouble();
		
		double FuelConsump = h * fc;
		System.out.printf("Total fuel consumption : %.2flitre" , FuelConsump);
	}
	
	void comparison() {	
		System.out.print("\nEnter the maximum speed (km/h): ");
		int max = s.nextInt();
		
		double times = max/508.0 ;
		if (max > 508) 
			System.out.printf("This air transport is %.1f times faster than the world's fastest car.", times);
			
			else
				System.out.printf("This air transport is %.1f times slower than the world's fastest car.", times);
		
	}

}
