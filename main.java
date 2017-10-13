
public class main {

	public static void main(String[] args) {
		System.out.print(doCalc(0, 1, 23));

	}
	
	static long doCalc (long startingA, long startingB, int recurValue){
		long value = 0;
		
		for(int i = 0; i < recurValue; i++){
			value = startingA + startingB;
			startingA = startingB;
			startingB = value;
		}
		
		return value;
	}

}

