package array;

public class AddTwoMetricesArr {
	public static void showArray() {
		int a[][]= {{9,8,7},{1,2,3},{4,5,5}};
		int b[][]= {{1,2,3},{4,5,7},{6,8,9}};
		int c[][]=new int[3][3];//3 rows and 3 columns result will be store here
 

		//add  and print c
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				c[i][j]= a[i][j] + b[i][j];
					System.out.print(c[i][j]+ "  ");
					
				}
			System.out.println();
	}	
		//System.out.println("------------------------------------");
		//subtract and print c
		/*for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				c[i][j]= a[i][j] - b[i][j];
					System.out.print(c[i][j]+ "  ");
					
				}
			System.out.println();
	}	*/

	}
	

	public static void main(String[] args) {
		showArray();  

	}

}
