package Evaluvation1.Java8;


public class LambdaExpression {
	public static void main(String [] args) {
		Sayable s=()->{
			return "I have nothing to say";
		};
		System.out.println(s.say());
	}

}
