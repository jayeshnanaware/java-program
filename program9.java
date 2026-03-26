//to check the three number are pythagorian triplet or not

import java.util.*;
class Pytha{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter a number");
		int b=sc.nextInt();
		System.out.println("Enter a number");
		int c=sc.nextInt();
		if((a*a)+(b*b)==(c*c) ||(a*a)+(c*c)==(b*b) ||(b*b)+(c*c)==(a*a)){
			System.out.println("Pythagorian Triplet");
		}
		else{
			System.out.println("Not pythagorian triplet");
		}
	}
}


