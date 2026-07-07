package android.hardware.contexthub;

public class HostEndpointInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.HostEndpointInfo> CREATOR = null;
    public java.lang.String attributionTag;
    public char hostEndpointId;
    public java.lang.String packageName;
    public int type;
    public HostEndpointInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Type {
        public static final int APP = 2;
        public static final int FRAMEWORK = 1;
        public static final int NATIVE = 3;
    }
}
