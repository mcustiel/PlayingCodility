package org.mcustiel.codility;

// WORK IN PROGRESS

public class CodilityGammaChallenge {

	public int solution(String S) {
		int length = S.length(), end = length - 2, palindromes = 0;
		int i = end, j;
		int[][] check = new int[length][length];
		int[] items = new int[length];

		if (length > 1) {
			char[] characters = S.toCharArray();

			for (i = length-1; i > 0 && palindromes <= 100000000; i--) {
				for (j = 0; j < items[i]; j++) {
					if (i + check[i][j] < length && characters[i] == characters[i + check[i][j]]) {
						palindromes++;
						if (i > 0) {
							check[i - 1][items[i - 1]] = check[i][j] + 2;
							items[i - 1]++;
						}
					}
				}
				check[i - 1][items[i - 1]++] = 1;
				check[i - 1][items[i - 1]++] = 2;
			}
			if (i == 0) {
				for (j = 0; j < items[i]; j++) {
					if (i + check[i][j] < length && characters[i] == characters[i + check[i][j]]) {
						palindromes++;
					}
				}
			}
		}

		if (palindromes > 100000000) {
			return -1;
		}
		return palindromes;
	}
}
