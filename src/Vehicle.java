

class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	
	//Display the range
	//void range() {
		//System.out.println("Range is " + fuelcap * mpg);
		//}
		
	int range() {
		return mpg * fuelcap;
	}
	
	double fuelneeded(int miles) {
		return (double) miles/mpg;
	}
	
}

