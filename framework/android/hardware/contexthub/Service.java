package android.hardware.contexthub;

public class Service implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.Service> CREATOR = null;
    public final android.os.ParcelableHolder extendedInfo = null;
    public int format;
    public int majorVersion;
    public int minorVersion;
    public java.lang.String serviceDescriptor;
    public Service() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface RpcFormat {
        public static final int AIDL = 1;
        public static final int CUSTOM = 0;
        public static final int PW_RPC_PROTOBUF = 2;
    }
}
