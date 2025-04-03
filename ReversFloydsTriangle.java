public class ReversFloydsTriangle{
	public static void main(String [] args){

		int n = 5;
		int num = 1;

		int totalnumbers = (n*(n-1)/2);  // (5*(5+1)/2) = 15 --> 1+2+3+4+5=15;

		for(int i=n; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

	}
}