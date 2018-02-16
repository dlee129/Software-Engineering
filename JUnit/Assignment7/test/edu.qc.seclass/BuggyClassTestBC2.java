package test.edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.qc.seclass.BuggyClass;

public class BuggyClassTestBC2{
	
	/*
	 * Test: buggyMethod2BC
	 * This will test for more than 50% branch coverage and reveals the fault
	 */

	@Test
	public void Test1() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod2(-1,-2);
	}

	@Test
	public void Test2() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod2(30,3);
	}

	@Test
	public void Test3() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod2(3,0);
	}


	
}