//Max of 3 numbers

import java.util.*;
class Max{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1:");
		int n1=sc.nextInt();
		System.out.println("Enter number 2:");
		int n2=sc.nextInt();
		System.out.println("Enter number 3:");
		int n3=sc.nextInt();
		if(n1>n2 && n1>n3){
			System.out.println(n1+"is greater");
		}
		else if(n2>n3){
			System.out.println(n2+"is Greater");
		}
		else if(n3>n2){
			System.out.println(n3+"is greater");
		}
		else if(n1==n2 && n1>n3){
			System.out.println(n1+"is greater");
		}
		else if(n2==n3 &&n2>n3){
			System.out.println(n2+"is greater");
		}
		else{
			System.out.println("All Are Equal");
		}
	}
}

		
