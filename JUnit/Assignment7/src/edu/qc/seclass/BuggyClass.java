package edu.qc.seclass;

public class BuggyClass{
	
	/*
	 * Task 1: Create a class method:
	 * 1) with a test suite that is possible to achieve 100% statement coverage and does not reveal the fault
	 * 2) with a test suite that is possible to achieve less than 50% statement coverage and reveals the fault
	 */
	public int buggyMethod1(int x, int y) {
		int result = x/y;
		x = x + y;
		return result;
	}
	
	/*
	 * Task 2: Create a class method:
	 * 1) with a test suite that is possible to achieve 100% statement coverage and does not reveal the fault
	 * 2) with every test suite that is possible to achieve more than 50% branch coverage and reveals the fault
	 */
	public void buggyMethod2(int x, int y) {
		if(x < 0) {
			x = x + y;
		}
		x = x/y;
	}
	
	/*
	 * Task 3: Create a class method:
	 * 1) with a test suite that is possible to achieve 100% branch coverage and does not reveal the fault
	 * 2) with a test suite that is possible to achieve 100% statement coverage,
	 * does not achieve 100% branch coverage and reveals the fault
	 */
	public void buggyMethod3(int x, int y) {
		if(x > y) {
			x = x + y;
		}
		else if(x > 0){

		}else {
			x =  x / y;
		}
	}

	/*
	 * Task 4: Create a class method:
	 * 1) every test suite that is possible to achieve 100% statement coverage and does reveal the fault
	 * 2) with a test suite that is possible to achieve 100% branch coverage and does not reveal the fault
	 */
	public void buggyMethod4(int x, int y) {
		/*
		This task is not possible to create such a method. The reason why it is not possible is because
		reaching 100% statement coverage also infers reaching 100% branch coverage. In order to achieve the first requirement,
		there will be a line to execute a division specifically by 0. To go over and execute each line once,
		that will include going through all the decisions and branches as well, while going over each statement.
		It is impossible to cover all the branches without covering all the statements since branch coverage has a
		stronger subsumption than statement coverage.
		 */
	}

	/*
	 * Task 5: Create a class method:
	 * 1) with a test suite that is possible to achieve 100% statement coverage
	 * 2) with a test suite that the division by zero fault cannot be revealed by any test suite
	 */
	public void buggyMethod5 (int i) {
		/*
		Creating this method is not possible to satisfy the coverage requirements. In order to achieve 100% statement coverage,
		each line in the method needs to be executed atleast once through the test suite. With the the second requirement that
		the division by zero fault cannot be revealed by any test suite, that is not possible since any test suite covers
		all the possible test cases and any number of decisions will have its branch executed once. If every branch is executed
		atleast once and a test suite with 100% statement is possible, it is not possible to avoid executing line 4 and revealing
		the division by zero fault under every possible test suite. Because branch coverage is a stronger subsumption than statement coverage,
		putting the fault at line 4 under any branch with 100% statement coverage will still have the fault be revealed. If you decide to put
		the fault outside of a decision/branch, then the fault at line 4 will be revealed, not satisfying the first requirement of a test suite
		of having 100% statement coverage since the fault will stop the last line of code of being executed.g
		 */
	}
	
	
}