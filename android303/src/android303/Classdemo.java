package android303;


class A{
	int a,b,c;
	
	
}

class B extends A{
	public void add(int a, int b){
		this.a=a;
		this.b=b;
		
		c=a+b;
		System.out.println("add: "+c);
	}
	
	
	public void subs(){
		c=a-b;
	System.out.println(c);
	}
      
	
}

public class Classdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj1=new A();
B obj =new B();
obj1.a=10;
obj1.b=20;

obj.add(10, 20);
obj.subs();
	}

}
