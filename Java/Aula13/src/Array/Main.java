package Array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int [2][2];		
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		/* 00 = 1
		 * 01 = 2
		 * 10 = 3
		 * 11 = 4
		 */
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}

	}
}