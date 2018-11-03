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

    @Test
    public void testFive() {
    	assertThat(testee.solution(""), is(0));
    }
    @Test
    public void testNein() {
    	assertThat(testee.solution("a"), is(0));
    }

    @Test
    public void testSix() {
    	assertThat(testee.solution("ab"), is(0));
    }

    @Test
    public void testSeven() {
    	assertThat(testee.solution("bb"), is(1));
    }

    @Test
    public void testEight() {
    	assertThat(testee.solution("bab"), is(1));
    }

    @Test
    public void testTen() {
    	assertThat(testee.solution(
    			new String(new char[1000]).replace("\0", "a") +
    			new String(new char[1000]).replace("\0", "b") +
    			new String(new char[1000]).replace("\0", "c")),
			is(1498500));
    }
}
