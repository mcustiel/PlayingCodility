package org.mcustiel.codility;

public class CodilityBetaChallenge {
	public int solution(int[] A) {
		int intersect = 0;
		int[] reachCounts = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			intersect += getIntersectingAhead(A, i);
			for (int j = getStartingPoint(A, i); j < i; j++) {
				intersect += reachCounts[j];
			}
			if (intersect > 10000000) {
				return -1;
			}
			reachCounts[getReachIndex(A, i)]++;
		}

		return intersect;
	}

	private int getIntersectingAhead(int[] circlesCollection,
			int currentPosition) {
		return circlesCollection[currentPosition] >= circlesCollection.length
				- currentPosition
						? circlesCollection.length - currentPosition - 1
						: circlesCollection[currentPosition];
	}

	private int getReachIndex(int[] circlesCollection, int currentPosition) {
		return circlesCollection[currentPosition] >= circlesCollection.length
				- currentPosition - 1
						? circlesCollection.length - 1
						: currentPosition + circlesCollection[currentPosition];
	}

	private int getStartingPoint(int[] circlesCollection, int currentPosition) {
		return currentPosition - circlesCollection[currentPosition] < 0
				? 0
				: currentPosition - circlesCollection[currentPosition];
	}
}
