package com.ziroby.hackerrank;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.ziroby.hackerrank.Solution;

/**
 * This is a sample parameterized test. Parameterized tests allow you to check
 * more scenarios with less code, and almost no duplicate coded
 *
 * @author Ron Ziroby Romero
 *
 */
@RunWith(Parameterized.class)
public class SolutionTest {
	private final static Object[][] data = {
	        {"Simple Test", "1 \n 1\n 1 2 \n", "1"},
            {"Less Simple Test",
	            "3 \n"
	            + "1\n"
	            + "1 2\n"
	            + "2 \n"
	            + "1 2 \n"
	            + "2 3 \n"
	            + "1 \n"
	            + "4 5 \n", "1\n1\n1"},
	};

    @Parameters(name="{0}")
    public static Object[][] getData() {
        return data;
    }


    @Parameter(0)
    public static String name;

	@Parameter(1)
    public static String input;

    @Parameter(2)
    public static String expected;


	@Test
	public void test() {
	    String actual = new Solution().solve(input);
		assertThat(actual, equalTo(expected));
	}
}
