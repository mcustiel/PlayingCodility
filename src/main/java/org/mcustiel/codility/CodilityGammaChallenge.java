package org.mcustiel.codility;

// WORK IN PROGRESS

public class CodilityGammaChallenge {

	private static class Count {
		private int count = 0;

		public int get()  {
			return count;
		}

		public void inc() {
			count++;
		}

		public void overflow() {
			count = -1;
		}
	}

	public void leftCount(String S, Count count) {
		if (count.get() > 100000000) {
			count.overflow();
		}
		if (count.get() == -1) {
			return;
		}
		if (S.length() < 2) {
			return;
		}

		if (isPalindrom(S)) {
			count.inc();
		}

		if (S.length() == 2 ) {
			return;
		}

		leftCount(S.substring(0, S.length() - 1), count);

		rightCount(S.substring(1, S.length()), count);
	}

	public void rightCount(String S, Count count) {
		if (count.get() > 100000000) {
			count.overflow();
		}
		if (count.get() == -1) {
			return;
		}

		if (S.length() < 2) {
			return;
		}

		if (isPalindrom(S)) {
			count.inc();
		}

		if (S.length() == 2 ) {
			return;
		}

		rightCount(S.substring(1, S.length()), count);
	}

	public int solution(String S) {
		Count count = new Count();
		leftCount(S, count);
		return count.get();
	}

	private boolean isPalindrom(String string) {
		if (string.length() < 2) {
			return false;
		}

		if (string.length() <= 3) {
			return string.charAt(0) == string.charAt(string.length() - 1);
		}

		if (string.charAt(0) != string.charAt(string.length() - 1)) {
			return false;
		}

		return isPalindrom(string.substring(1, string.length()-1));
	}
}
