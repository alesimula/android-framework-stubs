package android.hardware.contexthub;

public class Message implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.Message> CREATOR = null;
    public static final int FLAG_REQUIRES_DELIVERY_STATUS = 1;
    public byte[] content;
    public int flags;
    public java.lang.String[] permissions;
    public int sequenceNumber;
    public int type;
    public Message() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
