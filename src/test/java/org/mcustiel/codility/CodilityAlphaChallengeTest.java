package org.mcustiel.codility;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CodilityAlphaChallengeTest {
    private CodilityAlphaChallenge testee;

    @Before
    public void init() {
	testee = new CodilityAlphaChallenge();
    }

    @Test
    public void shouldReturn3() {
	int res = testee.solution(new int[] { 1, 2, 1, 0, 1, 2, 0 });
	assertThat(res, is(3));
    }

    @Test
    public void shouldReturn0() {
	int res = testee.solution(new int[] { 4, 4, 4, 4, 4 });
	assertThat(res, is(0));
    }
}
