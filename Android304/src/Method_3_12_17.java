
public class Method_3_12_17 {

	public String name;
	public String fName;
	
	
	private int iDno;
	
	
	
	public void setName (String Sname ) {
		name =Sname;
	}
	
	String getName (){
		
		return name;
	}
	
	//////////////////////////
	
	public void setfName (String sfName) {
		fName=sfName;
	}
	
	String GetfName (){
		return fName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_3_12_17 obj = new Method_3_12_17();
		
		obj.setName("tom");
		obj.setfName("khan");
		obj.getName();
		obj.GetfName();
		
		System.out.println(" students name +"+obj.getName() );
		System.out.println(obj.GetfName() );
		
	}

}
