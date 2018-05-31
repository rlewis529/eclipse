
class DWDemo {
	public static void main (String[] args) 
		throws java.io.IOException {
			char ch;
			char ignore;
			
			do {
				System.out.print("Press a key followed by ENTER: ");
				ch = (char) System.in.read(); //get a char
				do {
					ignore = (char) System.in.read();
				} while (ignore != '\n');
			} while ( ch != 'q' );
		}
}
