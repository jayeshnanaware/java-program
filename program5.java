//WAP to check Whether a character  is vowel or consonent

import java.util.*;
class CheckVC{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character:");
		char ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e'||ch=='i'|| ch=='o'||ch=='u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.println(ch+"is Vowel");
		}
		else if(ch>=65 && ch<=90 || ch>=97 && ch<=122){
			System.out.println(ch+"is Consonent");
		}
		else{
			System.out.println(ch+"is not a character");
		}
	}
}

