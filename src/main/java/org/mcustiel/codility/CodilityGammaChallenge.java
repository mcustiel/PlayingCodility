package org.mcustiel.codility;

// WORK IN PROGRESS

public class CodilityGammaChallenge {
	public int solution(String S) {
		int palindroms = 0, control = 0, head = 1, tail = S.length()-1;

		//palindroms += isPalindrom(S) ? S.length() / 2 : 0;

		System.out.println("=====");
		System.out.println("Analyzing: " + S);
		System.out.println("=====");

		if (S.length() <= 3) {
			return getPalindromsCount(S);
		}

		while (head <= tail) {
			if (control % 2 == 0) {
				palindroms += getPalindromsCount(S.substring(head, tail))
					+ getPalindromsCount(S.substring(0, head))
					+ getPalindromsCount(S.substring(head, S.length()));
				head++;
			} else {
				palindroms += getPalindromsCount(S.substring(head, tail))
						+ getPalindromsCount(S.substring(0, tail))
						+ getPalindromsCount(S.substring(tail, S.length()));
				tail--;
			}
			control++;
			System.err.println("---");
		}
/*
		for (int i = 0; i < S.length()/2; i++) {
			palindroms += getPalindromsCount(S.substring(i, S.length() - 1 - i))
				+ getPalindromsCount(S.substring(i, (S.length() - 1) / 2))
				+ getPalindromsCount(S.substring((S.length() - 1) / 2, S.length() - 1 - i));
		}
*/
		return palindroms + getPalindromsCount(S);
	}

	private int getPalindromsCount(String string)
	{
		return isPalindrom(string) ? 1 : 0;
	}

	private boolean isPalindrom(String string) {
		System.out.println(string);
		if (string.length() <= 1) {
			return false;
		}

		return string.charAt(0) == string.charAt(string.length() - 1)
				&& (string.length() <= 3 || isPalindrom(
						string.substring(1, string.length() - 1)));
	}


}
