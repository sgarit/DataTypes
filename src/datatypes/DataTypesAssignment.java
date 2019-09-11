package datatypes;

public class DataTypesAssignment {

	public static void main(String[] args) {
		
		/**
		 * My java Program to print "hello"
		 */
		
		System.out.println("Hello");
		System.out.println("Ragini");
		
		System.out.println("-------------------");
		
		
		//My java program to print the sum of two numbers
		
		int a = 20;
		int b = 36;
		
		System.out.println(a+b);
		System.out.println("-------------------");
		
		/* Java program to divide two numbers and print on the screen. */
		
		int c = 60;
		int d = 30;
		int e = c/d;
		System.out.println(e);
		
		/*Java program to print the result of the following operations. */
		
		
		int f = -5;
		int g = 8;
		int h = 6;
		
		int i = f + g * h;
		System.out.println(i);
		
		int j = 55;
		int k = 9;
		int l = 9;
		int result = (j+k)%l;
		
		System.out.println(result);
		
		int m = 20;
		int n = -3;
		int o = 5;
		int p = 8;
		
		int res = m + n*o / p;
		System.out.println(res);
		
		
		int q = 5;
		int r = 15;
		int s = 3;
		int t = 2;
		int u = 8;
		int v = 3;
		
		int w = q + r/s * t - u % v;
		System.out.println(w);
		System.out.println("-------------------");
		
		/*Write a Java program to compute the specified expressions and print the output.
		Test Data:*/
		
		/*((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) */
		
		double da = 28.5;
		double db = 3.0;
		double dc = 4.5;
		double dd = 3.5;
		double de = 50.5;
		double df  = 6.5;
		double d_res = ((da * db - dc * dd)/(de - df));
		System.out.println(d_res);
		
		
		
	}

}
