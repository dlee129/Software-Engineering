package test.edu.qc.seclass;

import org.junit.Test;

import edu.qc.seclass.BuggyClass;


public class BuggyClassTestSC1a{
	
	/*
	 * Test: buggyMethod1SC1a
	 * This will test for 100% statement coverage and not reveal the fault
	 */
	@Test
	public void Test1() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod1(10,1);
	}

	@Test
	public void Test2() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod1(20,4);
	}


}