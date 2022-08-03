package calculator;

public class Calculator 
{

	int a, b;
	int rem, sum, sub, mul, div;
	
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	private int rem() {
		rem = a % b;
		return rem;
	}
	private int div() {
		div =  a/b;
		return div;
	}
	private int mul() {
		mul = a * b;
		return mul;
	}
	private int sub() {
		sub = a - b;
		return sub;
	}
	private int add() 
	{
		this.sum = this.a+ this.b;
		return this.sum;
	}
	public static void main(String[] args) 
	{

		Calculator c = new Calculator(3, 5);
		c.add();
		c.sub();
		c.mul();
		c.div();
		c.rem();
	}

}
