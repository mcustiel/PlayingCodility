package org.mcustiel.codility;

// WORK IN PROGRESS

public class CodilityGammaChallenge {

	public int solution(String S) {
		int length = S.length();
		int end = length - 2;
		int palindroms = 0;
		int i = end, j;
		int[][] check = new int[length][length/2];
		int[] items = new int[length/2];

		if (length > 1) {

			char[] characters = S.toCharArray();

			if (characters[i] == characters[i + 1]) {
				if (i > 0) {
					check[i - 1][items[i - 1]++] = 3;
				}
				palindroms++;
			}
			end--;

			for (i = end; i >= 0 && palindroms <= 100000000; i--) {
				if (characters[i] == characters[i + 1]) {
					if (i > 0) {
						check[i - 1][items[i - 1]++] = 3;
					}
					palindroms++;
				}
				if (characters[i] == characters[i + 2]) {
					if (i > 0) {
						check[i - 1][items[i - 1]++] = 4;
					}
					palindroms++;
				}

				for (j = 0; j < items[i]; j++) {
					if (i + check[i][j] < length && characters[i] == characters[i + check[i][j]]) {
						palindroms++;
						if (i > 0) {
							check[i - 1][items[i - 1]] = check[i][j] + 2;
							items[i - 1]++;
						}
					}
				}
			}
			if (palindroms > 100000000) {
				return -1;
			}
		}
		return palindroms;
	}
}
