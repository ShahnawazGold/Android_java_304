package android303;

public class Demo_Lectures {

	String[] arr = {"jj","k","k"};
	int a = 3;
	int b = 4;
	
	public String name;
	
	public String rollNo;
	
	
   public void setName (String Sname) {
	    this.name = Sname;
   }
	
   public void setRollNo (String SRollN) {
	    this.rollNo = SRollN;
  }
   
   String getName () {
	   
	   return name;
   }
	
   
 String getRoll () {
	   
	   return rollNo;
   }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_Lectures obj = new Demo_Lectures();
		obj.setName("shahh");
		obj.setRollNo("9999");
		obj.getName();
		obj.getRoll();
		System.out.println("shah"+obj.getName());
		
		System.out.println("roll :" + obj.getRoll());
		
		
	}

}
