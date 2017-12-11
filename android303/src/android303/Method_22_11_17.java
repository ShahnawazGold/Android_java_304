package android303;

public class Method_22_11_17  {

	Method_22_11_17 (){
		System.out.println("constructor A  ");	
	}
	public String name ;
	public int id ;
	// set mothod 
	public void setName (String Sname) {
		name =Sname;
	}
	
	// get mothod
	String getName () {
		return name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_22_11_17 obj = new Method_22_11_17();
		obj.setName("shah");
		obj.getName();
		
		System.out.println("teacher name   "+obj.getName());
		
	}

}
