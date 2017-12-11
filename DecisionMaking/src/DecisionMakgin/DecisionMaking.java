package DecisionMakgin;
import java.util.Scanner;
public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Scanner obj=new Scanner(System.in);
System.out.println("Enter a number");		
int x=obj.nextInt();
		
		switch(x){
		
		case 1:
			System.out.println("This is case 1 x=1");
			break;
		case 2:
			System.out.println("This is case 2 x=2");
			break;
		case 3:
			System.out.println("This is case 3");
			break;

		default:
			System.out.println("Your input does not match with the any case");}
*/
		//FOR LOOP

		//*********************************************
		
//		for(int i=0;i<10;i=i+2){
//			System.out.println(i);
//			
//		}
		
//		int i=0;
//		while(i<5){
//			i++;
//			System.out.println("The value of i:"+i);
//		}
//	
//	
//	do{
//	System.out.println("The value of k starts");
//			k++;
//			
//		
//	}
//	while(k>10);
//	System.out.println(k);
//a= 00111000
		//b=00001101
		int a=60;int b=13;
		int and=a&b;
		int or=a|b;
		int com=~a;
		System.out.println("and: "+and);
		System.out.println("or: "+or);
		System.out.println("compliment: "+com);
		}
		
}
