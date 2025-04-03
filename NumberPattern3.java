public class NumberPattern3{
	public static void main(String [] args){

		int rows = 5;

		for(int i=1; i<=rows; i++){ // i: outer loop i print rows;
			for(int j=1; j<=i; j++){
				System.out.print(i + " "); // j: inner loops, j print numbers;
			}
			System.out.println();
		}
	}
}