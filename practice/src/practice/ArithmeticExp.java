package practice;

import java.io.*;
import java.util.*;

public class ArithmeticExp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = x / y;

		}

		catch (InputMismatchException a) {
			System.out.println(a.getMessage());
			//System.out.println(a.toString());
			//a.printStackTrace();
		}

		catch (ArithmeticException b) {
			System.out.println(b.getMessage());
			System.out.println(b.toString());
			b.printStackTrace();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}

		//finally {
		//	System.out.println("Finally running");
		//}
	}
}
