/*
A program that uses the vehicle class.
*/

class VehicleDemo2 {
	public static void main (String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		double gallons;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		//System.out.println("Minivan can carry " + minivan.passengers + ".");
		//minivan.range();
		
		//System.out.println("Sportscar can carry " + sportscar.passengers + ".");
		//sportscar.range();
		
		range1 = minivan.range();
		range2 = sportscar.range();
		
		System.out.println("Minivan has a range of " + range1 + " miles.");
		System.out.println("Fuel needed is " + minivan.fuelneeded(range1) + " gallons.");
		
		System.out.println("Sportscar has a range of " + range2 + " miles.");
		System.out.println("Fuel needed is " + sportscar.fuelneeded(range2) + " gallons.");
	}
}
