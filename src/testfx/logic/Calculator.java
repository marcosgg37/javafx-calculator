package testfx.logic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {

	private double currentValue;
	private Method operation;
	private char operator;
	private double operand;
	
	public Calculator() {
		this.currentValue = 0;
	}
	
	public void typeNumber(int num) {
		if (this.operation == null)
			this.currentValue = this.currentValue * 10 + (this.currentValue >= 0 ? num : -num);
		else
			this.operand = this.operand * 10 + (this.operand >= 0 ? num : -num);
	}
	
	public void clear() {
		if (operand != 0)
			this.operand = 0;
		else {
			operation = null;
			currentValue = 0;
		}
	}
	
	public void equal() {
		try {
			this.currentValue = (double) operation.invoke(this);
			this.operation = null;
			this.operand = 0;
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.err.println("Operation not selected");
		}
	}
	
	public void setOperation(String op) {
		try {
			this.operation = this.getClass().getMethod(op);
			switch (op) {
			case "add":
				this.operator = '+';
				break;
			case "mul":
				this.operator = '*';
				break;
			case "div":
				this.operator = '/';
				break;
			default:
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	
	// Calc methods
	public double add() {
		return this.currentValue + this.operand;
	}
	
	public void sub() {
		if (operation == null) this.currentValue *= -1;
		else this.operand *= -1;
	}
	
	public double mul() {
		return this.currentValue * this.operand;
	}
	
	public double div() {
		return this.currentValue / this.operand;
	}
	
	// Getters
	public double getCurrentValue() {
		return this.currentValue;
	}
	
	public String getOperation() {
		return this.operation == null ? "" : this.operator + "";
	}
	
	public double getOperand() {
		return this.operand;
	}
	
}
