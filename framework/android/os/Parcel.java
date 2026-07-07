package android.os;

public final class Parcel {
    private static final int ARRAY_ALLOCATION_LIMIT = 1000000;
    private static final boolean DEBUG_ARRAY_MAP = false;
    private static final boolean DEBUG_RECYCLE = false;
    private static final int EX_BAD_PARCELABLE = -2;
    public static final int EX_HAS_NOTED_APPOPS_REPLY_HEADER = -127;
    private static final int EX_HAS_STRICTMODE_REPLY_HEADER = -128;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_SERVICE_SPECIFIC = -8;
    private static final int EX_TRANSACTION_FAILED = -129;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    public static final int FLAG_IS_REPLY_FROM_BLOCKING_ALLOWED_OBJECT = 1;
    public static final int FLAG_PROPAGATE_ALLOW_BLOCKING = 2;
    private static final int OK = 0;
    private static final long PARCEL_HARDENING = 416031865L;
    private static final int POOL_SIZE = 32;
    private static final int SIZE_BOOLEAN = 4;
    private static final int SIZE_BYTE = 1;
    private static final int SIZE_CHAR = 2;
    private static final int SIZE_COMPLEX_TYPE = 1;
    private static final int SIZE_DOUBLE = 8;
    private static final int SIZE_FLOAT = 4;
    private static final int SIZE_INT = 4;
    private static final int SIZE_LONG = 8;
    private static final int SIZE_SHORT = 2;
    public static final android.os.Parcelable.Creator<java.lang.String> STRING_CREATOR = null;
    private static final java.lang.String TAG = "Parcel";
    private static final int VAL_BOOLEAN = 9;
    private static final int VAL_BOOLEANARRAY = 23;
    private static final int VAL_BUNDLE = 3;
    private static final int VAL_BYTE = 20;
    private static final int VAL_BYTEARRAY = 13;
    private static final int VAL_CHAR = 29;
    private static final int VAL_CHARARRAY = 31;
    private static final int VAL_CHARSEQUENCE = 10;
    private static final int VAL_CHARSEQUENCEARRAY = 24;
    private static final int VAL_DOUBLE = 8;
    private static final int VAL_DOUBLEARRAY = 28;
    private static final int VAL_FLOAT = 7;
    private static final int VAL_FLOATARRAY = 32;
    private static final int VAL_IBINDER = 15;
    private static final int VAL_INTARRAY = 18;
    private static final int VAL_INTEGER = 1;
    private static final int VAL_LIST = 11;
    private static final int VAL_LONG = 6;
    private static final int VAL_LONGARRAY = 19;
    private static final int VAL_MAP = 2;
    private static final int VAL_NULL = -1;
    private static final int VAL_OBJECTARRAY = 17;
    private static final int VAL_PARCELABLE = 4;
    private static final int VAL_PARCELABLEARRAY = 16;
    private static final int VAL_PERSISTABLEBUNDLE = 25;
    private static final int VAL_SERIALIZABLE = 21;
    private static final int VAL_SHORT = 5;
    private static final int VAL_SHORTARRAY = 30;
    private static final int VAL_SIZE = 26;
    private static final int VAL_SIZEF = 27;
    private static final int VAL_SPARSEARRAY = 12;
    private static final int VAL_SPARSEBOOLEANARRAY = 22;
    private static final int VAL_STRING = 0;
    private static final int VAL_STRINGARRAY = 14;
    private static final int WRITE_EXCEPTION_STACK_TRACE_THRESHOLD_MS = 1000;
    private static final java.util.HashMap<java.lang.ClassLoader, java.util.HashMap<java.lang.String, android.os.Parcelable.Creator<?>>> mCreators = null;
    private static android.os.Parcel sHolderPool;
    private static int sHolderPoolSize;
    private static volatile long sLastWriteExceptionStackTrace;
    private static android.os.Parcel sOwnedPool;
    private static int sOwnedPoolSize;
    private static final java.util.HashMap<java.lang.ClassLoader, java.util.HashMap<java.lang.String, android.util.Pair<android.os.Parcelable.Creator<?>, java.lang.Class<?>>>> sPairedCreators = null;
    private static boolean sParcelExceptionStackTrace;
    private static final java.lang.Object sPoolSync = null;
    private boolean mAllowSquashing;
    private android.util.ArrayMap<java.lang.Class, java.lang.Object> mClassCookies;
    private int mFlags;
    private long mNativePtr;
    private long mNativeSize;
    private boolean mOwnsNativeParcelObject;
    private android.os.Parcel mPoolNext;
    private android.util.SparseArray<android.os.Parcelable> mReadSquashableParcelables;
    private android.os.Parcel.ReadWriteHelper mReadWriteHelper;
    private boolean mRecycled;
    private java.lang.RuntimeException mStack;
    private android.util.ArrayMap<android.os.Parcelable, java.lang.Integer> mWrittenSquashableParcelables;
    private Parcel(long p0) {}
    private void assertNotRecycled() {}
    private void checkArrayTypeToUnparcel(java.lang.Class<?> p0, java.lang.Class<?> p1) {}
    private void checkTypeToUnparcel(java.lang.Class<?> p0, java.lang.Class<?> p1) {}
    public static boolean compareData(android.os.Parcel p0, int p1, android.os.Parcel p2, int p3, int p4) { return false; }
    private java.lang.Exception createException(int p0, java.lang.String p1) { return null; }
    private void ensureClassHasExpectedDimensions(java.lang.Class<?> p0, int p1) {}
    private void ensureReadSquashableParcelables() {}
    private void ensureWithinMemoryLimit(int p0, int p1) {}
    private void ensureWithinMemoryLimit(int p0, int... p1) {}
    private void ensureWrittenSquashableParcelables() {}
    private void errorUsedWhileRecycling() {}
    private void freeBuffer() {}
    private static java.lang.ClassLoader getClassLoader(android.os.Parcel.ClassLoaderProvider p0) { return null; }
    public static int getExceptionCode(java.lang.Throwable p0) { return 0; }
    public static native long getGlobalAllocCount();
    public static native long getGlobalAllocSize();
    private static <T extends java.lang.Object> int getItemTypeSize(java.lang.Class<T> p0) { return 0; }
    public static int getValueType(java.lang.Object p0) { return 0; }
    public static boolean hasFileDescriptors(java.lang.Object p0) { return false; }
    private boolean hasFlags(int p0) { return false; }
    private void init(long p0) {}
    private boolean isLengthPrefixed(int p0) { return false; }
    private static void makeAccessible(java.lang.reflect.AccessibleObject p0) {}
    private static void makeAccessible$ravenwood(java.lang.reflect.AccessibleObject p0) {}
    private void markForBinder(android.os.IBinder p0) {}
    private static native void nativeAppendFrom(long p0, long p1, int p2, int p3);
    private static native int nativeCompareData(long p0, long p1);
    private static native boolean nativeCompareDataInRange(long p0, int p1, long p2, int p3, int p4);
    private static native long nativeCreate();
    private static native byte[] nativeCreateByteArray(long p0);
    private static native int nativeDataAvail(long p0);
    private static native int nativeDataCapacity(long p0);
    private static native int nativeDataPosition(long p0);
    private static native int nativeDataSize(long p0);
    private static native void nativeDestroy(long p0);
    private static native void nativeEnforceInterface(long p0, java.lang.String p1);
    private static native void nativeFreeBuffer(long p0);
    private static native long nativeGetOpenAshmemSize(long p0);
    private static native boolean nativeHasBinders(long p0);
    private static native boolean nativeHasBindersInRange(long p0, int p1, int p2);
    private static native boolean nativeHasFileDescriptors(long p0);
    private static native boolean nativeHasFileDescriptorsInRange(long p0, int p1, int p2);
    private static native boolean nativeIsForRpc(long p0);
    private static native void nativeMarkForBinder(long p0, android.os.IBinder p1);
    private static native void nativeMarkSensitive(long p0);
    private static native byte[] nativeMarshall(long p0);
    private static native int nativeMarshallArray(long p0, byte[] p1, int p2, int p3);
    private static native int nativeMarshallBuffer(long p0, java.nio.ByteBuffer p1, int p2, int p3);
    private static native boolean nativePushAllowFds(long p0, boolean p1);
    private static native byte[] nativeReadBlob(long p0);
    private static native boolean nativeReadByteArray(long p0, byte[] p1, int p2);
    private static native int nativeReadCallingWorkSourceUid(long p0);
    private static native double nativeReadDouble(long p0);
    private static native java.io.FileDescriptor nativeReadFileDescriptor(long p0);
    private static native float nativeReadFloat(long p0);
    private static native int nativeReadInt(long p0);
    private static native long nativeReadLong(long p0);
    private static native java.lang.String nativeReadString16(long p0);
    private static native java.lang.String nativeReadString8(long p0);
    private static native android.os.IBinder nativeReadStrongBinder(long p0);
    private static native boolean nativeReplaceCallingWorkSourceUid(long p0, int p1);
    private static native void nativeRestoreAllowFds(long p0, boolean p1);
    private static native void nativeSetDataCapacity(long p0, int p1);
    private static native void nativeSetDataPosition(long p0, int p1);
    private static native void nativeSetDataSize(long p0, int p1);
    private static native void nativeSignalExceptionForError(int p0);
    private static native void nativeUnmarshall(long p0, byte[] p1, int p2, int p3);
    private static native void nativeUnmarshallBuffer(long p0, java.nio.ByteBuffer p1, int p2, int p3);
    private static native void nativeWriteBlob(long p0, byte[] p1, int p2, int p3);
    private static native void nativeWriteByteArray(long p0, byte[] p1, int p2, int p3);
    private static native int nativeWriteDouble(long p0, double p1);
    private static native void nativeWriteFileDescriptor(long p0, java.io.FileDescriptor p1);
    private static native int nativeWriteFloat(long p0, float p1);
    private static native int nativeWriteInt(long p0, int p1);
    private static native void nativeWriteInterfaceToken(long p0, java.lang.String p1);
    private static native int nativeWriteLong(long p0, long p1);
    private static native void nativeWriteString16(long p0, java.lang.String p1);
    private static native void nativeWriteString8(long p0, java.lang.String p1);
    private static native void nativeWriteStrongBinder(long p0, android.os.IBinder p1);
    public static android.os.Parcel obtain() { return null; }
    protected static final android.os.Parcel obtain(int p0) { return null; }
    protected static final android.os.Parcel obtain(long p0) { return null; }
    public static android.os.Parcel obtain(android.os.IBinder p0) { return null; }
    private void readArrayInternal(java.lang.Object[] p0, int p1, java.lang.ClassLoader p2) {}
    private <T extends java.lang.Object> T[] readArrayInternal(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    private <T extends java.lang.Object> java.util.ArrayList<T> readArrayListInternal(java.lang.ClassLoader p0, java.lang.Class<? extends T> p1) { return null; }
    private void readArrayMapInternal(android.util.ArrayMap<? super java.lang.String, java.lang.Object> p0, int p1, android.os.Parcel.ClassLoaderProvider p2) {}
    private <K extends java.lang.Object, V extends java.lang.Object> java.util.HashMap<K, V> readHashMapInternal(java.lang.ClassLoader p0, java.lang.Class<? extends K> p1, java.lang.Class<? extends V> p2) { return null; }
    private java.lang.Object readLazyValue(android.os.Parcel.ClassLoaderProvider p0) { return null; }
    private void readListInternal(java.util.List p0, int p1, java.lang.ClassLoader p2) {}
    private <T extends java.lang.Object> void readListInternal(java.util.List<? super T> p0, int p1, java.lang.ClassLoader p2, java.lang.Class<T> p3) {}
    private <K extends java.lang.Object, V extends java.lang.Object> void readMapInternal(java.util.Map<? super K, ? super V> p0, int p1, java.lang.ClassLoader p2, java.lang.Class<K> p3, java.lang.Class<V> p4) {}
    private <K extends java.lang.Object, V extends java.lang.Object> void readMapInternal(java.util.Map<? super K, ? super V> p0, java.lang.ClassLoader p1, java.lang.Class<K> p2, java.lang.Class<V> p3) {}
    private <T extends java.lang.Object> T[] readParcelableArrayInternal(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    private <T extends java.lang.Object> android.os.Parcelable.Creator<T> readParcelableCreatorInternal(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    private <T extends java.lang.Object> T readParcelableInternal(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    private <T extends java.lang.Object> java.util.List<T> readParcelableListInternal(java.util.List<T> p0, java.lang.ClassLoader p1, java.lang.Class<? extends T> p2) { return null; }
    private <T extends java.lang.Object> T readSerializableInternal(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    private <T extends java.lang.Object> android.util.SparseArray<T> readSparseArrayInternal(java.lang.ClassLoader p0, java.lang.Class<? extends T> p1) { return null; }
    private void readSparseArrayInternal(android.util.SparseArray p0, int p1, java.lang.ClassLoader p2) {}
    private void readSparseBooleanArrayInternal(android.util.SparseBooleanArray p0, int p1) {}
    private void readSparseIntArrayInternal(android.util.SparseIntArray p0, int p1) {}
    private <T extends java.lang.Object> T readValue(int p0, java.lang.ClassLoader p1, java.lang.Class<T> p2) { return null; }
    private <T extends java.lang.Object> T readValue(int p0, java.lang.ClassLoader p1, java.lang.Class<T> p2, java.lang.Class<?>... p3) { return null; }
    private <T extends java.lang.Object> T readValue(java.lang.ClassLoader p0, java.lang.Class<T> p1, java.lang.Class<?>... p2) { return null; }
    private void resetSqaushingState() {}
    public static void setStackTraceParceling(boolean p0) {}
    private static java.lang.String valueTypeToString(int p0) { return null; }
    private void writeException$ravenwood(java.lang.Exception p0) {}
    private <T extends java.lang.Object> void writeFixedArrayInternal(T p0, int p1, int p2, int[] p3) {}
    private void writeNoException$ravenwood() {}
    public void addFlags(int p0) {}
    public final void adoptClassCookies(android.os.Parcel p0) {}
    public boolean allowSquashing() { return false; }
    public final void appendFrom(android.os.Parcel p0, int p1, int p2) {}
    public int compareData(android.os.Parcel p0) { return 0; }
    public java.util.Map<java.lang.Class, java.lang.Object> copyClassCookies() { return null; }
    public final android.os.IBinder[] createBinderArray() { return null; }
    public final java.util.ArrayList<android.os.IBinder> createBinderArrayList() { return null; }
    public final boolean[] createBooleanArray() { return null; }
    public final byte[] createByteArray() { return null; }
    public final char[] createCharArray() { return null; }
    public final double[] createDoubleArray() { return null; }
    public java.lang.Exception createExceptionOrNull(int p0, java.lang.String p1) { return null; }
    public <T extends java.lang.Object, S extends android.os.Parcelable> T createFixedArray(java.lang.Class<T> p0, android.os.Parcelable.Creator<S> p1, int... p2) { return null; }
    public <T extends java.lang.Object, S extends android.os.IInterface> T createFixedArray(java.lang.Class<T> p0, java.util.function.Function<android.os.IBinder, S> p1, int... p2) { return null; }
    public <T extends java.lang.Object> T createFixedArray(java.lang.Class<T> p0, int... p1) { return null; }
    public final float[] createFloatArray() { return null; }
    public final int[] createIntArray() { return null; }
    public final <T extends android.os.IInterface> T[] createInterfaceArray(java.util.function.IntFunction<T[]> p0, java.util.function.Function<android.os.IBinder, T> p1) { return null; }
    public final <T extends android.os.IInterface> java.util.ArrayList<T> createInterfaceArrayList(java.util.function.Function<android.os.IBinder, T> p0) { return null; }
    public final long[] createLongArray() { return null; }
    public final java.io.FileDescriptor[] createRawFileDescriptorArray() { return null; }
    public short[] createShortArray() { return null; }
    public final java.lang.String[] createString16Array() { return null; }
    public final java.lang.String[] createString8Array() { return null; }
    public final java.lang.String[] createStringArray() { return null; }
    public final java.util.ArrayList<java.lang.String> createStringArrayList() { return null; }
    public final <T extends java.lang.Object> T[] createTypedArray(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends java.lang.Object> java.util.ArrayList<T> createTypedArrayList(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends android.os.Parcelable> android.util.ArrayMap<java.lang.String, T> createTypedArrayMap(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends android.os.Parcelable> android.util.SparseArray<T> createTypedSparseArray(android.os.Parcelable.Creator<T> p0) { return null; }
    public final int dataAvail() { return 0; }
    public final int dataCapacity() { return 0; }
    public final int dataPosition() { return 0; }
    public int dataSize() { return 0; }
    public void destroy() {}
    public final void enforceInterface(java.lang.String p0) {}
    public void enforceNoDataAvail() {}
    protected void finalize() throws java.lang.Throwable {}
    public final java.lang.Object getClassCookie(java.lang.Class p0) { return null; }
    public int getFlags() { return 0; }
    public long getOpenAshmemSize() { return 0L; }
    public boolean hasBinders() { return false; }
    public boolean hasBinders(int p0, int p1) { return false; }
    public boolean hasClassCookie(java.lang.Class p0) { return false; }
    public boolean hasFileDescriptors() { return false; }
    public boolean hasFileDescriptors(int p0, int p1) { return false; }
    public boolean hasReadWriteHelper() { return false; }
    public final boolean isForRpc() { return false; }
    public final void markSensitive() {}
    public final void marshall(java.nio.ByteBuffer p0) {}
    public final byte[] marshall() { return null; }
    public boolean maybeWriteSquashed(android.os.Parcelable p0) { return false; }
    public final boolean pushAllowFds(boolean p0) { return false; }
    public void putClassCookies(java.util.Map<java.lang.Class, java.lang.Object> p0) {}
    @java.lang.Deprecated
    public java.lang.Object[] readArray(java.lang.ClassLoader p0) { return null; }
    public <T extends java.lang.Object> T[] readArray(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    @java.lang.Deprecated
    public java.util.ArrayList readArrayList(java.lang.ClassLoader p0) { return null; }
    public <T extends java.lang.Object> java.util.ArrayList<T> readArrayList(java.lang.ClassLoader p0, java.lang.Class<? extends T> p1) { return null; }
    void readArrayMap(android.util.ArrayMap<? super java.lang.String, java.lang.Object> p0, int p1, boolean p2, boolean p3, android.os.Parcel.ClassLoaderProvider p4, int[] p5) {}
    public void readArrayMap(android.util.ArrayMap<? super java.lang.String, java.lang.Object> p0, android.os.Parcel.ClassLoaderProvider p1) {}
    public android.util.ArraySet<? extends java.lang.Object> readArraySet(java.lang.ClassLoader p0) { return null; }
    public final void readBinderArray(android.os.IBinder[] p0) {}
    public final void readBinderList(java.util.List<android.os.IBinder> p0) {}
    public final byte[] readBlob() { return null; }
    public final boolean readBoolean() { return false; }
    public final void readBooleanArray(boolean[] p0) {}
    public final android.os.Bundle readBundle() { return null; }
    public final android.os.Bundle readBundle(java.lang.ClassLoader p0) { return null; }
    public final byte readByte() { return 0; }
    public final void readByteArray(byte[] p0) {}
    public int readCallingWorkSourceUid() { return 0; }
    public final void readCharArray(char[] p0) {}
    public final java.lang.CharSequence readCharSequence() { return null; }
    public final java.lang.CharSequence[] readCharSequenceArray() { return null; }
    public final java.util.ArrayList<java.lang.CharSequence> readCharSequenceList() { return null; }
    public final <T extends android.os.Parcelable> T readCreator(android.os.Parcelable.Creator<?> p0, java.lang.ClassLoader p1) { return null; }
    public final double readDouble() { return 0.0; }
    public final void readDoubleArray(double[] p0) {}
    public final void readException() {}
    public final void readException(int p0, java.lang.String p1) {}
    public final int readExceptionCode() { return 0; }
    public final android.os.ParcelFileDescriptor readFileDescriptor() { return null; }
    public <T extends java.lang.Object> void readFixedArray(T p0) {}
    public <T extends java.lang.Object, S extends android.os.Parcelable> void readFixedArray(T p0, android.os.Parcelable.Creator<S> p1) {}
    public <T extends java.lang.Object, S extends android.os.IInterface> void readFixedArray(T p0, java.util.function.Function<android.os.IBinder, S> p1) {}
    public final float readFloat() { return 0.0f; }
    public final void readFloatArray(float[] p0) {}
    @java.lang.Deprecated
    public java.util.HashMap readHashMap(java.lang.ClassLoader p0) { return null; }
    public <K extends java.lang.Object, V extends java.lang.Object> java.util.HashMap<K, V> readHashMap(java.lang.ClassLoader p0, java.lang.Class<? extends K> p1, java.lang.Class<? extends V> p2) { return null; }
    public final int readInt() { return 0; }
    public final void readIntArray(int[] p0) {}
    public final <T extends android.os.IInterface> void readInterfaceArray(T[] p0, java.util.function.Function<android.os.IBinder, T> p1) {}
    public final <T extends android.os.IInterface> void readInterfaceList(java.util.List<T> p0, java.util.function.Function<android.os.IBinder, T> p1) {}
    @java.lang.Deprecated
    public final void readList(java.util.List p0, java.lang.ClassLoader p1) {}
    public <T extends java.lang.Object> void readList(java.util.List<? super T> p0, java.lang.ClassLoader p1, java.lang.Class<T> p2) {}
    public final long readLong() { return 0L; }
    public final void readLongArray(long[] p0) {}
    @java.lang.Deprecated
    public final void readMap(java.util.Map p0, java.lang.ClassLoader p1) {}
    public <K extends java.lang.Object, V extends java.lang.Object> void readMap(java.util.Map<? super K, ? super V> p0, java.lang.ClassLoader p1, java.lang.Class<K> p2, java.lang.Class<V> p3) {}
    void readMapInternal(java.util.Map p0, int p1, java.lang.ClassLoader p2) {}
    @java.lang.Deprecated
    public final <T extends android.os.Parcelable> T readParcelable(java.lang.ClassLoader p0) { return null; }
    public <T extends java.lang.Object> T readParcelable(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    @java.lang.Deprecated
    public android.os.Parcelable[] readParcelableArray(java.lang.ClassLoader p0) { return null; }
    public <T extends java.lang.Object> T[] readParcelableArray(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    @java.lang.Deprecated
    public final android.os.Parcelable.Creator<?> readParcelableCreator(java.lang.ClassLoader p0) { return null; }
    public <T extends java.lang.Object> android.os.Parcelable.Creator<T> readParcelableCreator(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    @java.lang.Deprecated
    public final <T extends android.os.Parcelable> java.util.List<T> readParcelableList(java.util.List<T> p0, java.lang.ClassLoader p1) { return null; }
    public <T extends java.lang.Object> java.util.List<T> readParcelableList(java.util.List<T> p0, java.lang.ClassLoader p1, java.lang.Class<? extends T> p2) { return null; }
    public final android.os.PersistableBundle readPersistableBundle() { return null; }
    public final android.os.PersistableBundle readPersistableBundle(java.lang.ClassLoader p0) { return null; }
    public final java.io.FileDescriptor readRawFileDescriptor() { return null; }
    public final void readRawFileDescriptorArray(java.io.FileDescriptor[] p0) {}
    @java.lang.Deprecated
    public java.io.Serializable readSerializable() { return null; }
    public <T extends java.lang.Object> T readSerializable(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    public void readShortArray(short[] p0) {}
    public final android.util.Size readSize() { return null; }
    public final android.util.SizeF readSizeF() { return null; }
    @java.lang.Deprecated
    public <T extends java.lang.Object> android.util.SparseArray<T> readSparseArray(java.lang.ClassLoader p0) { return null; }
    public <T extends java.lang.Object> android.util.SparseArray<T> readSparseArray(java.lang.ClassLoader p0, java.lang.Class<? extends T> p1) { return null; }
    public final android.util.SparseBooleanArray readSparseBooleanArray() { return null; }
    public final android.util.SparseIntArray readSparseIntArray() { return null; }
    public <T extends android.os.Parcelable> T readSquashed(android.os.Parcel.SquashReadHelper<T> p0) { return null; }
    public final java.lang.String readString() { return null; }
    public final java.lang.String readString16() { return null; }
    public final void readString16Array(java.lang.String[] p0) {}
    public java.lang.String readString16NoHelper() { return null; }
    public final java.lang.String readString8() { return null; }
    public final void readString8Array(java.lang.String[] p0) {}
    public java.lang.String readString8NoHelper() { return null; }
    public final void readStringArray(java.lang.String[] p0) {}
    public final java.lang.String[] readStringArray() { return null; }
    public final void readStringList(java.util.List<java.lang.String> p0) {}
    public java.lang.String readStringNoHelper() { return null; }
    public final android.os.IBinder readStrongBinder() { return null; }
    public android.os.IBinder readStrongBinderNoHelper() { return null; }
    public final <T extends java.lang.Object> void readTypedArray(T[] p0, android.os.Parcelable.Creator<T> p1) {}
    @java.lang.Deprecated
    public final <T extends java.lang.Object> T[] readTypedArray(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends java.lang.Object> void readTypedList(java.util.List<T> p0, android.os.Parcelable.Creator<T> p1) {}
    public final <T extends java.lang.Object> T readTypedObject(android.os.Parcelable.Creator<T> p0) { return null; }
    public final java.lang.Object readValue(java.lang.ClassLoader p0) { return null; }
    public final void recycle() {}
    public void removeClassCookie(java.lang.Class p0, java.lang.Object p1) {}
    public boolean replaceCallingWorkSourceUid(int p0) { return false; }
    public final void restoreAllowFds(boolean p0) {}
    public void restoreAllowSquashing(boolean p0) {}
    public final void setClassCookie(java.lang.Class p0, java.lang.Object p1) {}
    public final void setDataCapacity(int p0) {}
    public final void setDataPosition(int p0) {}
    public final void setDataSize(int p0) {}
    public void setFlags(int p0) {}
    public void setPropagateAllowBlocking() {}
    public void setReadWriteHelper(android.os.Parcel.ReadWriteHelper p0) {}
    public final void unmarshall(java.nio.ByteBuffer p0) {}
    public final void unmarshall(byte[] p0, int p1, int p2) {}
    public final void writeArray(java.lang.Object[] p0) {}
    public void writeArrayMap(android.util.ArrayMap<java.lang.String, java.lang.Object> p0) {}
    void writeArrayMapInternal(android.util.ArrayMap<java.lang.String, java.lang.Object> p0) {}
    public void writeArraySet(android.util.ArraySet<? extends java.lang.Object> p0) {}
    public final void writeBinderArray(android.os.IBinder[] p0) {}
    public final void writeBinderList(java.util.List<android.os.IBinder> p0) {}
    public final void writeBlob(byte[] p0) {}
    public final void writeBlob(byte[] p0, int p1, int p2) {}
    public final void writeBoolean(boolean p0) {}
    public final void writeBooleanArray(boolean[] p0) {}
    public final void writeBundle(android.os.Bundle p0) {}
    public final void writeByte(byte p0) {}
    public final void writeByteArray(byte[] p0) {}
    public final void writeByteArray(byte[] p0, int p1, int p2) {}
    public final void writeCharArray(char[] p0) {}
    public final void writeCharSequence(java.lang.CharSequence p0) {}
    public final void writeCharSequenceArray(java.lang.CharSequence[] p0) {}
    public final void writeCharSequenceList(java.util.ArrayList<java.lang.CharSequence> p0) {}
    public final void writeDouble(double p0) {}
    public final void writeDoubleArray(double[] p0) {}
    public final void writeException(java.lang.Exception p0) {}
    public final void writeFileDescriptor(java.io.FileDescriptor p0) {}
    public <T extends java.lang.Object> void writeFixedArray(T p0, int p1, int... p2) {}
    public final void writeFloat(float p0) {}
    public final void writeFloatArray(float[] p0) {}
    public final void writeInt(int p0) {}
    public final void writeIntArray(int[] p0) {}
    public final <T extends android.os.IInterface> void writeInterfaceArray(T[] p0) {}
    public final <T extends android.os.IInterface> void writeInterfaceList(java.util.List<T> p0) {}
    public final void writeInterfaceToken(java.lang.String p0) {}
    public final void writeList(java.util.List p0) {}
    public final void writeLong(long p0) {}
    public final void writeLongArray(long[] p0) {}
    public final void writeMap(java.util.Map p0) {}
    void writeMapInternal(java.util.Map<java.lang.String, java.lang.Object> p0) {}
    public final void writeNoException() {}
    public final void writeParcelable(android.os.Parcelable p0, int p1) {}
    public final <T extends android.os.Parcelable> void writeParcelableArray(T[] p0, int p1) {}
    public final void writeParcelableCreator(android.os.Parcelable p0) {}
    public final <T extends android.os.Parcelable> void writeParcelableList(java.util.List<T> p0, int p1) {}
    public final void writePersistableBundle(android.os.PersistableBundle p0) {}
    public final void writeRawFileDescriptor(java.io.FileDescriptor p0) {}
    public final void writeRawFileDescriptorArray(java.io.FileDescriptor[] p0) {}
    public final void writeSerializable(java.io.Serializable p0) {}
    public void writeShortArray(short[] p0) {}
    public final void writeSize(android.util.Size p0) {}
    public final void writeSizeF(android.util.SizeF p0) {}
    public final <T extends java.lang.Object> void writeSparseArray(android.util.SparseArray<T> p0) {}
    public final void writeSparseBooleanArray(android.util.SparseBooleanArray p0) {}
    public final void writeSparseIntArray(android.util.SparseIntArray p0) {}
    public void writeStackTrace(java.lang.Throwable p0) {}
    public final void writeString(java.lang.String p0) {}
    public final void writeString16(java.lang.String p0) {}
    public final void writeString16Array(java.lang.String[] p0) {}
    public void writeString16NoHelper(java.lang.String p0) {}
    public final void writeString8(java.lang.String p0) {}
    public final void writeString8Array(java.lang.String[] p0) {}
    public void writeString8NoHelper(java.lang.String p0) {}
    public final void writeStringArray(java.lang.String[] p0) {}
    public final void writeStringList(java.util.List<java.lang.String> p0) {}
    public void writeStringNoHelper(java.lang.String p0) {}
    public final void writeStrongBinder(android.os.IBinder p0) {}
    public void writeStrongBinderNoHelper(android.os.IBinder p0) {}
    public final void writeStrongInterface(android.os.IInterface p0) {}
    public final <T extends android.os.Parcelable> void writeTypedArray(T[] p0, int p1) {}
    public <T extends android.os.Parcelable> void writeTypedArrayMap(android.util.ArrayMap<java.lang.String, T> p0, int p1) {}
    public final <T extends android.os.Parcelable> void writeTypedList(java.util.List<T> p0) {}
    public <T extends android.os.Parcelable> void writeTypedList(java.util.List<T> p0, int p1) {}
    public final <T extends android.os.Parcelable> void writeTypedObject(T p0, int p1) {}
    public final <T extends android.os.Parcelable> void writeTypedSparseArray(android.util.SparseArray<T> p0, int p1) {}
    public void writeValue(int p0, java.lang.Object p1) {}
    public final void writeValue(java.lang.Object p0) {}

    public static interface ClassLoaderProvider {
        public java.lang.ClassLoader getClassLoader();
    }

    private static final class LazyValue implements java.util.function.BiFunction<java.lang.Class<?>, java.lang.Class<?>[], java.lang.Object> {
        private final int mLength = 0;
        private final android.os.Parcel.ClassLoaderProvider mLoaderProvider = null;
        private java.lang.Object mObject;
        private final int mPosition = 0;
        private volatile android.os.Parcel mSource;
        private final int mType = 0;
        LazyValue(android.os.Parcel p0, int p1, int p2, int p3, android.os.Parcel.ClassLoaderProvider p4) {}
        public java.lang.Object apply(java.lang.Class<?> p0, java.lang.Class<?>[] p1) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.ClassLoader getClassLoader() { return null; }
        public boolean hasFileDescriptors() { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ParcelFlags {
    }

    public static class ReadWriteHelper {
        public static final android.os.Parcel.ReadWriteHelper DEFAULT = null;
        public ReadWriteHelper() {}
        public java.lang.String readString16(android.os.Parcel p0) { return null; }
        public java.lang.String readString8(android.os.Parcel p0) { return null; }
        public android.os.IBinder readStrongBinder(android.os.Parcel p0) { return null; }
        public void writeString16(android.os.Parcel p0, java.lang.String p1) {}
        public void writeString8(android.os.Parcel p0, java.lang.String p1) {}
        public void writeStrongBinder(android.os.Parcel p0, android.os.IBinder p1) {}
    }

    public static interface SquashReadHelper<T extends java.lang.Object> {
        public T readRawParceled(android.os.Parcel p0);
    }
}
