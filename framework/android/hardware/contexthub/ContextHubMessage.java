package android.hardware.contexthub;

public class ContextHubMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.ContextHubMessage> CREATOR = null;
    public char hostEndPoint;
    public boolean isReliable;
    public byte[] messageBody;
    public int messageSequenceNumber;
    public int messageType;
    public long nanoappId;
    public java.lang.String[] permissions;
    public ContextHubMessage() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
