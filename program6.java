//WAP to create a calculator using switch case take two number from user also take operator form user.

import java.util.*;
class Calculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number 1");
		int num1=sc.nextInt();
		System.out.println("Enter a number 2");
		int num2=sc.nextInt();
		System.out.println("Enter a operator");
		char ch=sc.next().charAt(0);
		switch(ch){
			case '+':
				System.out.println("Addition"+(num1+num2));
				break;

			case '-':
				System.out.println("Substraction:"+(num1-num2));
				break;
			case '*':
				System.out.println("Multiplication:"+(num1*num2));
				break;
			case '/':
				System.out.println("Division:"+(num1/num2));
				break;
			case '%':
				System.out.println("Modulus:"+(num1%num2));
				break;
			default:
				System.out.println("Invalid Operator");
		}
	}
}

