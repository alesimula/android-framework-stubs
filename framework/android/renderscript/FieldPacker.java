package android.renderscript;

@java.lang.Deprecated
public class FieldPacker {
    private java.util.BitSet mAlignment;
    private byte[] mData;
    private int mLen;
    private int mPos;
    public FieldPacker(int p0) {}
    public FieldPacker(byte[] p0) {}
    private void add(java.lang.Object p0) {}
    private void addSafely(java.lang.Object p0) {}
    static android.renderscript.FieldPacker createFromArray(java.lang.Object[] p0) { return null; }
    private boolean resize(int p0) { return false; }
    public void addBoolean(boolean p0) {}
    public void addF32(float p0) {}
    public void addF32(android.renderscript.Float2 p0) {}
    public void addF32(android.renderscript.Float3 p0) {}
    public void addF32(android.renderscript.Float4 p0) {}
    public void addF64(double p0) {}
    public void addF64(android.renderscript.Double2 p0) {}
    public void addF64(android.renderscript.Double3 p0) {}
    public void addF64(android.renderscript.Double4 p0) {}
    public void addI16(android.renderscript.Short2 p0) {}
    public void addI16(android.renderscript.Short3 p0) {}
    public void addI16(android.renderscript.Short4 p0) {}
    public void addI16(short p0) {}
    public void addI32(int p0) {}
    public void addI32(android.renderscript.Int2 p0) {}
    public void addI32(android.renderscript.Int3 p0) {}
    public void addI32(android.renderscript.Int4 p0) {}
    public void addI64(long p0) {}
    public void addI64(android.renderscript.Long2 p0) {}
    public void addI64(android.renderscript.Long3 p0) {}
    public void addI64(android.renderscript.Long4 p0) {}
    public void addI8(byte p0) {}
    public void addI8(android.renderscript.Byte2 p0) {}
    public void addI8(android.renderscript.Byte3 p0) {}
    public void addI8(android.renderscript.Byte4 p0) {}
    public void addMatrix(android.renderscript.Matrix2f p0) {}
    public void addMatrix(android.renderscript.Matrix3f p0) {}
    public void addMatrix(android.renderscript.Matrix4f p0) {}
    public void addObj(android.renderscript.BaseObj p0) {}
    public void addU16(int p0) {}
    public void addU16(android.renderscript.Int2 p0) {}
    public void addU16(android.renderscript.Int3 p0) {}
    public void addU16(android.renderscript.Int4 p0) {}
    public void addU32(long p0) {}
    public void addU32(android.renderscript.Long2 p0) {}
    public void addU32(android.renderscript.Long3 p0) {}
    public void addU32(android.renderscript.Long4 p0) {}
    public void addU64(long p0) {}
    public void addU64(android.renderscript.Long2 p0) {}
    public void addU64(android.renderscript.Long3 p0) {}
    public void addU64(android.renderscript.Long4 p0) {}
    public void addU8(android.renderscript.Short2 p0) {}
    public void addU8(android.renderscript.Short3 p0) {}
    public void addU8(android.renderscript.Short4 p0) {}
    public void addU8(short p0) {}
    public void align(int p0) {}
    public final byte[] getData() { return null; }
    public int getPos() { return 0; }
    public void reset() {}
    public void reset(int p0) {}
    public void skip(int p0) {}
    public boolean subBoolean() { return false; }
    public android.renderscript.Byte2 subByte2() { return null; }
    public android.renderscript.Byte3 subByte3() { return null; }
    public android.renderscript.Byte4 subByte4() { return null; }
    public android.renderscript.Double2 subDouble2() { return null; }
    public android.renderscript.Double3 subDouble3() { return null; }
    public android.renderscript.Double4 subDouble4() { return null; }
    public float subF32() { return 0.0f; }
    public double subF64() { return 0.0; }
    public android.renderscript.Float2 subFloat2() { return null; }
    public android.renderscript.Float3 subFloat3() { return null; }
    public android.renderscript.Float4 subFloat4() { return null; }
    public short subI16() { return 0; }
    public int subI32() { return 0; }
    public long subI64() { return 0L; }
    public byte subI8() { return 0; }
    public android.renderscript.Int2 subInt2() { return null; }
    public android.renderscript.Int3 subInt3() { return null; }
    public android.renderscript.Int4 subInt4() { return null; }
    public android.renderscript.Long2 subLong2() { return null; }
    public android.renderscript.Long3 subLong3() { return null; }
    public android.renderscript.Long4 subLong4() { return null; }
    public android.renderscript.Matrix2f subMatrix2f() { return null; }
    public android.renderscript.Matrix3f subMatrix3f() { return null; }
    public android.renderscript.Matrix4f subMatrix4f() { return null; }
    public android.renderscript.Short2 subShort2() { return null; }
    public android.renderscript.Short3 subShort3() { return null; }
    public android.renderscript.Short4 subShort4() { return null; }
    public void subalign(int p0) {}
}
