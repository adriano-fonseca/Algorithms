package datastructures.examples.stack;

import java.util.Stack;

public class TransactionalStackExt {

	private Stack<Integer> content;
	private Stack<TransactionalStackExt> transactions;

	public TransactionalStackExt() {
		this(false);
	}

	private TransactionalStackExt(boolean internal) {
		content = new Stack<Integer>();
		if (!internal) {
			transactions = new Stack<TransactionalStackExt>();
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
		TransactionalStackExt newTransaction = new TransactionalStackExt();
		newTransaction.content = (Stack<Integer>) content.clone();
		transactions.add(newTransaction);
	}

	public boolean rollback() {
		TransactionalStackExt lastTransaction = transactions.peek();
		if (lastTransaction != this) {
			transactions.pop();
			return true;
		}
		return false;
	}

	public boolean commit() {
		TransactionalStackExt lastTransaction = transactions.peek();
		if (lastTransaction != this) {
			lastTransaction = transactions.pop();
			transactions.peek().content = lastTransaction.content;
			return true;
		}
		return false;
	}
}