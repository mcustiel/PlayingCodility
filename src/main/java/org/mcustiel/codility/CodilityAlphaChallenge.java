package org.mcustiel.codility;

public class CodilityAlphaChallenge {
	public int solution(int[] A) {
		int[] help = new int[A.length];
		int lastAddedIndex = -1;

		for (int i = 0; i < A.length; i++) {
			if (help[A[i]] == 0) {
				lastAddedIndex = i;
				help[A[i]] = 1;
			}
		}
		return lastAddedIndex;
	}
}
