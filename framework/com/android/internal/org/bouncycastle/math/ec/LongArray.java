package com.android.internal.org.bouncycastle.math.ec;

class LongArray implements java.lang.Cloneable {
    private static final short[] INTERLEAVE2_TABLE = null;
    private static final int[] INTERLEAVE3_TABLE = null;
    private static final int[] INTERLEAVE4_TABLE = null;
    private static final int[] INTERLEAVE5_TABLE = null;
    private static final long[] INTERLEAVE7_TABLE = null;
    private static final java.lang.String ZEROES = "0000000000000000000000000000000000000000000000000000000000000000";
    static final byte[] bitLengths = null;
    private long[] m_ints;
    public LongArray(int p0) {}
    public LongArray(java.math.BigInteger p0) {}
    public LongArray(long[] p0) {}
    public LongArray(long[] p0, int p1, int p2) {}
    private static void add(long[] p0, int p1, long[] p2, int p3, int p4) {}
    private static void add(long[] p0, int p1, long[] p2, int p3, long[] p4, int p5, int p6) {}
    private static void addBoth(long[] p0, int p1, long[] p2, int p3, long[] p4, int p5, int p6) {}
    private void addShiftedByBitsSafe(com.android.internal.org.bouncycastle.math.ec.LongArray p0, int p1, int p2) {}
    private static long addShiftedDown(long[] p0, int p1, long[] p2, int p3, int p4, int p5) { return 0L; }
    private static long addShiftedUp(long[] p0, int p1, long[] p2, int p3, int p4, int p5) { return 0L; }
    private static int bitLength(long p0) { return 0; }
    private int degreeFrom(int p0) { return 0; }
    private static void distribute(long[] p0, int p1, int p2, int p3, int p4) {}
    private static void flipBit(long[] p0, int p1, int p2) {}
    private static void flipVector(long[] p0, int p1, long[] p2, int p3, int p4, int p5) {}
    private static void flipWord(long[] p0, int p1, int p2, long p3) {}
    private static void interleave(long[] p0, int p1, long[] p2, int p3, int p4, int p5) {}
    private static long interleave2_32to64(int p0) { return 0L; }
    private static long interleave2_n(long p0, int p1) { return 0L; }
    private static void interleave2_n(long[] p0, int p1, long[] p2, int p3, int p4, int p5) {}
    private static long interleave3(long p0) { return 0L; }
    private static void interleave3(long[] p0, int p1, long[] p2, int p3, int p4) {}
    private static long interleave3_13to65(int p0) { return 0L; }
    private static long interleave3_21to63(int p0) { return 0L; }
    private static long interleave4_16to64(int p0) { return 0L; }
    private static long interleave5(long p0) { return 0L; }
    private static void interleave5(long[] p0, int p1, long[] p2, int p3, int p4) {}
    private static long interleave7(long p0) { return 0L; }
    private static void interleave7(long[] p0, int p1, long[] p2, int p3, int p4) {}
    private static void multiplyWord(long p0, long[] p1, int p2, long[] p3, int p4) {}
    private static void reduceBit(long[] p0, int p1, int p2, int p3, int[] p4) {}
    private static void reduceBitWise(long[] p0, int p1, int p2, int p3, int[] p4) {}
    private static int reduceInPlace(long[] p0, int p1, int p2, int p3, int[] p4) { return 0; }
    private static com.android.internal.org.bouncycastle.math.ec.LongArray reduceResult(long[] p0, int p1, int p2, int p3, int[] p4) { return null; }
    private static void reduceVectorWise(long[] p0, int p1, int p2, int p3, int p4, int[] p5) {}
    private static void reduceWord(long[] p0, int p1, int p2, long p3, int p4, int[] p5) {}
    private static void reduceWordWise(long[] p0, int p1, int p2, int p3, int p4, int[] p5) {}
    private long[] resizedInts(int p0) { return null; }
    private static long shiftUp(long[] p0, int p1, int p2, int p3) { return 0L; }
    private static long shiftUp(long[] p0, int p1, long[] p2, int p3, int p4, int p5) { return 0L; }
    private static void squareInPlace(long[] p0, int p1, int p2, int[] p3) {}
    private static boolean testBit(long[] p0, int p1, int p2) { return false; }
    public com.android.internal.org.bouncycastle.math.ec.LongArray addOne() { return null; }
    public void addShiftedByWords(com.android.internal.org.bouncycastle.math.ec.LongArray p0, int p1) {}
    public java.lang.Object clone() { return null; }
    void copyTo(long[] p0, int p1) {}
    public int degree() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getLength() { return 0; }
    public int getUsedLength() { return 0; }
    public int getUsedLengthFrom(int p0) { return 0; }
    public int hashCode() { return 0; }
    public boolean isOne() { return false; }
    public boolean isZero() { return false; }
    public com.android.internal.org.bouncycastle.math.ec.LongArray modInverse(int p0, int[] p1) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.LongArray modMultiply(com.android.internal.org.bouncycastle.math.ec.LongArray p0, int p1, int[] p2) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.LongArray modMultiplyAlt(com.android.internal.org.bouncycastle.math.ec.LongArray p0, int p1, int[] p2) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.LongArray modMultiplyLD(com.android.internal.org.bouncycastle.math.ec.LongArray p0, int p1, int[] p2) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.LongArray modReduce(int p0, int[] p1) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.LongArray modSquare(int p0, int[] p1) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.LongArray modSquareN(int p0, int p1, int[] p2) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.LongArray multiply(com.android.internal.org.bouncycastle.math.ec.LongArray p0, int p1, int[] p2) { return null; }
    public void reduce(int p0, int[] p1) {}
    public com.android.internal.org.bouncycastle.math.ec.LongArray square(int p0, int[] p1) { return null; }
    public boolean testBitZero() { return false; }
    public java.math.BigInteger toBigInteger() { return null; }
    public java.lang.String toString() { return null; }
    private static long[] $d2j$hex$6aa589e6$decode_J(java.lang.String p0) { return null; }
    private static int[] $d2j$hex$6aa589e6$decode_I(java.lang.String p0) { return null; }
    private static short[] $d2j$hex$6aa589e6$decode_S(java.lang.String p0) { return null; }
    private static byte[] $d2j$hex$6aa589e6$decode_B(java.lang.String p0) { return null; }
}
