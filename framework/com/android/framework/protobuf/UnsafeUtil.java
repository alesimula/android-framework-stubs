package com.android.framework.protobuf;

final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET = Long.valueOf(0L);
    private static final long BOOLEAN_ARRAY_INDEX_SCALE = Long.valueOf(0L);
    private static final long BUFFER_ADDRESS_OFFSET = Long.valueOf(0L);
    private static final int BYTE_ARRAY_ALIGNMENT = Integer.valueOf(0);
    static final long BYTE_ARRAY_BASE_OFFSET = Long.valueOf(0L);
    private static final long DOUBLE_ARRAY_BASE_OFFSET = Long.valueOf(0L);
    private static final long DOUBLE_ARRAY_INDEX_SCALE = Long.valueOf(0L);
    private static final long FLOAT_ARRAY_BASE_OFFSET = Long.valueOf(0L);
    private static final long FLOAT_ARRAY_INDEX_SCALE = Long.valueOf(0L);
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = Boolean.valueOf(false);
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = Boolean.valueOf(false);
    private static final long INT_ARRAY_BASE_OFFSET = Long.valueOf(0L);
    private static final long INT_ARRAY_INDEX_SCALE = Long.valueOf(0L);
    private static final boolean IS_ANDROID_32 = Boolean.valueOf(false);
    private static final boolean IS_ANDROID_64 = Boolean.valueOf(false);
    static final boolean IS_BIG_ENDIAN = Boolean.valueOf(false);
    private static final long LONG_ARRAY_BASE_OFFSET = Long.valueOf(0L);
    private static final long LONG_ARRAY_INDEX_SCALE = Long.valueOf(0L);
    private static final com.android.framework.protobuf.UnsafeUtil.MemoryAccessor MEMORY_ACCESSOR = null;
    private static final java.lang.Class<?> MEMORY_CLASS = null;
    private static final long OBJECT_ARRAY_BASE_OFFSET = Long.valueOf(0L);
    private static final long OBJECT_ARRAY_INDEX_SCALE = Long.valueOf(0L);
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private UnsafeUtil() {}
    static long addressOffset(java.nio.ByteBuffer p0) { return 0L; }
    static <T extends java.lang.Object> T allocateInstance(java.lang.Class<T> p0) { return null; }
    private static int arrayBaseOffset(java.lang.Class<?> p0) { return 0; }
    private static int arrayIndexScale(java.lang.Class<?> p0) { return 0; }
    private static java.lang.reflect.Field bufferAddressField() { return null; }
    static void copyMemory(long p0, byte[] p1, long p2, long p3) {}
    static void copyMemory(byte[] p0, long p1, long p2, long p3) {}
    static void copyMemory(byte[] p0, long p1, byte[] p2, long p3, long p4) {}
    static boolean determineAndroidSupportByAddressSize(java.lang.Class<?> p0) { return false; }
    private static java.lang.reflect.Field field(java.lang.Class<?> p0, java.lang.String p1) { return null; }
    private static long fieldOffset(java.lang.reflect.Field p0) { return 0L; }
    private static int firstDifferingByteIndexNativeEndian(long p0, long p1) { return 0; }
    static boolean getBoolean(java.lang.Object p0, long p1) { return false; }
    static boolean getBoolean(boolean[] p0, long p1) { return false; }
    private static boolean getBooleanBigEndian(java.lang.Object p0, long p1) { return false; }
    private static boolean getBooleanLittleEndian(java.lang.Object p0, long p1) { return false; }
    static byte getByte(long p0) { return 0; }
    static byte getByte(java.lang.Object p0, long p1) { return 0; }
    static byte getByte(byte[] p0, long p1) { return 0; }
    private static byte getByteBigEndian(java.lang.Object p0, long p1) { return 0; }
    private static byte getByteLittleEndian(java.lang.Object p0, long p1) { return 0; }
    static double getDouble(java.lang.Object p0, long p1) { return 0.0; }
    static double getDouble(double[] p0, long p1) { return 0.0; }
    static float getFloat(java.lang.Object p0, long p1) { return 0.0f; }
    static float getFloat(float[] p0, long p1) { return 0.0f; }
    static int getInt(long p0) { return 0; }
    static int getInt(java.lang.Object p0, long p1) { return 0; }
    static int getInt(int[] p0, long p1) { return 0; }
    static long getLong(long p0) { return 0L; }
    static long getLong(java.lang.Object p0, long p1) { return 0L; }
    static long getLong(long[] p0, long p1) { return 0L; }
    private static com.android.framework.protobuf.UnsafeUtil.MemoryAccessor getMemoryAccessor() { return null; }
    static java.lang.Object getObject(java.lang.Object p0, long p1) { return null; }
    static java.lang.Object getObject(java.lang.Object[] p0, long p1) { return null; }
    static java.lang.Object getStaticObject(java.lang.reflect.Field p0) { return null; }
    static sun.misc.Unsafe getUnsafe() { return null; }
    static boolean hasUnsafeArrayOperations() { return false; }
    static boolean hasUnsafeByteBufferOperations() { return false; }
    private static void logMissingMethod(java.lang.Throwable p0) {}
    static int mismatch(byte[] p0, int p1, byte[] p2, int p3, int p4) { return 0; }
    static long objectFieldOffset(java.lang.reflect.Field p0) { return 0L; }
    static void putBoolean(java.lang.Object p0, long p1, boolean p2) {}
    static void putBoolean(boolean[] p0, long p1, boolean p2) {}
    private static void putBooleanBigEndian(java.lang.Object p0, long p1, boolean p2) {}
    private static void putBooleanLittleEndian(java.lang.Object p0, long p1, boolean p2) {}
    static void putByte(long p0, byte p1) {}
    static void putByte(java.lang.Object p0, long p1, byte p2) {}
    static void putByte(byte[] p0, long p1, byte p2) {}
    private static void putByteBigEndian(java.lang.Object p0, long p1, byte p2) {}
    private static void putByteLittleEndian(java.lang.Object p0, long p1, byte p2) {}
    static void putDouble(java.lang.Object p0, long p1, double p2) {}
    static void putDouble(double[] p0, long p1, double p2) {}
    static void putFloat(java.lang.Object p0, long p1, float p2) {}
    static void putFloat(float[] p0, long p1, float p2) {}
    static void putInt(long p0, int p1) {}
    static void putInt(java.lang.Object p0, long p1, int p2) {}
    static void putInt(int[] p0, long p1, int p2) {}
    static void putLong(long p0, long p1) {}
    static void putLong(java.lang.Object p0, long p1, long p2) {}
    static void putLong(long[] p0, long p1, long p2) {}
    static void putObject(java.lang.Object p0, long p1, java.lang.Object p2) {}
    static void putObject(java.lang.Object[] p0, long p1, java.lang.Object p2) {}
    private static boolean supportsUnsafeArrayOperations() { return false; }
    private static boolean supportsUnsafeByteBufferOperations() { return false; }

    private static final class Android32MemoryAccessor extends com.android.framework.protobuf.UnsafeUtil.MemoryAccessor {
        private static final long SMALL_ADDRESS_MASK = -1L;
        Android32MemoryAccessor(sun.misc.Unsafe p0) { super(null); }
        private static int smallAddress(long p0) { return 0; }
        public void copyMemory(long p0, byte[] p1, long p2, long p3) {}
        public void copyMemory(byte[] p0, long p1, long p2, long p3) {}
        public boolean getBoolean(java.lang.Object p0, long p1) { return false; }
        public byte getByte(long p0) { return 0; }
        public byte getByte(java.lang.Object p0, long p1) { return 0; }
        public double getDouble(java.lang.Object p0, long p1) { return 0.0; }
        public float getFloat(java.lang.Object p0, long p1) { return 0.0f; }
        public int getInt(long p0) { return 0; }
        public long getLong(long p0) { return 0L; }
        public java.lang.Object getStaticObject(java.lang.reflect.Field p0) { return null; }
        public void putBoolean(java.lang.Object p0, long p1, boolean p2) {}
        public void putByte(long p0, byte p1) {}
        public void putByte(java.lang.Object p0, long p1, byte p2) {}
        public void putDouble(java.lang.Object p0, long p1, double p2) {}
        public void putFloat(java.lang.Object p0, long p1, float p2) {}
        public void putInt(long p0, int p1) {}
        public void putLong(long p0, long p1) {}
        public boolean supportsUnsafeByteBufferOperations() { return false; }
    }

    private static final class Android64MemoryAccessor extends com.android.framework.protobuf.UnsafeUtil.MemoryAccessor {
        Android64MemoryAccessor(sun.misc.Unsafe p0) { super(null); }
        public void copyMemory(long p0, byte[] p1, long p2, long p3) {}
        public void copyMemory(byte[] p0, long p1, long p2, long p3) {}
        public boolean getBoolean(java.lang.Object p0, long p1) { return false; }
        public byte getByte(long p0) { return 0; }
        public byte getByte(java.lang.Object p0, long p1) { return 0; }
        public double getDouble(java.lang.Object p0, long p1) { return 0.0; }
        public float getFloat(java.lang.Object p0, long p1) { return 0.0f; }
        public int getInt(long p0) { return 0; }
        public long getLong(long p0) { return 0L; }
        public java.lang.Object getStaticObject(java.lang.reflect.Field p0) { return null; }
        public void putBoolean(java.lang.Object p0, long p1, boolean p2) {}
        public void putByte(long p0, byte p1) {}
        public void putByte(java.lang.Object p0, long p1, byte p2) {}
        public void putDouble(java.lang.Object p0, long p1, double p2) {}
        public void putFloat(java.lang.Object p0, long p1, float p2) {}
        public void putInt(long p0, int p1) {}
        public void putLong(long p0, long p1) {}
        public boolean supportsUnsafeByteBufferOperations() { return false; }
    }

    private static final class JvmMemoryAccessor extends com.android.framework.protobuf.UnsafeUtil.MemoryAccessor {
        JvmMemoryAccessor(sun.misc.Unsafe p0) { super(null); }
        public void copyMemory(long p0, byte[] p1, long p2, long p3) {}
        public void copyMemory(byte[] p0, long p1, long p2, long p3) {}
        public boolean getBoolean(java.lang.Object p0, long p1) { return false; }
        public byte getByte(long p0) { return 0; }
        public byte getByte(java.lang.Object p0, long p1) { return 0; }
        public double getDouble(java.lang.Object p0, long p1) { return 0.0; }
        public float getFloat(java.lang.Object p0, long p1) { return 0.0f; }
        public int getInt(long p0) { return 0; }
        public long getLong(long p0) { return 0L; }
        public java.lang.Object getStaticObject(java.lang.reflect.Field p0) { return null; }
        public void putBoolean(java.lang.Object p0, long p1, boolean p2) {}
        public void putByte(long p0, byte p1) {}
        public void putByte(java.lang.Object p0, long p1, byte p2) {}
        public void putDouble(java.lang.Object p0, long p1, double p2) {}
        public void putFloat(java.lang.Object p0, long p1, float p2) {}
        public void putInt(long p0, int p1) {}
        public void putLong(long p0, long p1) {}
        public boolean supportsUnsafeArrayOperations() { return false; }
        public boolean supportsUnsafeByteBufferOperations() { return false; }
    }

    private static abstract class MemoryAccessor {
        MemoryAccessor(sun.misc.Unsafe p0) {}
        public final int arrayBaseOffset(java.lang.Class<?> p0) { return 0; }
        public final int arrayIndexScale(java.lang.Class<?> p0) { return 0; }
        public abstract void copyMemory(long p0, byte[] p1, long p2, long p3);
        public abstract void copyMemory(byte[] p0, long p1, long p2, long p3);
        public abstract boolean getBoolean(java.lang.Object p0, long p1);
        public abstract byte getByte(long p0);
        public abstract byte getByte(java.lang.Object p0, long p1);
        public abstract double getDouble(java.lang.Object p0, long p1);
        public abstract float getFloat(java.lang.Object p0, long p1);
        public abstract int getInt(long p0);
        public final int getInt(java.lang.Object p0, long p1) { return 0; }
        public abstract long getLong(long p0);
        public final long getLong(java.lang.Object p0, long p1) { return 0L; }
        public final java.lang.Object getObject(java.lang.Object p0, long p1) { return null; }
        public abstract java.lang.Object getStaticObject(java.lang.reflect.Field p0);
        public final long objectFieldOffset(java.lang.reflect.Field p0) { return 0L; }
        public abstract void putBoolean(java.lang.Object p0, long p1, boolean p2);
        public abstract void putByte(long p0, byte p1);
        public abstract void putByte(java.lang.Object p0, long p1, byte p2);
        public abstract void putDouble(java.lang.Object p0, long p1, double p2);
        public abstract void putFloat(java.lang.Object p0, long p1, float p2);
        public abstract void putInt(long p0, int p1);
        public final void putInt(java.lang.Object p0, long p1, int p2) {}
        public abstract void putLong(long p0, long p1);
        public final void putLong(java.lang.Object p0, long p1, long p2) {}
        public final void putObject(java.lang.Object p0, long p1, java.lang.Object p2) {}
        public boolean supportsUnsafeArrayOperations() { return false; }
        public boolean supportsUnsafeByteBufferOperations() { return false; }
    }
}
