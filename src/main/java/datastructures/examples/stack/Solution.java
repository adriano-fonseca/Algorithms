package datastructures.examples.stack;

import java.util.Stack;

public class Solution {
	private TransactionalStack transactionalStack = new TransactionalStack();

	public static void main(String[] as) {
		Solution sol = new Solution();

		sol.getTransactionalStack().push(4);
		sol.getTransactionalStack().begin(); // start transaction 1
		sol.getTransactionalStack().push(7); // stack: [4,7]
		sol.getTransactionalStack().begin(); // start transaction 2
		sol.getTransactionalStack().push(2); // stack: [4,7,2]
		System.out.println(sol.getTransactionalStack().rollback());// == true; // rollback transaction 2
		System.out.println(sol.getTransactionalStack().top());// == 7; // stack: [4,7]
		sol.getTransactionalStack().begin(); // start transaction 3
		sol.getTransactionalStack().push(10); // stack: [4,7,10]
		System.out.println(sol.getTransactionalStack().commit());// == true; // transaction 3 is committed
		System.out.println(sol.getTransactionalStack().top()); // == 10;
		System.out.println(sol.getTransactionalStack().rollback());// == true; // rollback transaction 1
		System.out.println(sol.getTransactionalStack().top());// == 4; // stack: [4]
		System.out.println(sol.getTransactionalStack().commit());// == false; // there is no open transaction
	}
	
	public TransactionalStack getTransactionalStack() {
		return transactionalStack;
	}

	public void setTransactionalStack(TransactionalStack transactionalStack) {
		this.transactionalStack = transactionalStack;
	}

	class TransactionalStack {

		private Stack<Integer> content;
		private Stack<TransactionalStack> transactions;

		public TransactionalStack() {
			this(false);
		}

		private TransactionalStack(boolean internal) {
			content = new Stack<Integer>();
			if (!internal) {
				transactions = new Stack<TransactionalStack>();
				transactions.push(this);
			}
		}

		public void push(int value) {
			transactions.peek().content.push(value);
		}

		public int top() {
			Stack<Integer> cn = transactions.peek().content;
			return cn.empty() ? 0 : cn.peek();
		}

		public int pop() {
			Stack<Integer> cn = transactions.peek().content;
			return cn.empty() ? 0 : cn.pop();
		}

		public void begin() {
			TransactionalStack newTransaction = new TransactionalStack();
			newTransaction.content = (Stack<Integer>) content.clone();
			transactions.add(newTransaction);
		}

		public boolean rollback() {
			TransactionalStack lastTransaction = transactions.peek();
			if (lastTransaction != this) {
				transactions.pop();
				return true;
			}
			return false;
		}

		public boolean commit() {
			TransactionalStack lastTransaction = transactions.peek();
			if (lastTransaction != this) {
				lastTransaction = transactions.pop();
				transactions.peek().content = lastTransaction.content;
				return true;
			}
			return false;
		}

		public Stack<Integer> getContent() {
			return content;
		}

		public void setContent(Stack<Integer> content) {
			this.content = content;
		}

		public Stack<TransactionalStack> getTransactions() {
			return transactions;
		}

		public void setTransactions(Stack<TransactionalStack> transactions) {
			this.transactions = transactions;
		}
	}
}
