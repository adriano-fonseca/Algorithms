package datastructures.examples.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author adriano-fonseca
 *
 *         The follow pattern to name the unit tests
 * 
 *         When_StateUnderTest_Expect_ExpectedBehavior
 */

public class SolutionTest {
	Solution sol = new Solution();

	@Test
	public void whenRolledbackExpectSevenOnTop() {
		sol.getTransactionalStack().push(4);
		sol.getTransactionalStack().begin(); // start transaction 1
		sol.getTransactionalStack().push(7); // stack: [4,7]
		sol.getTransactionalStack().begin(); // start transaction 2
		sol.getTransactionalStack().push(2); // stack: [4,7,2]
		sol.getTransactionalStack().rollback();// == true; (rolled back transaction 2)
		Assert.assertEquals(7, sol.getTransactionalStack().top());// == 7; // stack: [4,7]
	}

	@Test
	public void whenCommitedExpectTenOnTop() {
		sol.getTransactionalStack().push(4);
		sol.getTransactionalStack().begin(); // start transaction 1
		sol.getTransactionalStack().push(7); // stack: [4,7]
		sol.getTransactionalStack().begin(); // start transaction 2
		sol.getTransactionalStack().push(2); // stack: [4,7,2]
		sol.getTransactionalStack().begin(); // start transaction 3
		sol.getTransactionalStack().push(10); // stack: [4,7,2, 10]
		sol.getTransactionalStack().commit(); // == true; (transaction 3 is committed)
		Assert.assertEquals(10, sol.getTransactionalStack().top()); // == 10 stack: [4,7,2, 10]
	}

	@Test
	public void whenCommitedExpectTwoOnTop() {
		sol.getTransactionalStack().push(4);
		sol.getTransactionalStack().begin(); // start transaction 1
		sol.getTransactionalStack().push(7); // stack: [4,7]
		sol.getTransactionalStack().begin(); // start transaction 2
		sol.getTransactionalStack().push(2); // stack: [4,7,2]
		sol.getTransactionalStack().commit();// == true; (transaction 3 is committed)
		Assert.assertEquals(2, sol.getTransactionalStack().top());// == 7; // stack: [4,7]
	}

	@Test
	public void whenCommitedExpectFalse() {
		sol.getTransactionalStack().push(4);
		sol.getTransactionalStack().begin(); // start transaction 1
		sol.getTransactionalStack().push(7); // stack: [4,7]
		sol.getTransactionalStack().begin(); // start transaction 2
		sol.getTransactionalStack().push(2); // stack: [4,7,2]
		sol.getTransactionalStack().rollback();// == true; (rolled back transaction 2)
		sol.getTransactionalStack().begin(); // start transaction 3
		sol.getTransactionalStack().push(10); // stack: [4,7,10]
		sol.getTransactionalStack().commit();// == true;  (transaction 3 is committed)
		sol.getTransactionalStack().rollback();// == true; (rolled back transaction 1)
		Assert.assertEquals(false, sol.getTransactionalStack().commit());// == false; (there is no open transaction)
	}

}
