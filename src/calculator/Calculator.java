package calculator;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		
		char operator;
		Double num1, num2, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the operator: +,-,*,/,% ");
		operator = input.next().charAt(0);
		
		//user input
		
		System.out.println("Enter the First Number:");
		num1 = input.nextDouble();
		
		System.out.println("Enter the Second Number:");
		num2 = input.nextDouble();
		
	
		switch (operator) {
			case '+': 
				result = num1+num2;
				System.out.println(num1+" + "+num1+" = " + result);
				break;
			case '-': 
				result = num1-num2;
				System.out.println(num1+" - "+num1+" = " + result);
				break;
			case '*': 
				result = num1*num2;
				System.out.println(num1+" * "+num1+" = " + result);
				break;
			case '/': 
				result = num1/num2;
				System.out.println(num1+" / "+num1+" = " + result);
				break;
			case '%': 
				result = num1%num2;
				System.out.println(num1+" % "+num1+" = " + result);
				break;
			default:
				System.out.println("Invalid operator");
			break;
		}
		input.close();

		
		
	}

}
