package com.learning.behavioural.interpreter;

public abstract class Expression {
	public abstract int interpret();
}


//terminal expression
class Number extends Expression
{
	protected int value = 0;
	
	public Number(int value) {
		super();
		this.value = value;
	}
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return value;
	}
	
}

class Add extends Expression
{

	protected Expression lhs = null;
	protected Expression rhs = null;
	
	
	public Add(Expression lhs, Expression rhs) {
		super();
		this.lhs = lhs;
		this.rhs = rhs;
	}


	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return lhs.interpret()+rhs.interpret();
	}
	
}

class Subtract extends Expression
{

	protected Expression lhs = null;
	protected Expression rhs = null;
	
	
	public Subtract(Expression lhs, Expression rhs) {
		super();
		this.lhs = lhs;
		this.rhs = rhs;
	}


	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return lhs.interpret()-rhs.interpret();
	}
	
}

class Multiply extends Expression
{

	protected Expression lhs = null;
	protected Expression rhs = null;
	
	
	public Multiply(Expression lhs, Expression rhs) {
		super();
		this.lhs = lhs;
		this.rhs = rhs;
	}


	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return lhs.interpret()*rhs.interpret();
	}
	
}

class Divide extends Expression
{

	protected Expression lhs = null;
	protected Expression rhs = null;
	
	
	public Divide(Expression lhs, Expression rhs) {
		super();
		this.lhs = lhs;
		this.rhs = rhs;
	}


	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return lhs.interpret()/rhs.interpret();
	}
	
}