
public class LabA7 {

	public static void main(String[] args) {
		
        int x = Integer.parseInt(args[0]);
        System.out.println(Integer.toBinaryString(x) + "  binary for "+x);

        int mask = 1024;
        int secondmask = 1048576;
        
        int y = x & mask; // set everything but 1 & 1 to 0
        
        y = y >> 10; // make bit #10 the lsb
        
        int z = x & secondmask;  // set everything but 1 & 1 to 0
        
        z = z >> 20;  // make bit #20 the lsb

        if(z != y){ // if bit #10 and bit #20 are not the same
        	x = mask ^ x;  //use 1st mask on x to toggle value of 10th bit
        	x = secondmask ^ x; // use 2nd mask on x to toggle value 20th bit
        }
        
        System.out.println(Integer.toBinaryString(x)+ "  (swapped");
    }
		
		
	}


