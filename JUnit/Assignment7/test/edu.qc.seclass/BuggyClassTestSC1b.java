package test.edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.qc.seclass.BuggyClass;

public class BuggyClassTestSC1b{
	
	/*
	 * Test: buggyMethod1SC1b
	 * This will test for less than 50% statement coverage and reveals the fault
	 */

	@Test
	public void Test1() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod1(5,0);
	}

	@Test
	public void Test2() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod1(3,0);
	}

	
}