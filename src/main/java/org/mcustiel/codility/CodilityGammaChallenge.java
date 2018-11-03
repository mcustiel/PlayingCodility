package org.mcustiel.codility;

// WORK IN PROGRESS

public class CodilityGammaChallenge {

	public int solution(String S) {
		int length = S.length() - 1;
		int palindroms = 0;
		for (int i = 0; i < length; i++) {
			palindroms += count(S, i, i + 1);
			palindroms += count(S, i, i + 2);
			if (palindroms >= 100000000) {
				return -1;
			}
		}
		return palindroms;
	}

	private int count(String S, int start, int end) {
		if (start < 0 || end >= S.length()) {
			return 0;
		}
		if (S.charAt(start) == S.charAt(end)) {
			return 1 + count(S, start - 1, end + 1);
		}
		return 0;
	}
}
