package org.mcustiel.codility;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BattleshipTest {
    private Battleship task;

    @Before
    public void init() {
	task = new Battleship();
    }

    @Test
    public void hitOneSinkOne() {
	// Because of some unknown reason, this test failed in codility.
	String hits = "2B 2D 3D 4D 4A";
	String ships = "1B 2C, 2D 4D";

	assertThat(task.solution(4, ships, hits), is("1,1"));
    }

    @Test
    public void hitNoneSinkOne() {
	String hits = "1A 2A 2B 4D 1B ";
	String ships = "1A 2B, 5D 7D";

	assertThat(task.solution(10, ships, hits), is("1,0"));
    }

    @Test
    public void hitNoneSinkNone() {
	String hits = "3A 7C 2E 4D 8C ";
	String ships = "1A 2B, 5D 7D";

	assertThat(task.solution(10, ships, hits), is("0,0"));
    }
}
