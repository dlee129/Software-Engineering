package test.edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.qc.seclass.BuggyClass;

public class BuggyClassTestSC3{
	
	/*
	 * Test: buggyMethod2BC
	 * This will test for more than 50% branch coverage and reveals the fault
	 */
	@Test
	public void Test1() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod3(10,2);
	}

	@Test
	public void Test2() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod3(-1,0);
	}
	
}