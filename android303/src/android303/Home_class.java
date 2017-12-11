package android303;



public class Home_class {

	
 public   String phy = "phy";
 public  String bio = "bio";
 
 

 
   void setPhy (  String  Sphy ) {
	   phy =Sphy;   
   }
   
   String getPhy () {
	     
	   return phy;
	   
   } 
  
   void setbio (  String  Sbio ) {
	   bio =Sbio;   
   }
   
   String getBio () {
	     
	  return bio;
	   
   } 
   
   Home_class () {
		 System.out.println( "contractor A " );
	 }
	 
    // main method 
	public static void main (String [] args ) {
		// 
		
		Home_class obj = new Home_class () ;
		Pre_Eng_B obj2 =new Pre_Eng_B () ;
		
		
		// get method 
		obj.setPhy("shah");
		obj.setbio("tabish");
		
		obj.getPhy();
		obj.getBio();
		
		/// 2nd class 
		obj2.setRoll(25552);
		obj2.getRoll();
		
		System.out.println( "Subject teacher " +obj.getPhy());
		System.out.println( "Subject teacher " +obj.getBio());
		
		///// clASS B
		System.out.println( "Subject id " +obj2.getRoll() );
		
		
	}
	
		
}

 class Pre_Eng_B extends Home_class {
	 
	 Pre_Eng_B () {
		 System.out.println( "Contructor B "  ); 
	 }
	 
	 ////ass
	public int roll ;
	
	///set
	void setRoll ( int Sroll  ) {
		roll =Sroll;   
	   }
	
	//get
	int getRoll () {
		return roll;
	}
	
	
	
	 
 }
  class Pre_medical extends Home_class {
	  
  }
 
 
class Pre_maths extends Home_class {
	  
  }



