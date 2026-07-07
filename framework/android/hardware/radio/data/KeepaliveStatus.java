package android.hardware.radio.data;

public class KeepaliveStatus implements android.os.Parcelable {
    public static final int CODE_ACTIVE = 0;
    public static final int CODE_INACTIVE = 1;
    public static final int CODE_PENDING = 2;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.KeepaliveStatus> CREATOR = null;
    public int code;
    public int sessionHandle;
    public KeepaliveStatus() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
