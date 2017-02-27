/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class BitOperationLibrary {
    public boolean isEven(int i) {
        return ( i & 1 ) == 0;
    }

    public void swap(int[] pair) {
        pair[0] ^= pair[1]; // a = ab
        pair[1] ^= pair[0]; // b = ba = bab = bba = 0a = a
        pair[0] ^= pair[1]; // a = ab = aba = aab = 0b = b
    }

    public int negate(int i){
        return (~i + 1);
    }

    public int abs(int i){
        int j = i >> 31;
        return (i ^ j) - j; // j = -1 or 0
    }

}
