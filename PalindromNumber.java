public class PalindromNumber{
	public static void main(String[] args){

		int n = 5;

		for(int i = 1; i<=n; i++){ // for rows
			for(int j=1; j<=n-i; j++){ // for space ____1
				System.out.print("_");
			}
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			for(int j=i-1 ; j>=1; j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

//     1    
//    212
//   32123
//  4321234
// 543212345