package org.mcustiel.codility;

public class CodilityGammaChallenge {

	public int solution(String S) {
		int stringLength = S.length(), palindromes = 0;
		int i, j;
		int[][] palindromesIndexes = new int[2][stringLength];
		int[] palindromesEndIndexes = new int[2];
		int curPos, nextPos;
		// Cache to accelerate array access
		int[] nextIndexes, endIndexes;
		int nextCount, currentCount;
		int currentEndIndex;

		if (stringLength > 1) {
			char[] characters = S.toCharArray();

			for (i = stringLength - 1; i > 0; i--) {
				curPos = i % 2;
				nextPos = (i - 1) % 2;
				nextCount = 0;
				nextIndexes = palindromesIndexes[nextPos];
				endIndexes = palindromesIndexes[curPos];
				currentCount = palindromesEndIndexes[curPos];

				for (j = 0; j < currentCount; j++) {
					currentEndIndex = endIndexes[j];
					if (currentEndIndex < stringLength && characters[i] == characters[currentEndIndex]) {
						palindromes++;
						nextIndexes[nextCount] = currentEndIndex + 1;
						nextCount++;
					}
				}
				nextIndexes[nextCount++] = i;
				nextIndexes[nextCount++] = i + 1;
				palindromesEndIndexes[nextPos] = nextCount;
			}
			if (i == 0) {
				endIndexes = palindromesIndexes[i];
				currentCount = palindromesEndIndexes[i];
				for (j = 0; j < currentCount; j++) {
					currentEndIndex = endIndexes[j];
					if (currentEndIndex < stringLength && characters[i] == characters[currentEndIndex]) {
						palindromes++;
					}
				}
			}
			if (palindromes > 100000000) {
				return -1;
			}
		}

		return palindromes;
	}
}
