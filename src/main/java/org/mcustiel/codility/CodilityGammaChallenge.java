package org.mcustiel.codility;

// WORK IN PROGRESS

public class CodilityGammaChallenge {

	/**
	 * @param S
	 * @return
	 */
	public int solution(String S) {
		int stringLength = S.length(), palindromes = 0;
		int i, j;
		int[][] palindromesIndexes = new int[2][stringLength];
		int[] palindromesToCheck = new int[2];
		int curPos, nextPos;

		if (stringLength > 1) {
			char[] characters = S.toCharArray();

			for (i = stringLength - 1; i > 0; i--) {
				curPos = i % 2;
				nextPos = (i - 1) % 2;
				palindromesToCheck[nextPos] = 0;

				for (j = 0; j < palindromesToCheck[curPos]; j++) {
					if (palindromesIndexes[curPos][j] < stringLength
							&& characters[i] == characters[palindromesIndexes[curPos][j]]) {
						palindromes++;
						palindromesIndexes[nextPos][palindromesToCheck[nextPos]] = palindromesIndexes[curPos][j] + 1;
						palindromesToCheck[nextPos]++;
					}
				}
				palindromesIndexes[nextPos][palindromesToCheck[nextPos]++] = i;
				palindromesIndexes[nextPos][palindromesToCheck[nextPos]++] = i + 1;
			}
			if (i == 0) {
				for (j = 0; j < palindromesToCheck[i]; j++) {
					if (palindromesIndexes[i][j] < stringLength
							&& characters[i] == characters[palindromesIndexes[i][j]]) {
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
