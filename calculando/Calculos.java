package calculando;

public class Calculos implements Calculando {
	
	int num1 = 9;
	int num2 = 10;
	
	@Override
	public double som() {
		System.out.println(num1+num2);
		return 0;
	}
	
	@Override
	public double sub() {
		System.out.println(num1-num2);
		return 0;
	}
	
	@Override
	public double mult() {
		System.out.println(num1*num2);
		return 0;
	}
	
	@Override
	public int div() {
		System.out.println(num1/num2);
		return 0;
	}
	
	@Override
	public int exp() {
		System.out.println(Math.pow(num1, num2));
		return 0;
	}
	

}
