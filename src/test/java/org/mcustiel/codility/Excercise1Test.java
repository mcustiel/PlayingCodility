package org.mcustiel.codility;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Excercise1Test {
    private Exercise1 task;

    @Before
    public void init() {
	task = new Exercise1();
    }

    @Test
    public void testFromCodility() {
	String hits = "2B 2D 3D 4D 4A";
	String ships = "1B 2C, 2D 4D";

	assertThat(task.solution(4, ships, hits), is("1,1"));
    }

    @Test
    public void failing() {
	String hits = "2B 2D 3D 4D 4A";
	String ships = "1A 2C, 2D 4D";

	assertThat(task.solution(10, ships, hits), is("1,1"));
    }
}
