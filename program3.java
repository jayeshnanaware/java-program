//WAP to check whether a charactwer is uppercase or lowercase
import java.util.*;
class Upper{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character:");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z'){
			System.out.println(ch+"is lower case");
		}
		else if(ch>=65 && ch<=90){
			System.out.println(ch+"is Upper case");
		}
		else{
			System.out.println(ch+"is not a character");
		}
	}
}
	
