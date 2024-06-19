package anurag.blind75.binary;

public class _5_reverse_bits {

    public static void main(String... args){
        int n = Integer.parseUnsignedInt("00000010100101000001111010011100", 2);
        int result = reverseBits(n);
        System.out.println(result);
    }

    private static int reverseBits(int n){
        int reversed = 0;
        int bitsCount = 32; // Given that it's a 32-bit integer

        for (int i = 0; i < bitsCount; i++) {
            // Shift the reversed bits to the left to make space for the next bit of n
            reversed <<= 1;
            // Get the least significant bit of n and add it to reversed
            reversed |= (n & 1);
            // Shift n to the right to process the next bit
            n >>>= 1;
        }

        return reversed;
    }
}
