package android.util.proto;

public class ProtoFieldFilter {
    private static final int BUFFER_SIZE_BYTES = 4096;
    private final byte[] mBuffer = null;
    private final java.util.function.Predicate<java.lang.Integer> mFieldPredicate = null;
    private final byte[] mVarIntBuffer = null;
    public ProtoFieldFilter(java.util.function.Predicate<java.lang.Integer> p0) {}
    public ProtoFieldFilter(java.util.function.Predicate<java.lang.Integer> p0, int p1) {}
    private void copyFieldData(java.io.InputStream p0, java.io.OutputStream p1, int p2) throws java.io.IOException {}
    private void copyFixed(java.io.InputStream p0, java.io.OutputStream p1, int p2) throws java.io.IOException {}
    private void copyLengthDelimited(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException {}
    private static void copyVarint(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException {}
    private static long parseVarint(byte[] p0, int p1) throws java.io.IOException { return 0L; }
    private int readRawVarint(java.io.InputStream p0) throws java.io.IOException { return 0; }
    private void skipBytes(java.io.InputStream p0, long p1) throws java.io.IOException {}
    private void skipFieldData(java.io.InputStream p0, int p1) throws java.io.IOException {}
    private void skipLengthDelimited(java.io.InputStream p0) throws java.io.IOException {}
    private static void skipVarint(java.io.InputStream p0) throws java.io.IOException {}
    public void filter(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException {}
}
