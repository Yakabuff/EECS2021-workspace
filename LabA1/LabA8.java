
public class LabA8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j, k;
		i = Integer.parseInt(args[0]);
		System.out.println(Integer.toBinaryString(i));

		j = 1 + ~i;
		System.out.println(j + "  ("+j+"decimal )");
		System.out.println(Integer.toBinaryString(j) + "  binary");
	}

}
