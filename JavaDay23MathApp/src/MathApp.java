@FunctionalInterface
interface mathFunction{
	int calculate(int qa, int b);
	static void prinResult(int a, int b, String function, mathFunction obj) {
		System.out.println(obj);
	}
}

public class MathApp {

	public static void main(String args[]) {
		mathFunction add = (a, b) -> a + b;
		mathFunction multiply = (a, b) -> a * b;
		mathFunction devide = (a, b) -> a / b;
		
		System.out.println("addition = "+ add.calculate(2, 9));
		System.out.println("mutiplication = "+ multiply.calculate(2, 9));
		System.out.println("division = "+ devide.calculate(2, 9));
	
		mathFunction.prinResult(0, 0, null, devide);
	}
}
