
public class LabA2 {

	public static void main(String[] args) {
		int i, j, k;

			
		i = Integer.parseInt(args[0]);
		String binary = Integer.toBinaryString(i);
		System.out.println(binary);
		System.out.println(i + " to hex  "+ Integer.toHexString(i));
		int reverse = Integer.reverse(i);
		//System.out.println(reverse);
		
		System.out.println("Reverse "+Integer.toBinaryString(reverse));
		System.out.println("reverse to hex "+Integer.toHexString(reverse));
		int reverseBytes = Integer.reverseBytes(i);
		//System.out.println(reverseBytes);
		System.out.println("Reverse bytes "+Integer.toBinaryString(reverseBytes));
		System.out.println("reverse bytes to hex "+ Integer.toHexString(reverseBytes));
		
	}
	

}
