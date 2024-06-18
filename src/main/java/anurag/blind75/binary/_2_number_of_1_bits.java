package anurag.blind75.binary;

public class _2_number_of_1_bits {
    public static void main(String[] args){
        int bitCount = hammingWeight(11);
        System.out.println("number of i bits"+ bitCount);
    }

    private static int hammingWeight(int n){
        int count=0;
        while (n != 0) {
            count += n & 1; // Add 1 to count if the least significant bit is set
            n >>>= 1; // Shift bits to the right by one (unsigned)
        }
        return count;
    }
}
