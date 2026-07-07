package com.android.internal.org.bouncycastle.math;

public abstract class Primes {
    private static final java.math.BigInteger ONE = null;
    public static final int SMALL_FACTOR_LIMIT = 211;
    private static final java.math.BigInteger THREE = null;
    private static final java.math.BigInteger TWO = null;
    public Primes() {}
    private static void checkCandidate(java.math.BigInteger p0, java.lang.String p1) {}
    public static com.android.internal.org.bouncycastle.math.Primes.MROutput enhancedMRProbablePrimeTest(java.math.BigInteger p0, java.security.SecureRandom p1, int p2) { return null; }
    private static int extract32(byte[] p0) { return 0; }
    public static com.android.internal.org.bouncycastle.math.Primes.STOutput generateSTRandomPrime(com.android.internal.org.bouncycastle.crypto.Digest p0, int p1, byte[] p2) { return null; }
    public static boolean hasAnySmallFactors(java.math.BigInteger p0) { return false; }
    private static void hash(com.android.internal.org.bouncycastle.crypto.Digest p0, byte[] p1, byte[] p2, int p3) {}
    private static java.math.BigInteger hashGen(com.android.internal.org.bouncycastle.crypto.Digest p0, byte[] p1, int p2) { return null; }
    private static boolean implHasAnySmallFactors(java.math.BigInteger p0) { return false; }
    private static boolean implMRProbablePrimeToBase(java.math.BigInteger p0, java.math.BigInteger p1, java.math.BigInteger p2, int p3, java.math.BigInteger p4) { return false; }
    private static com.android.internal.org.bouncycastle.math.Primes.STOutput implSTRandomPrime(com.android.internal.org.bouncycastle.crypto.Digest p0, int p1, byte[] p2) { return null; }
    private static void inc(byte[] p0, int p1) {}
    public static boolean isMRProbablePrime(java.math.BigInteger p0, java.security.SecureRandom p1, int p2) { return false; }
    public static boolean isMRProbablePrimeToBase(java.math.BigInteger p0, java.math.BigInteger p1) { return false; }
    private static boolean isPrime32(long p0) { return false; }

    public static class MROutput {
        private java.math.BigInteger factor;
        private boolean provablyComposite;
        private MROutput(boolean p0, java.math.BigInteger p1) {}
        private static com.android.internal.org.bouncycastle.math.Primes.MROutput probablyPrime() { return null; }
        private static com.android.internal.org.bouncycastle.math.Primes.MROutput provablyCompositeNotPrimePower() { return null; }
        private static com.android.internal.org.bouncycastle.math.Primes.MROutput provablyCompositeWithFactor(java.math.BigInteger p0) { return null; }
        public java.math.BigInteger getFactor() { return null; }
        public boolean isNotPrimePower() { return false; }
        public boolean isProvablyComposite() { return false; }
    }

    public static class STOutput {
        private java.math.BigInteger prime;
        private int primeGenCounter;
        private byte[] primeSeed;
        private STOutput(java.math.BigInteger p0, byte[] p1, int p2) {}
        public java.math.BigInteger getPrime() { return null; }
        public int getPrimeGenCounter() { return 0; }
        public byte[] getPrimeSeed() { return null; }
    }
}
