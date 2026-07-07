package android.app.people;

public final class ParcelUtils {
    private static final int MAX_COLLECTION_SIZE = 2048;
    private static final int MAX_RECURSION_DEPTH = 256;
    private ParcelUtils() {}
    public static int checkCollectionSize(int p0) { return 0; }
    public static int checkRecursionDepth(int p0) { return 0; }
    public static java.util.List<java.lang.Integer> readIntList(android.os.Parcel p0) { return null; }
    public static <V extends java.lang.Object> java.util.Map<java.lang.Integer, V> readIntMap(android.os.Parcel p0, int p1, java.util.function.BiFunction<android.os.Parcel, java.lang.Integer, V> p2) { return null; }
    public static <T extends java.lang.Object> java.util.List<T> readTypedList(android.os.Parcel p0, int p1, java.util.function.BiFunction<android.os.Parcel, java.lang.Integer, T> p2) { return null; }
    public static <T extends java.lang.Object> T readTypedObject(android.os.Parcel p0, int p1, java.util.function.BiFunction<android.os.Parcel, java.lang.Integer, T> p2) { return null; }
    public static void writeIntList(java.util.List<java.lang.Integer> p0, android.os.Parcel p1, int p2) {}
    public static <V extends android.os.Parcelable> void writeIntMap(java.util.Map<java.lang.Integer, V> p0, android.os.Parcel p1, int p2) {}
}
