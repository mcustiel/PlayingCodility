package org.mcustiel.codility;

// WIP
public class CodilityDeltaChallenge {

	public int solution(int A[]) {
		int N = A.length;
		if (N == 0) {
			return 0;
		}

		int minimumAbsVal = Integer.MAX_VALUE;
		int limit = (int) Math.pow(2, (N - 1));

		int currentVal = 0;

		for (int j = 0; j < limit && minimumAbsVal != 0; j++) {
			currentVal = 0;
			for (int i = N - 1; i >= 0; i--) {
				if (((j >> i) & 1) == 0) {
					currentVal += A[i];
				} else {
					currentVal -= A[i];
				}
			}
			currentVal = Math.abs(currentVal);
			if (currentVal < minimumAbsVal) {
				minimumAbsVal = currentVal;
			}
		}

		return minimumAbsVal;
	}
}
