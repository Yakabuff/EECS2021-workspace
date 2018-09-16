
public class LabA2 {

	public static void main(String[] args) {
		int i, j, k;

			
		i = Integer.parseInt(args[0]);
		System.out.println("0x" + Integer.toHexString(Integer.parseInt(args[0])));
		System.out.println("0x"+Integer.toHexString(Integer.reverse(i)));
		System.out.println("0x" + Integer.toHexString(Integer.reverseBytes(Integer.parseInt(args[0]))));

	}
	

}
