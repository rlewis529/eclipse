
class Phone {
	public static void main (String args[]) {
		String numbers[][] = {
			{"Tom", "111-1111"},
			{"Mary", "222-2222"},
			{"Jon", "333-3333"},
			{"Rachel", "444-4444"}
			};
		
		int i;
		
		if (args.length != 1)
			System.out.println("Usage: java Phone <name>");
		else {
			for( i =0; i< numbers.length; i++) {
				if(numbers[i][0].equals(args[0])) {
					System.out.println(numbers[i][0] + ": " + numbers[i][1]);
					break;
				}
			}
		if (i == numbers.length)
			System.out.println("Name not found.");
		}
	}
}


			