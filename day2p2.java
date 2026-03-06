
// this program is mainly in java version 25 in that their is no static keyword is used in the main method insted of that jvm create an object of main method that  helps to execute the progeam  also execute the  constuctor of class..

class Demo{
	Demo(){
		System.out.println("In Constructor");
	}
	void main(){
		int x=10;
		int y=20;
		System.out.println("In main method");
		System.out.println(x+y);
	}
}

