package android.hardware.camera2.marshal;

public abstract class Marshaler<T extends java.lang.Object> {
    public static int NATIVE_SIZE_DYNAMIC;
    protected final int mNativeType = 0;
    protected final android.hardware.camera2.utils.TypeReference<T> mTypeReference = null;
    protected Marshaler(android.hardware.camera2.marshal.MarshalQueryable<T> p0, android.hardware.camera2.utils.TypeReference<T> p1, int p2) {}
    public int calculateMarshalSize(T p0) { return 0; }
    public abstract int getNativeSize();
    public int getNativeType() { return 0; }
    public android.hardware.camera2.utils.TypeReference<T> getTypeReference() { return null; }
    public abstract void marshal(T p0, java.nio.ByteBuffer p1);
    public abstract T unmarshal(java.nio.ByteBuffer p0);
}
