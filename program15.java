import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
		int num=1;
                System.out.println("Enter number:");
                int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}
	}
}

