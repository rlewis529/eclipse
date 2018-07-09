
class ErrorMsg {
	final int OUTERR	 = 0;
	final int INERR 	 = 1;
	final int DISKERR 	 = 2;
	final int INDEXERR 	 = 3;
	
	String msg[] = {
		"Output Error" ,
		"Input Error" , 
		"Disk Full" , 
		"Index out of bounds"
	};
	
	String getErrorMsg(int i) {
		if( i >= 0 & i < msg.length) 
			return msg[i];
		else 
			return "Invalid Error Codde";
	}
}

class FinalD {
	public static void main(String args[]) {
		ErrorMsg err = new ErrorMsg();
		
		System.out.println(err.getErrorMsg(err.OUTERR));
		System.out.println(err.getErrorMsg(err.DISKERR));
	}
}

	