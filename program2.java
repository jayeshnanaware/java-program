//WAP to print number in range given by user test case-range should be in ascennding order


import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1:");
		int num1=sc.nextInt();
		System.out.println("Enter Number 2:");
		int num2=sc.nextInt();
		if(num1<num2){
			for(;num1<=num2;num1++){
				System.out.print(num1+" ");
			}
		}
		else{
			for(;num2<=num1;num1--){
				System.out.print(num1+" ");
			}
		}
	}
}

