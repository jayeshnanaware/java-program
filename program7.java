//WAP calculate profit and loss of selling price and making price
import java.util.*;
class Profit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Making price:");
		int m=sc.nextInt();
		System.out.println("Enter Selling price:");
		int s=sc.nextInt();
		int p=s-m;
		if(p>0){
			System.out.println("Profit ammount:"+p);
		}
		else if(p<0){
			System.out.println("Loss Amount:"+(-p));
		}
		else{
			System.out.println("No loss no profit");
		}
	}
}


