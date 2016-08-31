package org.mcustiel.codility;

// WORK IN PROGRESS

public class CodilityGammaChallenge {
	public int solution(String S) {
		int palindroms = 0;

		palindroms += isPalindrom(S) ? S.length() / 2 : 0;

		System.out.println("----");

		/*for (int i = 1; i < S.length(); i++) {

		}*/

		return palindroms;
	}

	private boolean isPalindrom(String string) {
		System.out.println(string);

		return string.charAt(0) == string.charAt(string.length() - 1)
				&& (string.length() <= 3 || isPalindrom(
						string.substring(1, string.length() - 1)));
	}
}
