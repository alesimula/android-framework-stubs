package android.net.vcn.util;

public class PersistableBundleUtils {
    private static final java.lang.String BYTE_ARRAY_KEY = "BYTE_ARRAY_KEY";
    private static final java.lang.String COLLECTION_SIZE_KEY = "COLLECTION_LENGTH";
    public static final android.net.vcn.util.PersistableBundleUtils.Deserializer<java.lang.Integer> INTEGER_DESERIALIZER = null;
    private static final java.lang.String INTEGER_KEY = "INTEGER_KEY";
    public static final android.net.vcn.util.PersistableBundleUtils.Serializer<java.lang.Integer> INTEGER_SERIALIZER = null;
    private static final java.lang.String LIST_KEY_FORMAT = "LIST_ITEM_%d";
    private static final java.lang.String MAP_KEY_FORMAT = "MAP_KEY_%d";
    private static final java.lang.String MAP_VALUE_FORMAT = "MAP_VALUE_%d";
    private static final java.lang.String PARCEL_UUID_KEY = "PARCEL_UUID";
    public static final android.net.vcn.util.PersistableBundleUtils.Deserializer<java.lang.String> STRING_DESERIALIZER = null;
    private static final java.lang.String STRING_KEY = "STRING_KEY";
    public static final android.net.vcn.util.PersistableBundleUtils.Serializer<java.lang.String> STRING_SERIALIZER = null;
    public PersistableBundleUtils() {}
    public static android.os.PersistableBundle fromByteArray(byte[] p0) { return null; }
    public static android.os.PersistableBundle fromDiskStableBytes(byte[] p0) throws java.io.IOException { return null; }
    public static <T extends java.lang.Object> android.os.PersistableBundle fromList(java.util.List<T> p0, android.net.vcn.util.PersistableBundleUtils.Serializer<T> p1) { return null; }
    public static <K extends java.lang.Object, V extends java.lang.Object> android.os.PersistableBundle fromMap(java.util.Map<K, V> p0, android.net.vcn.util.PersistableBundleUtils.Serializer<K> p1, android.net.vcn.util.PersistableBundleUtils.Serializer<V> p2) { return null; }
    public static android.os.PersistableBundle fromParcelUuid(android.os.ParcelUuid p0) { return null; }
    public static int getHashCode(android.os.PersistableBundle p0) { return 0; }
    public static boolean isEqual(android.os.PersistableBundle p0, android.os.PersistableBundle p1) { return false; }
    public static android.os.PersistableBundle minimizeBundle(android.os.PersistableBundle p0, java.lang.String... p1) { return null; }
    public static byte[] toByteArray(android.os.PersistableBundle p0) { return null; }
    public static byte[] toDiskStableBytes(android.os.PersistableBundle p0) throws java.io.IOException { return null; }
    public static <T extends java.lang.Object> java.util.List<T> toList(android.os.PersistableBundle p0, android.net.vcn.util.PersistableBundleUtils.Deserializer<T> p1) { return null; }
    public static <K extends java.lang.Object, V extends java.lang.Object> java.util.LinkedHashMap<K, V> toMap(android.os.PersistableBundle p0, android.net.vcn.util.PersistableBundleUtils.Deserializer<K> p1, android.net.vcn.util.PersistableBundleUtils.Deserializer<V> p2) { return null; }
    public static android.os.ParcelUuid toParcelUuid(android.os.PersistableBundle p0) { return null; }

    public static interface Deserializer<T extends java.lang.Object> {
        public T fromPersistableBundle(android.os.PersistableBundle p0);
    }

    public static class LockingReadWriteHelper {
        private final java.util.concurrent.locks.ReadWriteLock mDiskLock = null;
        private final java.lang.String mPath = null;
        public LockingReadWriteHelper(java.lang.String p0) {}
        public android.os.PersistableBundle readFromDisk() throws java.io.IOException { return null; }
        public void writeToDisk(android.os.PersistableBundle p0) throws java.io.IOException {}
    }

    public static class PersistableBundleWrapper {
        private final android.os.PersistableBundle mBundle = null;
        public PersistableBundleWrapper(android.os.PersistableBundle p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int getInt(java.lang.String p0, int p1) { return 0; }
        public int[] getIntArray(java.lang.String p0, int[] p1) { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static interface Serializer<T extends java.lang.Object> {
        public android.os.PersistableBundle toPersistableBundle(T p0);
    }
}
