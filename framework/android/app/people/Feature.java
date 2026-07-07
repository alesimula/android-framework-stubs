package android.app.people;

@android.annotation.SystemApi
public final class Feature implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.Feature> CREATOR = null;
    public static final int KIND_BOOLEAN = 1;
    public static final int KIND_BYTES = 5;
    public static final int KIND_DOUBLE = 3;
    public static final int KIND_LONG = 2;
    public static final int KIND_STRING = 4;
    private final int mKind = 0;
    private final java.lang.Object mValues = null;
    private Feature(int p0, java.lang.Object p1) {}
    public static android.app.people.Feature booleanFeature(java.util.List<java.lang.Boolean> p0) { return null; }
    public static android.app.people.Feature booleanFeature(boolean... p0) { return null; }
    public static android.app.people.Feature bytesFeature(java.util.List<byte[]> p0) { return null; }
    public static android.app.people.Feature bytesFeature(byte[]... p0) { return null; }
    public static android.app.people.Feature doubleFeature(java.util.List<java.lang.Double> p0) { return null; }
    public static android.app.people.Feature doubleFeature(double... p0) { return null; }
    public static android.app.people.Feature longFeature(java.util.List<java.lang.Long> p0) { return null; }
    public static android.app.people.Feature longFeature(long... p0) { return null; }
    private static <T extends java.lang.Object> java.util.List<T> readListFromParcel(android.os.Parcel p0, java.lang.Class<T> p1) { return null; }
    public static android.app.people.Feature stringFeature(java.util.List<java.lang.String> p0) { return null; }
    public static android.app.people.Feature stringFeature(java.lang.String... p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<java.lang.Boolean> getBooleanValues() { return null; }
    public java.util.List<byte[]> getBytesValues() { return null; }
    public java.util.List<java.lang.Double> getDoubleValues() { return null; }
    public int getKind() { return 0; }
    public java.util.List<java.lang.Long> getLongValues() { return null; }
    public java.util.List<java.lang.String> getStringValues() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Kind {
    }
}
