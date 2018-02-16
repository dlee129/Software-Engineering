package test.edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.qc.seclass.BuggyClass;

public class BuggyClassTestSC2{
	
	/*
	 * Test: buggyMethod2SC2
	 * This will test for 100% statement coverage and not reveal the fault
	 */

	@Test
	public void Test1() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod2(-1,2);
	}

	@Test
	public void Test2() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod2(0,3);
	}

	@Test
	public void Test3() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod2(3,30);
	}


	
}