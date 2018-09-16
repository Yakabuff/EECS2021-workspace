
public class LabA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = Integer.parseInt(args[0]);
		System.out.println(x +" to binary "+Integer.toBinaryString(x));
		System.out.println("x<<2 "+Integer.toBinaryString(x<<2));
		System.out.println("Decimal x<<2 "+Integer.parseInt(Integer.toBinaryString(x<<2), 2));
		System.out.println("x>>>2 "+Integer.toBinaryString(x>>>2));
		System.out.println("Decimal x>>>2 "+Integer.parseInt(Integer.toBinaryString(x>>>2), 2));
		System.out.println("x>>2 "+Integer.toBinaryString(x>>2));
		System.out.println("Decimal x>>2 "+Integer.parseInt(Integer.toBinaryString(x>>2), 2));
	}

}
