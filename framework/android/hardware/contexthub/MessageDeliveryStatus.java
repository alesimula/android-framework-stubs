package android.hardware.contexthub;

public class MessageDeliveryStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.MessageDeliveryStatus> CREATOR = null;
    public byte errorCode;
    public int messageSequenceNumber;
    public MessageDeliveryStatus() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
