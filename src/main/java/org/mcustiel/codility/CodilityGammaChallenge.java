package org.mcustiel.codility;

// WORK IN PROGRESS

public class CodilityGammaChallenge {

	public int solution(String S) {
		int length = S.length();
		int end = length - 2;
		int palindroms = 0;
		int i = end, j;
		int[][] check = new int[length][length];
		int[] items = new int[length];

		if (length > 0) {

			char[] characters = S.toCharArray();

			if (characters[i] == characters[i + 1]) {
				if (i > 0) {
					check[i - 1][items[i - 1]++] = 3;
				}
				palindroms++;
			}
			end--;

			for (i = end; i >= 0; i--) {
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
				if (palindroms > 100000000) {
					return -1;
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
		}
		return palindroms;
	}
}
