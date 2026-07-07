package android.media;

public final class MediaCrypto {
    private long mNativeContext;
    public MediaCrypto(java.util.UUID p0, byte[] p1) throws android.media.MediaCryptoException {}
    private static final byte[] getByteArrayFromUUID(java.util.UUID p0) { return null; }
    public static final boolean isCryptoSchemeSupported(java.util.UUID p0) { return false; }
    private static final native boolean isCryptoSchemeSupportedNative(byte[] p0);
    private final native void native_finalize();
    private static final native void native_init();
    private final native void native_setup(byte[] p0, byte[] p1) throws android.media.MediaCryptoException;
    protected void finalize() {}
    public final native void release();
    public final native boolean requiresSecureDecoderComponent(java.lang.String p0);
    public final native void setMediaDrmSession(byte[] p0) throws android.media.MediaCryptoException;
}
