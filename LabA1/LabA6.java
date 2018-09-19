public class LabA6 {
    public static void main(String[] args) {
    	int i, j, k;
		i = Integer.parseInt(args[0]);
		System.out.println(Integer.toBinaryString(i) + " (x)");
		int mask = 1024;
		System.out.println(Integer.toBinaryString(mask));
		int mask2 = 2048;
		System.out.println(Integer.toBinaryString(mask2));
		
		j = mask | i;
		
		System.out.println(Integer.toBinaryString(j) + " (bit 10 set");
		
		k   = (~mask2) & j;
		System.out.println(Integer.toBinaryString(k)+ " (bit 11 clear");
    }
}