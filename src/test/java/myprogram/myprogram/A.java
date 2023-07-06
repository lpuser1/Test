package myprogram.myprogram;

public class A {
	int a=10;
	int b=20;
	
	void display() {
		int sum=a+b;
		System.out.println(sum);
		
		System.out.println();
	}
	class B extends A{
		int b=20;
		void print() {
			System.out.println(b);
		}
	}


	public static void main(String[] args) {
		
		A aobj=new A();
		aobj.display();
		
		

	}

}
