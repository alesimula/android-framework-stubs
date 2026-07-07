package android.hardware.location;

@android.annotation.SystemApi
public final class NanoAppMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppMessage> CREATOR = null;
    private static final int DEBUG_LOG_NUM_BYTES = 16;
    private boolean mIsBroadcasted;
    private boolean mIsReliable;
    private byte[] mMessageBody;
    private int mMessageSequenceNumber;
    private int mMessageType;
    private long mNanoAppId;
    private NanoAppMessage(long p0, int p1, byte[] p2, boolean p3, boolean p4, int p5) {}
    private NanoAppMessage(android.os.Parcel p0) {}
    public static android.hardware.location.NanoAppMessage createMessageFromNanoApp(long p0, int p1, byte[] p2, boolean p3) { return null; }
    public static android.hardware.location.NanoAppMessage createMessageFromNanoApp(long p0, int p1, byte[] p2, boolean p3, boolean p4, int p5) { return null; }
    public static android.hardware.location.NanoAppMessage createMessageToNanoApp(long p0, int p1, byte[] p2) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public byte[] getMessageBody() { return null; }
    public int getMessageSequenceNumber() { return 0; }
    public int getMessageType() { return 0; }
    public long getNanoAppId() { return 0L; }
    public int hashCode() { return 0; }
    public boolean isBroadcastMessage() { return false; }
    public boolean isReliable() { return false; }
    public void setIsReliable(boolean p0) {}
    public void setMessageSequenceNumber(int p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
