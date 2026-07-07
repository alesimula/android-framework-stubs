package com.android.internal.org.bouncycastle.jcajce.util;

public class BCJcaJceHelper extends com.android.internal.org.bouncycastle.jcajce.util.ProviderJcaJceHelper {
    private static volatile java.security.Provider bcProvider;
    public BCJcaJceHelper() { super(null); }
    private static java.security.Provider getBouncyCastleProvider() { return null; }
    private java.security.Provider getPrivateProvider() { return null; }
    public javax.crypto.Cipher createCipher(java.lang.String p0) throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException { return null; }
    public javax.crypto.Mac createMac(java.lang.String p0) throws java.security.NoSuchAlgorithmException { return null; }
    public javax.crypto.SecretKeyFactory createSecretKeyFactory(java.lang.String p0) throws java.security.NoSuchAlgorithmException { return null; }
}
