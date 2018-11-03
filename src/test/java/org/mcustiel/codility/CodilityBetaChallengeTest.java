package org.mcustiel.codility;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CodilityBetaChallengeTest {
	private CodilityBetaChallenge testee;

	@Before
	public void init() {
		testee = new CodilityBetaChallenge();
	}

	@Test
	public void shouldReturn11() {
		int res = testee.solution(new int[] { 1, 5, 2, 1, 4, 0 });
		assertThat(res, is(11));
	}

	@Test
	public void shouldReturn3() {
		int res = testee.solution(new int[] { 1, 1, 1 });
		assertThat(res, is(3));
	}

	@Test
	public void shouldReturn6() {
		int res = testee.solution(new int[] { 1, 0, 1, 0, 1 });
		assertThat(res, is(6));
	}

	@Test
	public void shouldReturn15() {
		int res = testee.solution(new int[] { 3, 3, 3, 5, 1, 2 });
		assertThat(res, is(15));
	}

	@Test
	public void shouldReturn6b() {
		int res = testee.solution(new int[] { 1, 0, 0, 0, 0, 5 });
		assertThat(res, is(6));
	}
}
