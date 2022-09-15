
public class AutoExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 30;
		double d = i;
		float f = (float) d;
		int k = (int) f;
		
		System.out.println("The integer number is " + i);
		System.out.println("The double number is " + d);
		System.out.println("The floating point number is " + f);
		System.out.println("The integer number is " + k);
	}

}
