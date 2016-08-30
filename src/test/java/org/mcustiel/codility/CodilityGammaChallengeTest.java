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
    public void shouldHaveOnePalindromWithTwoChars() {
    	assertThat(testee.solution("aa"), is(1));
    }

    @Test
    public void shouldHaveOnePalindromThreeChars() {
    	assertThat(testee.solution("aba"), is(1));
    }

    @Test
    public void shouldHaveOnePalindromWithOneChar() {
    	assertThat(testee.solution("a"), is(1));
    }

    @Test
    public void shouldNotHavePalindromWithTwoChars() {
    	assertThat(testee.solution("ab"), is(0));
    }

    @Test
    public void shouldNotHavePalindromWithThreeChars() {
    	assertThat(testee.solution("abb"), is(0));
    }

    @Test
    public void shouldNotHavePalindromWithFiveChars() {
    	assertThat(testee.solution("abcde"), is(0));
    }
}
