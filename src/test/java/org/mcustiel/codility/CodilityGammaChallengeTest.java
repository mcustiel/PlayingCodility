package org.mcustiel.codility;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

// WORK IN PROGRESS

public class CodilityGammaChallengeTest {
    private CodilityGammaChallenge testee;

    @Before
    public void init() {
    	testee = new CodilityGammaChallenge();
    }

    @Test
    public void testOne() {
    	assertThat(testee.solution("abccba"), is(3));
    }

    @Test
    public void testTwo() {
    	assertThat(testee.solution("abcba"), is(2));
    }

    @Test
    public void testThree() {
    	assertThat(testee.solution("baababa"), is(6));
    }

    @Test
    public void testFour() {
    	assertThat(testee.solution("caabbbaa"), is(7));
    }
}
