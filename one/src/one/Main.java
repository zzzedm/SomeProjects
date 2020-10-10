package one;


public class Main {
	public static void main(String[] args) {
		int[][] a = {
				{2,1,5,3,2},
				{2,4,5,1,2},
				{1,7,4,8,3,4,7,6,8}
		};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
