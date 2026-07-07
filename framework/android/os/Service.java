package android.os;

public final class Service implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.Service> CREATOR = null;
    public static final int accessor = 1;
    public static final int serviceWithMetadata = 0;
    private int _tag;
    private java.lang.Object _value;
    public Service() {}
    private Service(int p0, java.lang.Object p1) {}
    private Service(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.os.Service accessor(android.os.IBinder p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.os.Service serviceWithMetadata(android.os.ServiceWithMetadata p0) { return null; }
    public int describeContents() { return 0; }
    public android.os.IBinder getAccessor() { return null; }
    public android.os.ServiceWithMetadata getServiceWithMetadata() { return null; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setAccessor(android.os.IBinder p0) {}
    public void setServiceWithMetadata(android.os.ServiceWithMetadata p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int accessor = 1;
        public static final int serviceWithMetadata = 0;
    }
}
