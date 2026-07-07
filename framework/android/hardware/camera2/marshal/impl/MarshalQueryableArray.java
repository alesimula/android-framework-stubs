package android.hardware.camera2.marshal.impl;

public class MarshalQueryableArray<T extends java.lang.Object> implements android.hardware.camera2.marshal.MarshalQueryable<T> {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = null;
    public MarshalQueryableArray() {}
    public android.hardware.camera2.marshal.Marshaler<T> createMarshaler(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return false; }

    private class MarshalerArray extends android.hardware.camera2.marshal.Marshaler<T> {
        private final java.lang.Class<T> mClass = null;
        private final java.lang.Class<?> mComponentClass = null;
        private final android.hardware.camera2.marshal.Marshaler<?> mComponentMarshaler = null;
        protected MarshalerArray(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { super(null, null, 0); }
        private <TElem extends java.lang.Object> int calculateElementMarshalSize(android.hardware.camera2.marshal.Marshaler<TElem> p0, java.lang.Object p1, int p2) { return 0; }
        private java.lang.Object copyListToArray(java.util.ArrayList<?> p0, java.lang.Object p1) { return null; }
        private <TElem extends java.lang.Object> void marshalArrayElement(android.hardware.camera2.marshal.Marshaler<TElem> p0, java.nio.ByteBuffer p1, java.lang.Object p2, int p3) {}
        public int calculateMarshalSize(T p0) { return 0; }
        public int getNativeSize() { return 0; }
        public void marshal(T p0, java.nio.ByteBuffer p1) {}
        public T unmarshal(java.nio.ByteBuffer p0) { return null; }
    }

    private static interface PrimitiveArrayFiller {
        public static android.hardware.camera2.marshal.impl.MarshalQueryableArray.PrimitiveArrayFiller getPrimitiveArrayFiller(java.lang.Class<?> p0) { return null; }
        public void fillArray(java.lang.Object p0, int p1, java.nio.ByteBuffer p2);
    }
}
