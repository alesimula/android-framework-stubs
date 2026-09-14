package android.graphics.fonts;

@android.annotation.SystemApi
public final class FontFileUpdateRequest {
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_SUPPLEMENTAL = 1;
    private final android.os.ParcelFileDescriptor mParcelFileDescriptor = null;
    private final byte[] mSignature = null;
    private final int mType = 0;
    public FontFileUpdateRequest(android.os.ParcelFileDescriptor p0, byte[] p1) {}
    public FontFileUpdateRequest(android.os.ParcelFileDescriptor p0, byte[] p1, int p2) {}
    public android.os.ParcelFileDescriptor getParcelFileDescriptor() { return null; }
    public byte[] getSignature() { return null; }
    public int getType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
