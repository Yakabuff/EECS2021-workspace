
public class test {

	public static void main(String[] args) {
		
        int x = Integer.parseInt(args[0]);
        System.out.println(Integer.toBinaryString(x));

        int z = x << 10;// get bit #10 of x
        System.out.println(Integer.toBinaryString(z));
        z = z >>> 15; 
        System.out.println(Integer.toBinaryString(z));

	}

}
