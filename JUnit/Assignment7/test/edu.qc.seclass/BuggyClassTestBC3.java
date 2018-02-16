package test.edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.qc.seclass.BuggyClass;

public class BuggyClassTestBC3{
	
	/*
	 * Test: buggyMethod2BC
	 * This will test for more than 100% branch coverage and does not reveal the fault
	 */
	@Test
	public void Test1() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod3(15,3);
	}

	@Test
	public void Test2() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod3(1,10);
	}

	@Test
	public void Test3() {
		BuggyClass test = new BuggyClass();
		test.buggyMethod3(-1,10);
	}
	
}