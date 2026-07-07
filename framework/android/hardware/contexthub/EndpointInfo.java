package android.hardware.contexthub;

public class EndpointInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.EndpointInfo> CREATOR = null;
    public android.hardware.contexthub.EndpointId id;
    public java.lang.String name;
    public java.lang.String[] requiredPermissions;
    public android.hardware.contexthub.Service[] services;
    public android.hardware.contexthub.EndpointInfo.SharedDataSupportVersion sharedDataSupportVersion;
    public java.lang.String tag;
    public int type;
    public int version;
    public EndpointInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface EndpointType {
        public static final int APP = 2;
        public static final int FRAMEWORK = 1;
        public static final int GENERIC = 5;
        public static final int NANOAPP = 4;
        public static final int NATIVE = 3;
    }

    public static class SharedDataSupportVersion implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.contexthub.EndpointInfo.SharedDataSupportVersion> CREATOR = null;
        public byte minimumCompatibleMajorVersion;
        public android.hardware.contexthub.SharedDataRegion.Version version;
        public SharedDataSupportVersion() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
