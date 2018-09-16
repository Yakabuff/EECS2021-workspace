
public class LabA3 {
	public static void main(String[] args){
	
	int x = Integer.parseInt(args[0]);
	System.out.println(Integer.toBinaryString(x));
	
	int y = Integer.parseInt(args[1]);
	System.out.println(Integer.toBinaryString(y));
	
	System.out.println(Integer.toBinaryString(x&y));
	System.out.println(Integer.toBinaryString(x|y));
	System.out.println(Integer.toBinaryString(x^y));
	System.out.println(Integer.toBinaryString(~x));
	
	
	
	
	
	}
}
