package org.mcustiel.codility;

// WORK IN PROGRESS

public class CodilityGammaChallenge {

	public int solution(String S) {
		int length = S.length();
		int end = length - 1;
		int palindroms = 0;
		for (int i = 0; i < end; i++) {
			palindroms += count(S, i, i + 1, length, palindroms);
			palindroms += count(S, i, i + 2, length, palindroms);
			if (palindroms > 100000000) {
				return -1;
			}
		}
		return palindroms;
	}

	private int count(String S, int start, int end, int length, int palindroms) {
		if (start < 0 || end - length == 0 || S.charAt(start) != S.charAt(end) || palindroms > 100000000) {
			return 0;
		}
		return 1 + count(S, start - 1, end + 1, length, palindroms+1);
	}
}
