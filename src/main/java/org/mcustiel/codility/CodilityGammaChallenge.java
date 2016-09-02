package org.mcustiel.codility;

// WORK IN PROGRESS

public class CodilityGammaChallenge {
	public int solution(String S) {
		int palindroms = 0, control = 0, head = 1, tail = S.length()-1;


	    palindroms = getPalindromsCount(S);

		if (S.length() > 3) {
			while (head <= tail) {
				if (control % 2 == 0) {
					palindroms += getPalindromsCount(S.substring(head, tail))
						+ getPalindromsCount(S.substring(0, head))
						+ getPalindromsCount(S.substring(head, S.length()))
						+ getPalindromsCount(S.substring(head, S.length()/2+1));
					head++;
				} else {
					palindroms += getPalindromsCount(S.substring(head, tail))
							+ getPalindromsCount(S.substring(0, tail))
							+ getPalindromsCount(S.substring(tail, S.length()))
							+ getPalindromsCount(S.substring(S.length()/2+1, tail));
					tail--;
				}
				control++;
			}
		}
		return palindroms;
	}

	private int getPalindromsCount(String string)
	{
		System.out.println("Verifying if palindrom '" + string + "': " + (isPalindrom(string) ? "Yes":"No"));
		return isPalindrom(string) ? string.length()/2: 0;
	}

	private boolean isPalindrom(String string) {
		if (string.length() <= 1) {
			return false;
		}

		return string.charAt(0) == string.charAt(string.length() - 1)
				&& (string.length() <= 3 || isPalindrom(
						string.substring(1, string.length() - 1)));
	}


}
