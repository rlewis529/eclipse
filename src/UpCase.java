
class UpCase {
	public static void main(String[] args) {
		char ch;
		
		for (int i=0; i < 10; i++) {
			ch = (char) ('a'+i);
			System.out.print(ch);
			
			//turn off the 6th bit:
			ch = (char) ((int) ch & 65503); 
			
			System.out.print(ch+ " ");
		}
	}
}
