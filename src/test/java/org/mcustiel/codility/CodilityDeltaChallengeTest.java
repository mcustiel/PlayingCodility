package org.mcustiel.codility;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CodilityDeltaChallengeTest {
	private CodilityDeltaChallenge testee;

	@Before
	public void init() {
		testee = new CodilityDeltaChallenge();
	}

	@Test
	public void test1() {
		assertThat(testee.solution(new int[] {}), is(0));
	}

	@Test
	public void test2() {
		assertThat(testee.solution(new int[] { 5 }), is(5));
	}

	@Test
	public void test3() {
		assertThat(testee.solution(new int[] { 5, 8 }), is(3));
	}

	@Test
	public void test4() {
		assertThat(testee.solution(new int[] { 5, 8, 8 }), is(5));
	}

	@Test
	public void test5() {
		assertThat(testee.solution(new int[] { 5, 5, 8 }), is(2));
	}

	@Test
	public void test6() {
		assertThat(testee.solution(new int[] { 4, 6, 8, 11 }), is(1));
	}

	@Test
	public void test7() {
		assertThat(testee.solution(new int[] { 10, 20, 30, -40 }), is(0));
	}

	@Test
	public void test8() {
		int[] a = new int[15000];
		for (int i = 0; i < 15000; i++) {
			a[i] = (i % 100) * (Math.random() >= 0.5 ? 1 : -1);
		}
		testee.solution(a);
	}
}
