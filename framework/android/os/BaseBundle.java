package android.os;

public class BaseBundle implements android.os.Parcel.ClassLoaderProvider {
    static final int BUNDLE_MAGIC = 1279544898;
    private static final int BUNDLE_MAGIC_NATIVE = 1279544900;
    static final boolean DEBUG = false;
    static final int FLAG_DEFUSABLE = 1;
    private static final boolean LOG_DEFUSABLE = false;
    protected static final java.lang.String TAG = "Bundle";
    private static volatile boolean sShouldDefuse;
    private java.lang.ClassLoader mClassLoader;
    public int mFlags;
    private boolean mHasIntent;
    private int mLazyValues;
    android.util.ArrayMap<java.lang.String, java.lang.Object> mMap;
    boolean mOwnsLazyValues;
    private boolean mParcelledByNative;
    volatile android.os.Parcel mParcelledData;
    private java.lang.ref.WeakReference<android.os.Parcel> mWeakParcelledData;
    BaseBundle() {}
    BaseBundle(int p0) {}
    BaseBundle(android.os.BaseBundle p0) {}
    BaseBundle(android.os.BaseBundle p0, boolean p1) {}
    BaseBundle(android.os.Parcel p0) {}
    BaseBundle(android.os.Parcel p0, int p1) {}
    BaseBundle(java.lang.ClassLoader p0) {}
    BaseBundle(java.lang.ClassLoader p0, int p1) {}
    private java.lang.Object deepCopyValue(java.lang.Object p0) { return null; }
    private java.util.ArrayList deepcopyArrayList(java.util.ArrayList p0) { return null; }
    public static void dumpStats(com.android.internal.util.IndentingPrintWriter p0, android.os.BaseBundle p1) {}
    public static void dumpStats(com.android.internal.util.IndentingPrintWriter p0, android.util.SparseArray p1) {}
    public static void dumpStats(com.android.internal.util.IndentingPrintWriter p0, java.lang.String p1, java.lang.Object p2) {}
    private void initializeFromParcelLocked(android.os.Parcel p0, boolean p1, boolean p2) {}
    private static boolean isEmptyParcel(android.os.Parcel p0) { return false; }
    public static boolean kindofEquals(android.os.BaseBundle p0, android.os.BaseBundle p1) { return false; }
    private void readFromParcelInner(android.os.Parcel p0, int p1) {}
    public static void setShouldDefuse(boolean p0) {}
    private java.lang.Object unwrapLazyValueFromMapLocked(int p0, java.lang.Class<?> p1, java.lang.Class<?>... p2) { return null; }
    public void clear() {}
    public boolean containsKey(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    public java.lang.Object get(java.lang.String p0) { return null; }
    <T extends java.lang.Object> T get(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    <T extends java.lang.Object> java.util.ArrayList<T> getArrayList(java.lang.String p0, java.lang.Class<? extends T> p1) { return null; }
    public boolean getBoolean(java.lang.String p0) { return false; }
    public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    public boolean[] getBooleanArray(java.lang.String p0) { return null; }
    byte getByte(java.lang.String p0) { return 0; }
    java.lang.Byte getByte(java.lang.String p0, byte p1) { return null; }
    public byte[] getByteArray(java.lang.String p0) { return null; }
    char getChar(java.lang.String p0) { return 0; }
    char getChar(java.lang.String p0, char p1) { return 0; }
    char[] getCharArray(java.lang.String p0) { return null; }
    java.lang.CharSequence getCharSequence(java.lang.String p0) { return null; }
    java.lang.CharSequence getCharSequence(java.lang.String p0, java.lang.CharSequence p1) { return null; }
    java.lang.CharSequence[] getCharSequenceArray(java.lang.String p0) { return null; }
    java.util.ArrayList<java.lang.CharSequence> getCharSequenceArrayList(java.lang.String p0) { return null; }
    public java.lang.ClassLoader getClassLoader() { return null; }
    public double getDouble(java.lang.String p0) { return 0.0; }
    public double getDouble(java.lang.String p0, double p1) { return 0.0; }
    public double[] getDoubleArray(java.lang.String p0) { return null; }
    float getFloat(java.lang.String p0) { return 0.0f; }
    float getFloat(java.lang.String p0, float p1) { return 0.0f; }
    float[] getFloatArray(java.lang.String p0) { return null; }
    public int getInt(java.lang.String p0) { return 0; }
    public int getInt(java.lang.String p0, int p1) { return 0; }
    public int[] getIntArray(java.lang.String p0) { return null; }
    java.util.ArrayList<java.lang.Integer> getIntegerArrayList(java.lang.String p0) { return null; }
    android.util.ArrayMap<java.lang.String, java.lang.Object> getItemwiseMap() { return null; }
    public long getLong(java.lang.String p0) { return 0L; }
    public long getLong(java.lang.String p0, long p1) { return 0L; }
    public long[] getLongArray(java.lang.String p0) { return null; }
    public java.lang.String getPairValue() { return null; }
    @java.lang.Deprecated
    java.io.Serializable getSerializable(java.lang.String p0) { return null; }
    <T extends java.io.Serializable> T getSerializable(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    short getShort(java.lang.String p0) { return 0; }
    short getShort(java.lang.String p0, short p1) { return 0; }
    short[] getShortArray(java.lang.String p0) { return null; }
    public int getSize() { return 0; }
    public java.lang.String getString(java.lang.String p0) { return null; }
    public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String[] getStringArray(java.lang.String p0) { return null; }
    java.util.ArrayList<java.lang.String> getStringArrayList(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    final java.lang.Object getValue(java.lang.String p0) { return null; }
    final <T extends java.lang.Object> T getValue(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    final <T extends java.lang.Object> T getValue(java.lang.String p0, java.lang.Class<T> p1, java.lang.Class<?>... p2) { return null; }
    final <T extends java.lang.Object> T getValueAt(int p0, java.lang.Class<T> p1, java.lang.Class<?>... p2) { return null; }
    public boolean hasIntent() { return false; }
    public boolean isDefinitelyEmpty() { return false; }
    public boolean isEmpty() { return false; }
    public boolean isEmptyParcel() { return false; }
    public boolean isParcelled() { return false; }
    public boolean isValueParceled(java.lang.String p0) { return false; }
    public java.util.Set<java.lang.String> keySet() { return null; }
    public boolean kindofEquals(android.os.BaseBundle p0) { return false; }
    public void putAll(android.os.PersistableBundle p0) {}
    void putAll(android.util.ArrayMap p0) {}
    public void putBoolean(java.lang.String p0, boolean p1) {}
    public void putBooleanArray(java.lang.String p0, boolean[] p1) {}
    void putByte(java.lang.String p0, byte p1) {}
    public void putByteArray(java.lang.String p0, byte[] p1) {}
    void putChar(java.lang.String p0, char p1) {}
    void putCharArray(java.lang.String p0, char[] p1) {}
    void putCharSequence(java.lang.String p0, java.lang.CharSequence p1) {}
    void putCharSequenceArray(java.lang.String p0, java.lang.CharSequence[] p1) {}
    void putCharSequenceArrayList(java.lang.String p0, java.util.ArrayList<java.lang.CharSequence> p1) {}
    public void putDouble(java.lang.String p0, double p1) {}
    public void putDoubleArray(java.lang.String p0, double[] p1) {}
    void putFloat(java.lang.String p0, float p1) {}
    void putFloatArray(java.lang.String p0, float[] p1) {}
    public void putInt(java.lang.String p0, int p1) {}
    public void putIntArray(java.lang.String p0, int[] p1) {}
    void putIntegerArrayList(java.lang.String p0, java.util.ArrayList<java.lang.Integer> p1) {}
    public void putLong(java.lang.String p0, long p1) {}
    public void putLongArray(java.lang.String p0, long[] p1) {}
    public void putObject(java.lang.String p0, java.lang.Object p1) {}
    void putSerializable(java.lang.String p0, java.io.Serializable p1) {}
    void putShort(java.lang.String p0, short p1) {}
    void putShortArray(java.lang.String p0, short[] p1) {}
    public void putString(java.lang.String p0, java.lang.String p1) {}
    public void putStringArray(java.lang.String p0, java.lang.String[] p1) {}
    void putStringArrayList(java.lang.String p0, java.util.ArrayList<java.lang.String> p1) {}
    void readFromParcelInner(android.os.Parcel p0) {}
    public void remove(java.lang.String p0) {}
    void setClassLoader(java.lang.ClassLoader p0) {}
    public void setHasIntent(boolean p0) {}
    public int size() { return 0; }
    void typeWarning(java.lang.String p0, java.lang.Object p1, java.lang.String p2, java.lang.Object p3, java.lang.RuntimeException p4) {}
    void typeWarning(java.lang.String p0, java.lang.Object p1, java.lang.String p2, java.lang.RuntimeException p3) {}
    void typeWarning(java.lang.String p0, java.lang.String p1, java.lang.RuntimeException p2) {}
    final void unparcel() {}
    final void unparcel(boolean p0) {}
    void writeToParcelInner(android.os.Parcel p0, int p1) {}

    static final class NoImagePreloadHolder {
        public static final android.os.Parcel EMPTY_PARCEL = null;
        NoImagePreloadHolder() {}
    }
}
