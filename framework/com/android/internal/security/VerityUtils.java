package com.android.internal.security;

public abstract class VerityUtils {
    private static final int HASH_SIZE_BYTES = 32;
    private static final java.lang.String TAG = "VerityUtils";
    public VerityUtils() {}
    private static native int enableFsverityForFdNative(int p0);
    private static native int enableFsverityNative(java.lang.String p0);
    public static byte[] generateFsVerityDigest(long p0, android.os.incremental.V4Signature.HashingInfo p1) throws java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }
    public static byte[] getFsverityDigest(java.lang.String p0) { return null; }
    public static byte[] getFsverityDigestFromFsvMeta(java.lang.String p0) { return null; }
    public static boolean hasFsverity(java.lang.String p0) { return false; }
    public static boolean isFsVeritySupported() { return false; }
    private static native int measureFsverityNative(java.lang.String p0, byte[] p1);
    public static void setUpFsverity(int p0) throws java.io.IOException {}
    public static void setUpFsverity(java.lang.String p0) throws java.io.IOException {}
    private static native int statxForFsverityNative(java.lang.String p0);
    public static byte[] toFormattedDigest(byte[] p0) { return null; }
    public static boolean verifyPkcs7DetachedSignature(byte[] p0, byte[] p1, java.io.InputStream p2) { return false; }
}
