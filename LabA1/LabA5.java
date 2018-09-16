
public class LabA5 {

	public static void main(String[] args) {
		int i, j, k;
		i = Integer.parseInt(args[0]);
		System.out.println(Integer.toBinaryString(i));
		
		
		int z = i<<21;
		System.out.println(Integer.toBinaryString(z>>>31));
		
		int mask = 1024;
		int y = i & mask;
		y = y>>10;
		System.out.println(Integer.toBinaryString(y));

	}

}
